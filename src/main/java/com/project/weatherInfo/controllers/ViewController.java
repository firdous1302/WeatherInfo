package com.project.weatherInfo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ViewController {
	
	
	@RequestMapping("/getWeatherView")
	
	public String getView() {
		
		return "WeatherView";
	}

}
