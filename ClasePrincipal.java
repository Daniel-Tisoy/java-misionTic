import java.util.ArrayList;
import estudiante.Estudiante;

//import bicicletas.BicicletaMontania;
//import clasesAbstractas.*;

public class ClasePrincipal {

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
		
		System.out.println(inscritos.size());
		
		System.out.println(inscritos.get(0).getNombre());
	}

}
