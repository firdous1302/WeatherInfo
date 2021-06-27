package com.project.weatherInfo.beans;

import java.time.Instant;


public class Daily {
	
	
    private long dt;	
	
	private Temperature temp;
	
	private int humidity;

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public Instant getDt() {
		return Instant.ofEpochSecond(this.dt);
	}

	public void setDt(long dt) {
		this.dt = dt;
	}

	
	public Temperature getTemp() {
		return temp;
	}

	public void setTemp(Temperature temp) {
		this.temp = temp;
	}

	
	

}
