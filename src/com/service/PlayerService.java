package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.PlayerDao;
import com.entity.Player;

public class PlayerService {

	PlayerDao dao = null;
	Scanner sc = new Scanner(System.in);
	public List<Player> getAllPlayer(){
		dao = new PlayerDao();
		List<Player> playerDB = dao.getAllPlayer();
		return playerDB;
	}
	public void insertPlayer(int num){
		dao = new PlayerDao();
		int count = 1;
		while(num>0) {
		System.out.print(count+")\nEnter jersey number : ");
		int jn = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		System.out.print("Enter player name : ");
		String name = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter total runs : ");
		int runs = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		System.out.print("Enter total wickets : ");
		int wickets = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		System.out.print("Enter team name : ");
		String tname = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter player's role : ");
		String role = sc.nextLine();
		System.out.println();
		
		dao.insertPlayer(jn, name,role, runs, wickets, tname);
		System.out.print("Inserted Successfully...\n\n");
		count++;
		num--;
		}
	}
	public List<Player> getTeamPlayer(String team){
		dao = new PlayerDao();
		List<Player> playerDB = dao.getAllPlayer();
		List<Player> teamplayer = new ArrayList<Player>();
		for(Player player : playerDB)
		{
			if(player.getT_name().toLowerCase().equals(team.toLowerCase())) {
				teamplayer.add(player);
			}
		}
		return teamplayer;
	}
	public List<Player> getPlayersByRole(String role){
		dao = new PlayerDao();
		List<Player> playerDB = dao.getAllPlayer();
		List<Player> byroleplayer = new ArrayList<Player>();
		for(Player player : playerDB)
		{
			if(player.getRole().toLowerCase().equals(role.toLowerCase())) {
				byroleplayer.add(player);
			}
		}
		return byroleplayer;
	}
	public boolean updateName(int jn,String upname) {
		dao = new PlayerDao();
		dao.updateName(jn,upname);
		return true;
	}
	public boolean updateTName(int jn,String uptname) {
		dao = new PlayerDao();
		dao.updateTName(jn,uptname);
		return true;
	}
	public boolean updateRuns(int jn,int run) {
		dao = new PlayerDao();
		dao.updateRuns(jn,run);
		return true;
	}
	public boolean updateWickets(int jn,int wicket) {
		dao = new PlayerDao();
		dao.updateWickets(jn,wicket);
		return true;
	}
}
