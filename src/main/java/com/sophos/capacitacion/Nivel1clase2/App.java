package com.sophos.capacitacion.Nivel1clase2;

import Clase4_Metodos.Carro;
import Clase6_Algoritmos.Fibonacci;
import Clase8_Busqueda.Busqueda;
import org.openqa.selenium.WebDriver;
import Clase10_Factory.Animales;
import Clase10_Factory.Leon;
import Clase10_Factory.Vaca;
import Clase11_Merca.VistaHomeMercadolibre;
import Clase11_Merca.VistaResultados;
import Clase12_ebay.VistaHomeEbay;
import Patron_Singleton.PatronSingleton;
import PatronInvestigado.Cliente;
import PatronInvestigado.metodCliente;
import PatronInvestigado.ImplCliente;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	  	    	   	  	
    	    
//    	Carro objCarro = new Carro(); //Clase4 Herencia Carro
//    	objCarro.setCantidad_de_Llantas(6);
//    	objCarro.setTipo_de_fuente_de_energia("Hibrido");
//		objCarro.setColor("Azul Oscuro");
//	
//		System.out.println("La cantidad de llantas del carro es: " + objCarro.getCantidad_de_Llantas());
//		System.out.println("El tipo de fuente de energia es: " + objCarro.getTipo_de_fuente_de_energia());
//		System.out.println("El Color del carro es: " + objCarro.getColor());
		
		//Fibonacci f1 = new Fibonacci("Fibonacci",0); // Clase6 Algoritmos Fibonacci
		//f1.setNombre("Fibonacci 1");
		//f1.setTamaño(50);
		//f1.mostrarSerie();
		
//		Driver objDriver = new Driver();
//		objDriver.navegadorGoogle();
//		objDriver.navegadorFirefox();
//		objDriver.navegadorIE();
    	    				
    	//Busqueda objBusqueda = new Busqueda(); 
			//objBusqueda.navegadorGoogle();
    	
    //	PatronSingleton objSingleton = PatronSingleton.getInstancia("Db_1");
    //	System.out.println("Nombre de Base de Datos: "+objSingleton.getNombreBaseDatos());
    	
   // 	PatronSingleton objSingleton2 = PatronSingleton.getInstancia("Db_2");
   // 	System.out.println("Nombre de Base de Datos: "+objSingleton2.getNombreBaseDatos());
    	
   //     Animales leon = new Leon();
   //     Animales vaca = new Vaca();
        
   //     System.out.println(leon.NombreAnimal());
   //     System.out.println(vaca.NombreAnimal());
    	
   /* Aca se llama el patron DAO para validar su funcionamiento  */    
     // objeto para manipular el DAO
     		//metodCliente metodCliente = new ImplCliente();
      
     		// imprimir los clientes
     		//metodCliente.obtenerClientes().forEach(System.out::println);
      
     		// obtener un cliente
     		//Cliente cliente = metodCliente.obtenerCliente(0);
     		//cliente.setApellido("Linares");
     		
     		//actualizar cliente
     		//metodCliente.actualizarCliente(cliente);
      
     		// imprimir los clientes
     		//System.out.println("*****");
     		//metodCliente.obtenerClientes().forEach(System.out::println);
     		//System.out.println("Cliente con id: "+cliente.getId()+" Con nombre: "+cliente.getNombre()+" Con apellido: "+cliente.getApellido()+" con Direccion : "+cliente.getDireccion());
		//Clase 11 
    	App app = new App();
    	//app.mercadolibreclase11();
    	app.clase12Ebay();
         }
 
 
    public void mercadolibreclase11 () {
    	Driver objDriver = new Driver ();
    	objDriver.lanzarNavegador("google");
    	objDriver.navegarA("https://www.mercadolibre.com.co/");
    	VistaHomeMercadolibre VistaHome = new VistaHomeMercadolibre(objDriver.getDriver());
    	VistaHome.setTextAndLookFor("Moto Spike");
    	VistaResultados resultados = new VistaResultados(objDriver.getDriver());
    	//resultados.imprimaTextosEnLista();
    	resultados.seleccionePrimerElemento();
    	
    		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	objDriver.cierreNavegador();
    }
 
    public void clase12Ebay() {
    	Driver objDriver = new Driver ();
    	objDriver.lanzarNavegador("google");
    	objDriver.navegarA("https://www.ebay.com/");
    	VistaHomeEbay ebay = new VistaHomeEbay(objDriver.getDriver());
    	if (ebay.seleccionarPorNombre("Arte")) {
    		System.out.println("La opción seleccionada existe");
    	} else {
    		System.out.println("La opción seleccionada no existe");
    	}
    	
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	objDriver.cierreNavegador();
    }
  
}

