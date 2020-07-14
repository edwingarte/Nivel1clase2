package PatronInvestigado;
/* El Patron Data Access Object (DAO)
 * Permite el acceso a los datos de diversas fuentes y abstrae la forma de acceder a ellos. 
 * Accede a la información, independiente si estan contenidos en un archivo o en una base de datos.
 * Este patron tiene todos los metodos crear, leer, actualizar y borrar CRUD.
 * */
public class Cliente {
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	
/* Se crea una clase clientes solamente con sus constructores, en este caso datos del cliente
 * y sus Getters y Setters */	
		
	public Cliente() {
		super();
	}
	public Cliente(int id, String nombre, String apellido, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
		public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return this.getNombre()+" "+this.getApellido();
	}

}
