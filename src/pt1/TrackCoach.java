package com.spring.pt1;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//add init method
	public void startEverything() {
		System.out.println("execute code on bean initialization");
	}
	
	//add destroy method
	public void destroyEverything() {
		System.out.println("execute code before the bean lifecycle ends");
	}
}
