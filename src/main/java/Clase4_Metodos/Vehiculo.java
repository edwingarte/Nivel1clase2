package Clase4_Metodos;

public class Vehiculo {
	
	int Cantidad_de_Llantas;
	String tipo_de_fuente_de_energia;	
	
	
	public int getCantidad_de_Llantas() {
		return Cantidad_de_Llantas;
	}

	public void setCantidad_de_Llantas(int cantidad_de_Llantas) {
		Cantidad_de_Llantas = cantidad_de_Llantas;
	}

	public String getTipo_de_fuente_de_energia() {
		return tipo_de_fuente_de_energia;
	}

	public void setTipo_de_fuente_de_energia(String tipo_de_fuente_de_energia) {
		this.tipo_de_fuente_de_energia = tipo_de_fuente_de_energia;
	}
}
