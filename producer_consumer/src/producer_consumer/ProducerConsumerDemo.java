package producer_consumer;

public class ProducerConsumerDemo {
	public static void main(String[] args) {

		Producer producer = new Producer();
		Thread t1 = new Thread(producer);
		t1.setName("Produccer-1");
		t1.start();

		Consumer consumer = new Consumer(producer);
		Thread t2 = new Thread(consumer);
		t2.setName("Consumer-1");
		t2.start();

	}
}
