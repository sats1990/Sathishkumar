package Sample1;

public class SampleWork {
public static void main(String[] args) {
	String a1 = "Greens";
	String a2= "Greens";
	System.out.println("Literal String");
	System.out.println(System.identityHashCode(a1));
	System.out.println(System.identityHashCode(a2));
	System.out.println("Non Literal string");
	String s1 = new String("Greens");
	String s2 = new String("Greens");
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
}
}
