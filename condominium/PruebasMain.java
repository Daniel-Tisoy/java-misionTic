package condominium;

import java.util.ArrayList;


public class PruebasMain {

	public static void main(String[] args) {
		// creo un inmueble
		Inmueble sofa = new Inmueble("A1", "ldt", 700000, 2);
		Inmueble sofa2 = new Inmueble("A12", "Danny", 670000, 2);
		Inmueble sofa3 = new Inmueble("A13", "luis", 1000000, 2);
		Inmueble sofa4 = new Inmueble("A21", "tisoyy", 1340000, 2);
		
		// creo un condominio
		Condominio triana = new Condominio();
		
		// agregamos inmuebles al condominio
		triana.agregarInmueble(sofa);
		triana.agregarInmueble(sofa2);
		triana.agregarInmueble(sofa3);
		triana.agregarInmueble(sofa4);
		triana.eliminarInmueble("A12");
		// se obtiene la lista de inmuebles en el cond
		ArrayList<Inmueble> datos = triana.getInmuebles();
		
		// imprimimos los datos
		for(int i = 0; i < datos.size(); i++) {
			System.out.println(datos.get(i).getIDArrendador());
		}
		//triana.eliminarInmueble("Danny");
		System.out.println(triana.calcularArriendoMensualCondominio());
		System.out.println(triana.promedioCostoInmueble());
		System.out.println(triana.desviacionEstandarCostoInmueble());
		
	}

}
