package com.controller;

import java.util.List;
import com.entity.Player;
import com.service.PlayerService;

public class PlayerController {

	PlayerService service = null;
	public List<Player> getAllPlayer(){
		service = new PlayerService();
		List<Player> playerDB = service.getAllPlayer();
		return playerDB;
	}
	public List<Player> getTeamPlayer(String team){
		service = new PlayerService();
		List<Player> teamplayer = service.getTeamPlayer(team);
		return teamplayer;
	}
	public void insertPlayer(int num){
		service = new PlayerService();
		service.insertPlayer(num);
	}
}
