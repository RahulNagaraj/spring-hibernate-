package com.rahul.spring;

public class BaseballCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "30 minutes batting practice";
	}
}
