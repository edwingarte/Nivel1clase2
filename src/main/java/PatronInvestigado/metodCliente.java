package PatronInvestigado;

import java.util.List;
import PatronInvestigado.Cliente;

/*Se crea el acceso por medio de una interface, donde se declaran todos los metodos para acceder a los datos */

public interface metodCliente {
			//declaración de métodos para acceder a la base de datos
		public List<Cliente> obtenerClientes();
		public Cliente obtenerCliente(int id);
		public void actualizarCliente(Cliente cliente);
		public void eliminarCliente(Cliente cliente);
	
}
