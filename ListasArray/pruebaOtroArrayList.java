package ListasArray;

import java.util.ArrayList;
import estudiante.Estudiante;

public class pruebaOtroArrayList {

	public static void main(String[] args) {
		ArrayList<Estudiante> inscritos = new ArrayList<>();

		Estudiante primero = new Estudiante("Juan", "Pérez", 16, 4.5);
		Estudiante segundo = new Estudiante("Pedro", "Cañas", 19, 3.5);
		Estudiante tercero = new Estudiante("Lucas", "Ruiz", 18, 3.9);
		Estudiante cuarto = new Estudiante("Tomás", "Álvarez", 21, 4.1);

		// se agregan los estudiantes al ArrayList

		inscritos.add(primero);
		inscritos.add(segundo);
		inscritos.add(tercero);
		inscritos.add(cuarto);
		
		System.out.println(inscritos.get(0).getNombre());
		System.out.println(inscritos.size());
		
		// se eliminan estudiantes
		inscritos.remove(0);
		
		System.out.println(inscritos.get(0).getNombre());
		System.out.println(inscritos.size());
		
		// eliminamos todos los elementos
		
		inscritos.clear();
		System.out.println(inscritos.size());
		
	}

}
