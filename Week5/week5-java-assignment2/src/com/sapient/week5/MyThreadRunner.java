package com.sapient.week5;

public class MyThreadRunner {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		new Thread(() -> {
			
			System.out.println("Running : " + Thread.currentThread().getName());
			
			for(int i = 0; i < 10; i++) {
				try {
					TickTock.printTick();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(Thread.currentThread().getName() + " Ended");
			
		}, "Tick" ).start();
		System.out.println("Started : Tick");
		
		
		new Thread(() -> {
			
			System.out.println("Running : " + Thread.currentThread().getName());
			
			for(int i = 0; i < 10; i++) {
				try {
					TickTock.printTock();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(Thread.currentThread().getName() + " Ended");
			
		}, "Tock" ).start();
		System.out.println("Started Tock");
		
		System.out.println("Main Ended");
		
	}

}
