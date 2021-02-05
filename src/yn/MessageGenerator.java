package yn;

public class MessageGenerator {
	public static String getMessage(int x) {
		if (x == 0)
			return "Hi World";
		else
			return "GitHub";
	}
	
	public void foo() {
		String s = "Hi from foo";
		System.out.println(s);
	}
	
	public void bar() {
		String s1 = "hello";
		String s2 = "World";
		
		String s3 = s1 + " " + s2;
		System.out.println(s3);
	}
}
