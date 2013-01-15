
public class Dog {
	
	private String name;
	private int tiredness;
	
	private Dog() {
		super();
		this.tiredness = 5;
	}
	
	public Dog(String name) {
		this();
		this.name = name;
	}
	
	//getter allows you to let others see the variable, but not set it. Also allows you to include other functionality.
	public String getName() {
		return this.name;
	}
	
	public String move() {
		int distance = tiredness/20;
		tiredness += distance/10;
		return "Walking 4 steps!";
	}
	
	//consider moving tiredness into it's own method
	
	public String bark() {
		return "Woof!";
	}
}
