package Clase6_Algoritmos;

public class Expresion_Matematica {

	public static void main(String[] args) {
	
	double a, b, c, d, resultado;
		
	for(int i=-5; i<16;i++) //Se hace el rango para la operación 
    {
    	a = Math.pow(i,3);
    	b = Math.pow(i,2);
    	c = (i);
    	d = 2;
    	resultado = a + b + c - d;//Se establece la formula
		System.out.print("El Resultado es: "+resultado);
		System.out.print("\n ");
      }
	
	}
}
