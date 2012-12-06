
public class Ex1 {
	public static void foo() {
		int bar = 2;
		int baz = bar + bar + 1;
		int i = 0;
			while (i < baz) {
				boolean bing = i % 2 == 1;
				if (bing) System.out.println("bing!"); i += 1;
	System.out.println("blip!");
			}
			System.out.println(i);
	}

	public static void foo2() {
		int odd = 0;int even = 1;
		for (; odd < 8; odd += 2) { even += odd;
		System.out.println(even + odd); }
	}
	
	public static void foo3() {
		for (int i = 1; i < 10; i+=1) {
			if (bar(i) == "even") {System.out.println("42!");return;}
			else System.out.println("oh no!"); return;
		}}
	public static String bar(int i) {
		if (i % 2 == 0) return "odd";
		else return "even";
	}
}
