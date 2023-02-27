package producer_consumer;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Producer extends Thread {

	private static final int MAX_SIZE = 3;
	protected final List<String> message = new ArrayList<>();

	public void run() {
		try {
			while (true) {
				produce();
			}
		} catch (Exception e) {
		}
	}

	private synchronized void produce() throws Exception {
		while (message.size() == MAX_SIZE) {
			wait();
		}
		String data = LocalTime.now().toString();
		message.add(data);
		System.out.println("Producer produced data");
		notify();
	}

	public synchronized String consume() throws Exception {
		notify();
		while (message.isEmpty()) {
			wait();
		}
		String data = message.get(0);
		message.remove(0);
		return data;
	}

}
