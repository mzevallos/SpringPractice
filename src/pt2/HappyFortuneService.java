package com.spring.pt2;

import org.springframework.stereotype.Component;

@Component //no ID is specified so bean ID becomes happyFortuneService
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "Today is your lucky day!";
		
	}

}
