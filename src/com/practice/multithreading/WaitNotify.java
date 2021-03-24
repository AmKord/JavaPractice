package com.practice.multithreading;

public class WaitNotify {
	
	private Object lock = new Object();

	public void consume() throws InterruptedException {

		synchronized (lock) {
			System.out.println("Consume " +Thread.currentThread());
			lock.wait();
			System.out.println("Consume Again "+Thread.currentThread());
		}
		
	}

	public void produce() {

		synchronized (lock) {
			System.out.println("Produce "+Thread.currentThread());
			lock.notify();
		}

	}

	public static void main(String[] args) {
		System.out.println("Wait Notify Example");
		WaitNotify process = new WaitNotify();
		Thread t1 = new Thread(

				new Runnable() {

					@Override
					public void run() {
						try {
							process.consume();
						} catch (InterruptedException e) {

							e.printStackTrace();
						}

					}

				}

		);
		Thread t2 = new Thread(

				new Runnable() {

					@Override
					public void run() {

						process.produce();

					}

				}

		);
		
		t1.start();
		t2.start();
	}

}
