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
		String s = "Hello from bar";
		System.out.println(s);
	}
}
