package br.com.luiztaira.threads.module2;

public class ProcessManagment {

	public void processOrderToBuy() {
		String name = Thread.currentThread().getName();
		
		synchronized (this) {
			System.out.println("1 " + name + " - buying product");
			System.out.println("2 " + name + " - order received");
			System.out.println("3 " + name + " - check if available");
		}
	}

	public synchronized void processOrderToDelivery() {
		String name = Thread.currentThread().getName();
		System.out.println("4 " + name + " - packing product");
		System.out.println("5 " + name + " - delivering product");
		System.out.println("6 " + name + " - product delivered");
	}
}
