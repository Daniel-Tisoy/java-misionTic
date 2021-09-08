package estudiante;

public class Estudiante {
	//atributos
	private String nombres;
	private String apellidos;
	private int edad;
	private double promedio;
	
	public Estudiante(String nombres, String apellidos, int edad, double promedio) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.promedio = promedio;
	}
	//get
	public String getNombre() {
		return nombres+' '+apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public double getPromedio() {
		return promedio;
	}
	
	//set
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
}
