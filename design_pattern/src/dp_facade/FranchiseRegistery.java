package dp_facade;

public class FranchiseRegistery {
	
	private Franchise KFC;
	private Franchise McDonalds;
	private Franchise TimHortons;

	public FranchiseRegistery() {
		KFC = new KFC();
		McDonalds = new McDonalds();
		TimHortons = new TimHortons();
	}

	public void BuyKFCFranchise() {
		KFC.option();
		KFC.cost();
	}

	public void BuyMcDonaldsFranchise() {
		McDonalds.option();
		McDonalds.cost();
	}

	public void BuyTimhortonsFranchise() {
		TimHortons.option();
		TimHortons.cost();
	}
}
