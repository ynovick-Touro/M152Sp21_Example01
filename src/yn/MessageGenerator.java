package yn;

public class MessageGenerator {
	public static String getMessage(int x) {
		if (x == 0)
			return "Hi World";
		else
			return "GitHub";
	}
	
	public void foo() {
		System.out.println("Foo");
	}
	
	public void bar() {
		String s = "Hello from bar";
		System.out.println(s);
	}
}
