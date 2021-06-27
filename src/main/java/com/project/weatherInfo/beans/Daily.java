package com.project.weatherInfo.beans;

import java.time.Instant;
import java.util.List;

public class Daily {
	
	
    private long dt;	
	
	private long sunrise;	
	
	private long sunset;	
	/*
	 * private long dt; private long dt; private long dt;
	 
	 */
	
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

	public long getSunrise() {
		return sunrise;
	}

	public void setSunrise(long sunrise) {
		this.sunrise = sunrise;
	}

	public long getSunset() {
		return sunset;
	}

	public void setSunset(long sunset) {
		this.sunset = sunset;
	}

	public Temperature getTemp() {
		return temp;
	}

	public void setTemp(Temperature temp) {
		this.temp = temp;
	}

	
	

}
