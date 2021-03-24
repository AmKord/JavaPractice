package com.practice.multithreading;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

	public static final int UPPER_LIMIT = 5;
	public static final int LOWER_LIMIT = 0;
	private static int value = 0;
	private static List<Integer> lst = new ArrayList<>();
	public Object lock = new Object();

	public void producer() throws InterruptedException {

		synchronized (lock) {
			while (true) {
				if (lst.size() == UPPER_LIMIT) {
					// value = 0;
					System.out.println("[Producer] : Waiting for consumer to remove");
					lock.wait();
				} else {
					System.out.println("[Producer] : adding data "+value);
					lst.add(value++);
					lock.notify();
				}
				Thread.sleep(500);
			}
		}
	}

	public void consumer() throws InterruptedException {

		synchronized (lock) {
			while (true) {
				if (lst.size() == LOWER_LIMIT) {
					// value = 0;
					System.out.println("[Consumer] : Waiting for producer to add");
					lock.wait();
				} else {
					System.out.println("[Consumer] : removing data "+value);
					lst.remove(lst.size() - 1);
					value --;
					lock.notify();
				}
				Thread.sleep(500);
			}
		}
	}

	public static void main(String[] args) {

		ProducerConsumer obj = new ProducerConsumer();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					obj.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					obj.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		
		t1.start();
		t2.start();

	}

}
