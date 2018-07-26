package Sample1;

public class ImmutableMutable {
public static void main(String[] args) {
	String s1 = "Greens";
	String s2 = "Technologies";
	System.out.println("Immutable String");
	String a = s1.concat(s2);
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	System.out.println(a);
	System.out.println("Mutable String");
	StringBuffer x1 = new StringBuffer("Greens");
	StringBuffer x2 = new StringBuffer("Technologies");
	x1.append(x2);
	System.out.println(System.identityHashCode(x1));
	System.out.println(System.identityHashCode(x2));
	System.out.println(x1);

}
}
