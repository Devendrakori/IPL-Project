package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.entity.Player;
import com.utility.Utility;

public class PlayerDao {
	
	Player player = null;
	ResultSet rs = null;
	List<Player> playerDB = null;
	
	public List<Player> getAllPlayer(){
		playerDB = new ArrayList<Player>();
		String query = "SELECT * FROM Player";
		try {
			rs = Utility.createConnection().executeQuery(query);
			while(rs.next())
			{
				int jn = rs.getInt("JN");
				String name = rs.getString("Name");
				String role = rs.getNString("Role");
				int runs = rs.getInt("Runs");
				int wickets = rs.getInt("Wickets");
				String tname = rs.getString("T_Name");
				player = new Player(jn,name,role,runs,wickets,tname);
				playerDB.add(player);
			}
			Utility.closeConnection();
			rs.close();
		}catch(SQLException e) {
			System.out.println(e);
		}
		return playerDB;
	}
	public boolean insertPlayer(int jn,String name,String role,int runs,int wickets,String tname){
		player = new Player(jn,name,role,runs,wickets,tname);
		String query = "INSERT INTO player VALUES("+player.getJn()+",'"+player.getName()+"',"+player.getRuns()+","+player.getWickets()+",'"+player.getT_name()+"','"+player.getRole()+"')";
		try {
			Utility.createConnectionToInsert().prepareStatement(query).execute();
			Utility.closeConnection();
		}catch(SQLException e)
		{
			System.out.println(e);
		}
		return true;
	}
	public boolean updateName(int jn,String upname){
		String query = "UPDATE player SET Name ='"+upname+"' WHERE jn ="+jn;
		try {
			Utility.createConnectionToInsert().prepareStatement(query).execute();
			Utility.closeConnection();
		}catch(SQLException e)
		{
			System.out.println(e);
		}
		return true;
	}
	public boolean updateTName(int jn,String uptname){
		String query = "UPDATE player SET T_Name ='"+uptname+"' WHERE jn ="+jn;
		try {
			Utility.createConnectionToInsert().prepareStatement(query).execute();
			Utility.closeConnection();
		}catch(SQLException e)
		{
			System.out.println(e);
		}
		return true;
	}
	public boolean updateRuns(int jn,int run){
		String query = "UPDATE player SET Runs ="+run+" WHERE jn ="+jn;
		try {
			Utility.createConnectionToInsert().prepareStatement(query).execute();
			Utility.closeConnection();
		}catch(SQLException e)
		{
			System.out.println(e);
		}
		return true;
	}
	public boolean updateWickets(int jn,int wicket){
		String query = "UPDATE player SET Wickets ="+wicket+" WHERE jn ="+jn;
		try {
			Utility.createConnectionToInsert().prepareStatement(query).execute();
			Utility.closeConnection();
		}catch(SQLException e)
		{
			System.out.println(e);
		}
		return true;
	}
}
