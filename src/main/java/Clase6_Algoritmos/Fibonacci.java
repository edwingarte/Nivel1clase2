package Clase6_Algoritmos;

public class Fibonacci {
	
	public int tamaño; //Atributos
	public String nombre;
	
	public Fibonacci(String nombre, int tamaño){ //Metodos
	    this.nombre = nombre;
	    this.tamaño = tamaño;
	}
	public void mostrarSerie(){
	    System.out.println(this.nombre+" de tamaño "+this.tamaño+":");
	    for (int i = 0; i < tamaño; i++) {
	        System.out.print(fibonacci(i)+" ");
	    }
	    System.out.println();
	}
		
		public int getTamaño() { //getter and setter
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	 
		int fibonacci(int a)//Funcion
	{
	    if (a>1){
	       return fibonacci(a-1) + fibonacci(a-2);
	    }
	    else if (a==1) {  
	        return 1;
	    }
	    else if (a==0){  
	        return 0;
	    }
	    else{ //error
	        System.out.println("Ingresa un numero mayor o igual a 1");
	        return -1; 
	    }
	}
	
	
	
}
