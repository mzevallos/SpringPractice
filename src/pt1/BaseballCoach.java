package com.spring.pt1;

public class BaseballCoach implements Coach{
	
	//instance variables for dependency
	private FortuneService fortuneService;
	
	public BaseballCoach() {}
	//constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout()
	{
		return "spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
