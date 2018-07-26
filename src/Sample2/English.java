package Sample2;

import Sample3.Hindi;

public class English extends Hindi{
	public void EnglishClass() {
	System.out.println("English Class");

}
	public static void main(String[] args) {
		English E = new English();
		E.EnglishClass();
		E.HindiClass();
	}
}
