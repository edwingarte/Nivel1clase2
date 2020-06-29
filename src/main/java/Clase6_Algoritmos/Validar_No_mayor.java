package Clase6_Algoritmos;
import java.util.Scanner;

public class Validar_No_mayor {
	private static Scanner Variable;
	
	public static void main(String[] args) {
		Variable = new Scanner(System.in);
		
		int array[];
		int Mayor, CN;
		    
    System.out.print("Ingresa cantidad de numeros a comparar: ");
    CN = Variable.nextInt();
    
    array = new int[CN];
    
    for(int i=0; i<CN;i++)//Condicional 
    {
    	System.out.print("Ingresa el numero "+(i+1)+": ");	
    	array[i] = Variable.nextInt();
    }
    Mayor = array [0];
    for(int i=0; i<CN;i++)//se valida el numero mayor del arreglo
    {
    	if(array [i] > Mayor) {
    		Mayor = array[i];
    	}
    }
    System.out.print("El numero mayor es: "+Mayor);	
 }
	

}
