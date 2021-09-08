package polimorfismo;

import java.util.ArrayList;
import java.util.List;

import bicicletas.Bicicleta;
import bicicletas.BicicletaMontania;
import bicicletas.BicicletaRuta;

public class PruebaMecanico {

	public static void main(String[] args) {
		Bicicleta cicla01, cicla02, cicla03, cicla04;

		cicla01 = new Bicicleta();
		cicla02 = new BicicletaMontania(5, "Trek", "Rojo", 0, "SRAM");
		cicla03 = new BicicletaRuta(32, "Specialized", "Azul", 0, "Shimano");
		cicla04 = new BicicletaMontania(6, "Scott", "Blanco", 0, "SRAM");

		List<Bicicleta> bicicletas = new ArrayList<>();

		bicicletas.add(cicla01);
		bicicletas.add(cicla02);
		bicicletas.add(cicla03);
		bicicletas.add(cicla04);

		Mecanico juanMecanico = new Mecanico();
		// se manipula la lista directamente?
		juanMecanico.getMisPedales().add("Pinarello");
		juanMecanico.getMisPedales().add("Scott");
		juanMecanico.getMisPedales().add("Cannondale");
		juanMecanico.getMisPedales().add("Giant");

		for (Bicicleta miCicla : bicicletas) {
			juanMecanico.ponerPedales(miCicla);
		}
	}

}
