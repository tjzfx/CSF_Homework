
public class Logger {
	static boolean created = false;
	
	private Logger() {

	}
	
	static public Logger getInstance() {
		if (!created) {
			Logger logger = new Logger();
			System.out.println("logger was created");
			Logger.created = true;
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