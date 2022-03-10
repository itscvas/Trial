package org.windows;

public class Alerts {

public static void main(String[]args) {
	
	String s = "Siva";
	String s1 = "Siva";
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	String concat =s.concat(s1);
	System.out.println(concat);
	System.out.println(System.identityHashCode(concat));
	
	
	String s5 = new String("Siva");
	String s6 = new String("Siva");
	
	System.out.println(System.identityHashCode(s5));
	System.out.println(System.identityHashCode(s6));
}
}
