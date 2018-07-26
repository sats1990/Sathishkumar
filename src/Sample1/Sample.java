package Sample1;

public class Sample{
public static void main(String[] args) {
	String a1 = "GoodMorning";
	String a2 = "GoodMorning";
	System.out.println("Literal String");;
	System.out.println(System.identityHashCode(a1));
	System.out.println(System.identityHashCode(a2));
	System.out.println("Non Literal String");
	String x1 = new String("Greens");
	String x2 = new String("Greens");
	System.out.println(System.identityHashCode(x1));
	System.out.println(System.identityHashCode(x2));
	
}
}
