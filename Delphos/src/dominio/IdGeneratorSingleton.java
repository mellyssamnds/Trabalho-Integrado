package dominio;

public class IdGeneratorSingleton {
	
	private static IdGeneratorSingleton instance;
	
	private long idInicial = 1;
	
	public synchronized static IdGeneratorSingleton getInstance() {
		if(instance == null) {
			instance = new IdGeneratorSingleton();
		}
		return instance;
	}
	
	public IdGeneratorSingleton () {
		
	}
	
	public synchronized long getNextSerial() {
		return ++idInicial;
	}

}
