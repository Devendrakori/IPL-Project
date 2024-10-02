package com.client;

import java.util.List;

import com.controller.PlayerController;
import com.entity.Player;

public class Client {
	public static void main(String[] args) {
		PlayerController control = new PlayerController();
//		List<Player> playerDB = control.getAllPlayer();
//		System.out.println(playerDB);
//		List<Player> teamplayer = control.getTeamPlayer("csk");
//		for (Player player : teamplayer) {
//			System.out.println(player);
//		}
		control.insertPlayer(1);
	}
}
