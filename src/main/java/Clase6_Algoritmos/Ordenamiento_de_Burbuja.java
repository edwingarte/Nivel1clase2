package Clase6_Algoritmos;

public class Ordenamiento_de_Burbuja {

	 public static int[] ordenamiento(int[] array)//Bucle Anidado
	    {
	      int variable;
	      int[] arrayOrganizado;
	      for(int i = 2; i < array.length; i++)
	      {
	        for(int j = 0;j < array.length-i;j++)
	        {
	          if(array[j] > array[j+1])
	          {
	            variable = array[j];
	            array[j] = array[j+1];
	            array[j+1] = variable;
	          }   
	        }
	      }
	      arrayOrganizado = array;
	      return arrayOrganizado;
	    }
	 public static void main(String[] args) 
	    {
	      int array[] = {15,21,51,32,51,98,56,54,21,160};// Se declara el arreglo
	      int arrayOrganizado[] = ordenamiento(array);
	 
	        for(int i = 0; i < arrayOrganizado.length;i++)// Se muestra el Arreglo
	        System.out.println(arrayOrganizado[i]);
	    }
	
}
