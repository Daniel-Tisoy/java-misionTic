package botonAbstracto;


public class BotonPrueba extends Boton {

	public BotonPrueba(double ancho, double alto, String colorFondo, String colorTexto, String texto) {
		super(ancho, alto, colorFondo, colorTexto, texto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hacerClick() {
		// TODO Auto-generated method stub
		this.setTexto("Hello World");

	}

}
