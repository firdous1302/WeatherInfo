package com.project.weatherInfo.controllers;



import java.text.ParseException;


import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project.weatherInfo.beans.Daily;

import com.project.weatherInfo.beans.Weather;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${api.key}")
	private String apiKey;
	
	@RequestMapping("/getWarmestDay")
	public Daily getWarmestDay(@RequestParam double latitude,@RequestParam double longitude) throws ParseException {
		
		String url="https://api.openweathermap.org/data/2.5/onecall?lat="+latitude+"&lon="+longitude+"&appid="+apiKey;
		
		Weather weather=restTemplate.getForObject(url, Weather.class);
					
		List<Daily> dailyList=weather.getDaily();
		
		
	    Iterator<Daily> iterator=dailyList.iterator();
	    
	    float max=dailyList.get(0).getTemp().getMax();
	     
	    Daily dailyMax=dailyList.get(0);
	    
	  
	    while(iterator.hasNext()) {
	    	
	    	Daily d=iterator.next();
	    	float maxNew=d.getTemp().getMax();
	    	if(maxNew>max) {
	    		max=maxNew;
	    		dailyMax=d;
	    	}
	    	
	    }
	    

	    int newIndex=dailyList.indexOf(dailyMax);
	    
	    float minHumid=dailyList.get(newIndex).getHumidity();
	    
        
	    for(int i=newIndex+1; i<dailyList.size(); i++) {
	    	
	    	float maxNow=dailyList.get(i).getTemp().getMax();
	    	
	    	float humidNow=dailyList.get(i).getHumidity();
	    
	    	if(maxNow==max && humidNow<minHumid ) {
	    		
	    		dailyMax=dailyList.get(i);
	    	}
        	
	    }
	    
	    
		
		return dailyMax;
		
		
	}
	
	
	@RequestMapping("/getAllDays")
	public List<Daily> getAllDays(@RequestParam double latitude,@RequestParam double longitude) throws ParseException {
		
      String url="https://api.openweathermap.org/data/2.5/onecall?lat="+latitude+"&lon="+longitude+"&appid="+apiKey;
		
		Weather weather=restTemplate.getForObject(url, Weather.class);
		
	
		return weather.getDaily();
		
	}

	

}
