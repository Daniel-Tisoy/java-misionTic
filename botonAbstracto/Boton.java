package botonAbstracto;

public abstract class Boton {
	private double ancho;
	private  double alto;
	private String colorFondo;
	private String colorTexto;
	private String texto;

	public Boton(double ancho, double alto, String colorFondo, String colorTexto, String texto) {
		this.setAncho(ancho);
		this.setAlto(alto);
		this.setColorFondo(colorFondo);
		this.setColorTexto(colorTexto);
		this.setTexto(texto);
	}
	
	public abstract void hacerClick();

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public String getColorFondo() {
		return colorFondo;
	}

	public void setColorFondo(String colorFondo) {
		this.colorFondo = colorFondo;
	}

	public String getColorTexto() {
		return colorTexto;
	}

	public void setColorTexto(String colorTexto) {
		this.colorTexto = colorTexto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
