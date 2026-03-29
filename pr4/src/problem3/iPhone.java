package problem3;

public class iPhone implements SellableAndPluggable {

	@Override
	public void plugIn() {
		System.out.println("iPhone is charging");
		
	}

	@Override
	public void sell() {
		System.out.println("iPhone is being sold");
		
	}

}

