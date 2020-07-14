package Clase10_Factory;

public class Vaca implements Animales {
	@Override
	public String NombreAnimal() {
		return "Yo soy una Vaca";
	}

	@Override
	public String tipoAlimentacion() {
		return "Yo como Pasto";
	}

}
