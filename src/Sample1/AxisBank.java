package Sample1;

// while creating abstract class we need to call by using "Extends" keyword
public class AxisBank extends Bank{

	@Override
	public void SavingAct() {
		System.out.println("5%");
		
	}

	@Override
	public void CurrentAct() {
		System.out.println("6%");
		
	}
public static void main(String[] args) {
	// we need to create object for sub class(Axis Bank) only
	AxisBank b = new AxisBank();
	b.SavingAct();
	b.CurrentAct();
	b.Branch();
}
}
