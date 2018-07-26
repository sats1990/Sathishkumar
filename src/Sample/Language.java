package Sample;

import Sample1.Tamil;

public class Language extends Tamil {
	public void AllLanguage() {
	System.out.println("Tamil, English,  Hindi");

}
	public static void main(String[] args) {
		Language L = new Language();
		L.AllLanguage();
		L.TamilClass();
		L.EnglishClass();
		L.HindiClass();
	}
}
