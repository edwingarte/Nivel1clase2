package Clase6_Algoritmos;
import java.util.Scanner;// Importar el Scanner

public class Numero_Primo {
	private static Scanner Variable;

	public static void main(String[] ARGS)
    {
        Variable = new Scanner(System.in);
        int cont,n,primo; 
 
        System.out.print("Ingresa un numero: ");
        primo = Variable.nextInt();
 
        cont = 0;
 
        for(n = 1; n <= primo; n++)// Se condiciona el numero ingresado
        {
            if((primo % n) == 0)
            {
                cont++;
            }
        }
 
        if(cont <= 2)
        {
            System.out.println("El numero es primo");// Se muestra el resultado
        }else{
            System.out.println("El numero no es primo");
        }
    }
	
	
	
}
