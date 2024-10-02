package com.entity;

public class Player {

	private int jn;
	private String name;
	private String role;
	private int runs;
	private int wickets;
	private String t_name;
	
	public Player() {
		super();
	}

	public Player(int jn, String name,String role, int runs, int wickets, String t_name) {
		super();
		this.jn = jn;
		this.name = name;
		this.role = role;
		this.runs = runs;
		this.wickets = wickets;
		this.t_name = t_name;
	}

	public int getJn() {
		return jn;
	}

	public void setJn(int jn) {
		this.jn = jn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Player [jn=" + jn + ", name=" + name + ", t_name=" + t_name + "]";
	}
}
