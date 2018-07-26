package Sample;

public class AxisBank extends Bank {
	@Override
	public void SavingAct() {
		System.out.println("5%");
		
	}

	@Override
	public void CurrentAct() {
		System.out.println("Current Rate is:"+ 6);
	}
	public static void main(String[] args) {
		AxisBank b = new AxisBank();
		b.SavingAct();
		b.CurrentAct();
	}

}
