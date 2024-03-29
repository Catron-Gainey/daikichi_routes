package com.codingdojo.daikichiroutes.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@SpringBootApplication
	@RestController
	
	@RequestMapping("/daikichi")
	public class DaikichiController {
	    @RequestMapping("")
	    public String index(){
	      return "Welcome!";
	    }
	    @RequestMapping("/today")
	    public String hello(){
	      return "Today you will find luck in all your endeavors!";
	    }
	    @RequestMapping("/tomorrow")
	    public String world(){
	      return "Tomorrow an oppurtunity will arise, so be sure to be open to new ideas!";
	    }
	    @RequestMapping("/travel/{city}")
	    public String showCity(@PathVariable("city") String city) {
	    	return "Congratulations! You will soon travel to " + city;
	    }
	    @RequestMapping("/lotto/{number}")
	    public String showIntegerMessage(@PathVariable("number") int number) {
	    	if (number %2 == 0) {
	    	return "You will take a grand journey in the near future, but be weary of tempting offers";
	    	}else {
	    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	    	}
	    }
	}

