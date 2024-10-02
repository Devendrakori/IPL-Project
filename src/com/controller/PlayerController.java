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
	public void insertPlayer(int num){
		service = new PlayerService();
		service.insertPlayer(num);
	}
	public List<Player> getTeamPlayer(String team){
		service = new PlayerService();
		List<Player> teamplayer = service.getTeamPlayer(team);
		return teamplayer;
	}
	public List<Player> getPlayersByRole(String role){
		service = new PlayerService();
		List<Player> playerbyrole = service.getPlayersByRole(role);
		return playerbyrole;
	}
	public boolean updateName(int jn,String upname) {
		service = new PlayerService();
		service.updateName(jn,upname);
		return true;
	}
	public boolean updateTName(int jn,String uptname) {
		service = new PlayerService();
		service.updateTName(jn,uptname);
		return true;
	}
	public boolean updateRuns(int jn,int run) {
		service = new PlayerService();
		service.updateRuns(jn,run);
		return true;
	}
	public boolean updateWickets(int jn,int wicket) {
		service = new PlayerService();
		service.updateWickets(jn,wicket);
		return true;
	}
}
