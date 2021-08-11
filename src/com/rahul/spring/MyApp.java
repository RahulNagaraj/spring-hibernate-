package com.rahul.spring;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coach coach = new BaseballCoach();
		System.out.println(coach.getDailyWorkout());
		
//		Coach coach = new TrackCoach();
//		System.out.println(coach.getDailyWorkout());
		
	}
}
