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
		
		dao.insertPlayer(jn, name, runs, wickets, tname);
		System.out.print("Inserted Successfully...\n\n");
		count++;
		num--;
		}
	}
}
