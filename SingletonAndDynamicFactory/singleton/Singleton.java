package singleton;

public class Singleton {
	
	private static Singleton instance;
	
	public Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
			System.out.println("Nova instancia");
		} else {
			System.out.println("Instancia Antiga");
		}
		return instance;
	}

}
