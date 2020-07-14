package Patron_Singleton;

public class PatronSingleton {
	
	private static PatronSingleton objInstancia;
	private String nombreBaseDatos;

	private PatronSingleton(String nombreBaseDatos) {
		this.nombreBaseDatos = nombreBaseDatos;
		}
	
	public static PatronSingleton getInstancia (String nombreBaseDatos) {
		if (objInstancia == null) {
			synchronized (PatronSingleton.class) {
				if(objInstancia == null) {
					objInstancia = new PatronSingleton(nombreBaseDatos);		
				}
				
			}
				
		}
		
		return objInstancia;
	}

	public String getNombreBaseDatos() {
		return nombreBaseDatos;
	}	
}
