package Sample1;

public class TestString {
public static void main(String[] args) {
	String a1 = "Greens";
	String a2 = "Tech";
	System.out.println("Immutable String");
	String a = a1.concat(a2);
	System.out.println(System.identityHashCode(a1));
	System.out.println(System.identityHashCode(a2));
	System.out.println(a);
	System.out.println("Mutable String");
	StringBuffer b1 = new StringBuffer("Greens");
	StringBuffer b2 = new StringBuffer("Tech");
	b1.append(b2);
	System.out.println(System.identityHashCode(b1));
	System.out.println(System.identityHashCode(b2));
	System.out.println(b1);
}
}
