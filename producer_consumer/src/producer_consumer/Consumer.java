package producer_consumer;

public class Consumer extends Thread {
	private Producer producer; // producer object

	//Constructor of consumer class
	public Consumer(Producer producer) {
		this.producer = producer;
	}

	public void run() {
		try {
			while (true) {
				String data = producer.consume();
				System.out.println("Consumed by: " + Thread.currentThread().getName() + " data" + data);
				Thread.sleep(500);
			}
		} catch (Exception e) {
		}
	}

}
