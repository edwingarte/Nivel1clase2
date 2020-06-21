package com.sophos.capacitacion.Nivel1clase2;

import Clase4_Metodos.Carro;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Carro objCarro = new Carro();
    	objCarro.setCantidad_de_Llantas(6);
    	objCarro.setTipo_de_fuente_de_energia("Hibrido");
		objCarro.setColor("Azul Oscuro");
	
		System.out.println("La cantidad de llantas del carro es: " + objCarro.getCantidad_de_Llantas());
		System.out.println("El tipo de fuente de energia es: " + objCarro.getTipo_de_fuente_de_energia());
		System.out.println("El Color del carro es: " + objCarro.getColor());
    }
}
