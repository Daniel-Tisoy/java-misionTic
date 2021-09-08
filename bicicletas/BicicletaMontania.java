package bicicletas;

public class BicicletaMontania extends Bicicleta {

	private int cambio;

	// constructores
	// constructor sin parámetros
	public BicicletaMontania() {
		super(); // llamando al constructor de la superclase
		this.cambio = 6; // valor por defecto
	}

	// constructor con parámetros
	public BicicletaMontania(int cambio, String marca, String color, double velocidadInicial, String pedales) {
		super(marca, color, velocidadInicial, pedales);// atributos enviados a la clase padre
		
		// modificamos el atributo cambio
		if (cambio > 0 && cambio <= 12) {
			this.cambio = cambio;
		} else {
			this.cambio = 6;
		}
	}

	// métodos adicionales de una bici de montaña
	public void subirCambio() {
		if (this.cambio < 12) {
			cambio++;
		}
	}

	public void bajarCambio() {
		if (this.cambio > 1) {
			cambio--;
		}
	}

	public int getCambio() {
		return this.cambio;
	}

	// sobreescribiendo métodos
	@Override
	public void pedalear(double aceleracion) {
		double aceleracionConCambios = aceleracion * (this.cambio / 6);
		// accediendo al metodo de la clase padre
		super.pedalear(aceleracionConCambios);
	}
	
	@Override
	public String getDescripcion() {
		return super.getDescripcion() + ", y en el cambio " + cambio;
	}

}
