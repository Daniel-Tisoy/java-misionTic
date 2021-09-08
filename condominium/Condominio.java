package condominium;

import java.util.ArrayList;

public class Condominio {
	private ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();

	public void agregarInmueble(Inmueble i) {

		boolean existe = existeElInmueble(i);
		/*
		 * if (existe == true) { System.out.println("El inmueble ya existe");
		 * 
		 * } else { inmuebles.add(i); }
		 */

		if (existe == false) {
			inmuebles.add(i);
		}

	}

	public void eliminarInmueble(String ID) {
		// es posible que si no existe El id
		// se elimine el indice 0, que es el
		// que está por defecto.
		boolean existe = existeElInmueble(ID);
		if (existe) {
			int indice = extraerIndice(ID);
			inmuebles.remove(indice);
		}

	}

	public double calcularArriendoMensualCondominio() {
		double costo = 0;
		for (int i = 0; i < inmuebles.size(); i++) {
			costo += inmuebles.get(i).getCostoMensual();
		}
		return costo;
			
			
	}

	public double promedioCostoInmueble() {
		double arriendoMensual = calcularArriendoMensualCondominio();
		double promedio = arriendoMensual/inmuebles.size();
		return promedio;

	}

	public double desviacionEstandarCostoInmueble() {
		double media = promedioCostoInmueble();
		// sumatoria de la distancia al cuadrado
		double sumatoria = 0;
		for (int i = 0; i<inmuebles.size();i++) {
			sumatoria += Math.pow(inmuebles.get(i).getCostoMensual()-media, 2);
		}
		double desviacion = Math.sqrt(sumatoria/inmuebles.size());
		
		return desviacion;

	}

	private int extraerIndice(String ID) {
		int indice = 0;

		for (int i = 0; i < inmuebles.size(); i++) {
			String idsArrendadores = inmuebles.get(i).getnCasa();
			if (idsArrendadores.equals(ID)) {
				indice = i;
			}

		}
		return indice;

	}

	private boolean existeElInmueble(Inmueble j) {
		boolean existe = false;
		String id = j.getIDArrendador();
		for (int i = 0; i < inmuebles.size(); i++) {
			String idsArrendadores = inmuebles.get(i).getIDArrendador();
			if (idsArrendadores.equals(id)) {
				existe = true;
			}

		}

		return existe;

	}

	private boolean existeElInmueble(String ID) {
		boolean existe = false;
		for (int i = 0; i < inmuebles.size(); i++) {
			String idsArrendadores = inmuebles.get(i).getnCasa();
			if (idsArrendadores.equals(ID)) {
				existe = true;
			}

		}

		return existe;

	}

	public ArrayList<Inmueble> getInmuebles() {
		return inmuebles;
	}

	public void setInmuebles(ArrayList<Inmueble> inmuebles) {
		this.inmuebles = inmuebles;
	}

}
