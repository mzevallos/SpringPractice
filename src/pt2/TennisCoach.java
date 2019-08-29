package com.spring.pt2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //no ID is specified so bean ID becomes tennisCoach
public class TennisCoach implements Coach {
	
	@Autowired //Field injection bypassing the need for setter and constructor injection
	@Qualifier("randomFortuneService") //give bean ID of the bean you want Spring to use
	private FortuneService fortuneService;
	
	public TennisCoach() {
	}
	
	/*
	@Autowired //Setter injection using @Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	@Autowired //Spring looks for a component(happyFortuneService) that implements the FortuneService interface
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
