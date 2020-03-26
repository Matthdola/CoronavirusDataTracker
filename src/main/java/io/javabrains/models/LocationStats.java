package io.javabrains.models;

public class LocationStats {
	private String state;
	private String country;
	private int latestTotalCases;
	private int diffFromPreviousDay;
	private double Latitude;
	private double Longitude;
	private int recovered;
	private int active;
	private int confirmed;
	private int deaths;

	public LocationStats(String state, String country, int latestTotalCases) {
		super();
		this.state = state;
		this.country = country;
		this.latestTotalCases = latestTotalCases;
	}
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}


	public int getDiffFromPreviousDay() {
		return diffFromPreviousDay;
	}


	public void setDiffFromPreviousDay(int diffFromPreviousDay) {
		this.diffFromPreviousDay = diffFromPreviousDay;
	}
	
	public int getDeaths() {
		return deaths;
	}


	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}


	public int getConfirmed() {
		return confirmed;
	}


	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}


	public LocationStats() {
		super();
	}
	
	
	public double getLatitude() {
		return Latitude;
	}


	public void setLatitude(double latitude) {
		Latitude = latitude;
	}


	public double getLongitude() {
		return Longitude;
	}


	public void setLongitude(double longitude) {
		Longitude = longitude;
	}


	public int getRecovered() {
		return recovered;
	}


	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}


	public int getActive() {
		return active;
	}


	public void setActive(int active) {
		this.active = active;
	}
	
	
}
