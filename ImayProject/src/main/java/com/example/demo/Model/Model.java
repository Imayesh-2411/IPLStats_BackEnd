package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="IPL_stats")

public class Model {
	
	@Id
	private int sno;
	private String playerName;
	private int age;
	private String playerType;
	private float priceInCrs;
	private String team;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlayerType() {
		return playerType;
	}
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
	public float getPriceInCrs() {
		return priceInCrs;
	}
	public void setPriceInCrs(float priceInCrs) {
		this.priceInCrs = priceInCrs;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	
	public Model(int sno, String playerName, int age, String playerType, float priceInCrs, String team) {
		super();
		this.sno = sno;
		this.playerName = playerName;
		this.age = age;
		this.playerType = playerType;
		this.priceInCrs = priceInCrs;
		this.team = team;
	}
	public Model() {
		
	}
	public String toString() {
		return "S.No="+sno+"PlayerName="+playerName+"Age="+age+"PlayerType="+playerType+"Price="+priceInCrs+"Team="+team;
	}	
}
