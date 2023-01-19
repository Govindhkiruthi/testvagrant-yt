package com.testvagrant.utils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayersModel {
	 public String name;
	    public String country;
	    public String role;
	    @JsonProperty("price-in-crores")
	    public double priceincrores; 

		public double getPriceincrores() {
			return priceincrores;
		}

		public void setPriceincrores(double priceincrores) {
			this.priceincrores = priceincrores;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		
	    
	    
}
