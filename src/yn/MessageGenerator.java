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
		int x = 5;
		int y = 7;
		int sum = x + y;
		System.out.println(sum);
	}
}
