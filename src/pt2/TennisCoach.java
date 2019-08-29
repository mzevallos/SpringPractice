package com.spring.pt2;

import org.springframework.stereotype.Component;

@Component("bean_id_tennis")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
