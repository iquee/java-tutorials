package br.com.luiztaira.threads.module2;

public class BuyingProducts {

	public static void main(String[] args) {
		String product = "iPhone";

		ProcessManagment pm = new ProcessManagment();

		new Thread(new ProcessToBuy(pm), product).start();
		new Thread(new ProcessToDelivery(pm), product).start();
	}

}
