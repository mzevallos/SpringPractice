package com.spring.pt2;

import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //Spring config without xml, just java code
// @ComponentScan("com.spring.pt2") - only necessary when using component annotation instead of beans
public class SportConfig {
	
	//define bean for sad fortune service
	@Bean //bean ID is the same as the method header
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	
	//define bean for swim coach and inject dependencies
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
