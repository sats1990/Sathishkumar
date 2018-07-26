package Sample1;

import Sample2.English;

public class Tamil extends English{
	public void TamilClass() {
	System.out.println("Tamil Class");

}
	public static void main(String[] args) {
		Tamil T = new Tamil();
		T.TamilClass();
		T.EnglishClass();
	}
}
