package com.client;

import java.util.List;

import com.controller.PlayerController;
import com.entity.Player;

public class Client {
	public void Menu()
	{
		System.out.println("Welcome to IPL Project");
	}
	public static void main(String[] args) {
		PlayerController control = new PlayerController();
		List<Player> playerDB = control.getAllPlayer();
		for (Player player : playerDB) {
			System.out.printf("%-20s%-15s%-10s%-10d%-7d\n",player.getName(),player.getRole(),player.getT_name(),player.getRuns(),player.getWickets());
		}
		
//		List<Player> teamplayer = control.getTeamPlayer("cSk");
//		for (Player player : teamplayer) {
//			System.out.println(player);
//		}
//		control.insertPlayer(1);
//		control.updateName(1,"Devendra");
//		control.updateTName(512,"MI");
//		control.updateRuns(512, 1000);
//		control.updateWickets(512, 500);
//		List<Player> playersByRole = control.getPlayersByRole("all rounder");
//		for ( Player player : playersByRole) {
//			System.out.printf("%-20s%-15s%-5s%-10d%-7d\n",player.getName(),player.getRole(),player.getT_name(),player.getRuns(),player.getWickets());
//		}
	}
}
