
public class Logger {
	static boolean created = false;
	
	private Logger() {

	}
	
	static public Logger getInstance() {
		if (!created) {
			Logger logger = new Logger();
			Logger.created = true;
			System.out.println("new instance created");
			return logger;
		}
		return null;
	}

	
	public void log(String s) {
		System.out.println(s);
	}


public static void main(String[] args) {
		Logger logger1 = new Logger();

		logger1.getInstance();
		logger1.getInstance();
	
	}
}