package com.testvagrant.utils;

import java.util.ArrayList;

public class TeamsModel {

	 public String name;
	    public String location;
	    public ArrayList<PlayersModel> player;
		
	  
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public ArrayList<PlayersModel> getPlayer() {
			return player;
		}
		public void setPlayer(ArrayList<PlayersModel> player) {
			this.player = player;
		}
	    
	    
}
