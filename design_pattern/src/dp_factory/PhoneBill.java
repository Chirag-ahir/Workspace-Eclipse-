package dp_factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneBill {
	public static void main(String args[]) throws IOException {
		
		SelectNetwork planFactory = new SelectNetwork();
		
		System.out.print("Enter the name of network for which the bill will be generated: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String networkName = br.readLine();
		
		cellularplan p = planFactory.getPlan(networkName);
		
		System.out.print("Enter the number of minutes for bill will be calculated: ");
		int minutes = Integer.parseInt(br.readLine());
		
		System.out.print("Bill amount for " + networkName + " of " + minutes + " units is: ");
		p.getRate();
		p.processBill(minutes);
		
	}
}
