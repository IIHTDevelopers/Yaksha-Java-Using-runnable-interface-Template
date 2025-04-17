package com.yaksha.assignment;

public class RunnableExample {

	public static void main(String[] args) {
		// Task 1: Implement Runnable Interface
		MyRunnable runnable1 = new MyRunnable(); // Create instance of MyRunnable
		Thread thread1 = new Thread(runnable1); // Create thread by passing MyRunnable
		thread1.start(); // Start the thread

		// Task 2: Implement another Runnable task and start a new thread
		MyRunnable runnable2 = new MyRunnable(); // Create another instance of MyRunnable
		Thread thread2 = new Thread(runnable2); // Create another thread by passing MyRunnable
		thread2.start(); // Start the second thread
	}

	// Task 1: Custom Runnable class implementing Runnable interface
	static class MyRunnable implements Runnable {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " is running.");
		}
	}
}
