package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Utility{

	private static String path = "com.mysql.cj.jdbc.Driver";
	private static Connection con = null;
	private static String url = "jdbc:mysql://localhost:3306/iplproject";
	private static String user = "root";
	private static String psw = "root";
	private static Statement st = null;

	public static Statement createConnection(){
		try{
			Class.forName(path);
			con = DriverManager.getConnection(url, user, psw);
			st = con.createStatement();
		}catch (ClassNotFoundException e){
			System.out.println(e);
		}catch (SQLException e) {
			System.out.println(e);
		}
		return st;
	}
	public static Connection createConnectionToInsert(){
		try{
			Class.forName(path);
			con = DriverManager.getConnection(url, user, psw);
		}catch (ClassNotFoundException e){
			System.out.println(e);
		}catch (SQLException e) {
			System.out.println(e);
		}
		return con;
	}

	public static void closeConnection() {
		try {
			if(st != null && con != null){
				st.close();
				con.close();
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
