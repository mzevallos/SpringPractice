package com.spring.pt2;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create String array
	private String [] data = {
			"You will get better at Spring the more you code",
			"Hard work pays off later. Lazy work pays off now.",
			"You must try, or hate yourself for not trying."
	};
	
	@Override
	public String getFortune() {
		int i = (int)(Math.ceil(Math.random()*3)) - 1;
		return data[i] + "\nRandom value in Array: " + i;
	}

}
