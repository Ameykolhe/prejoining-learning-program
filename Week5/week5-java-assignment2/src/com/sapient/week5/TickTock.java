package com.sapient.week5;

class TickTock {

	private static volatile boolean tickPrinted = false;
	
	public static synchronized void printTick() throws InterruptedException {
	
		while (tickPrinted) {
			TickTock.class.wait();
		}
		System.out.print(Thread.currentThread().getName() + " ");
		tickPrinted = true;
		TickTock.class.notify();

	}
	
	public static synchronized void printTock() throws InterruptedException {
	
		while (!tickPrinted) {
			TickTock.class.wait();
		}
		System.out.println(Thread.currentThread().getName());
		tickPrinted = false;
		TickTock.class.notify();
	
	}
}