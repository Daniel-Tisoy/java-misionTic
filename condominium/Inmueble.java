package condominium;

public class Inmueble {
	private String nCasa;
	private String IDArrendador;
	private double costoMensual;
	private int cantidadMesesArrendando;

	public Inmueble(String nCasa, String IDArrendador, double costoMensual, int cantidadMesesArrendando) {
		setnCasa(nCasa);
		setIDArrendador(IDArrendador);
		setCostoMensual(costoMensual);
		setCantidadMesesArrendando(cantidadMesesArrendando);

	}

	// getters y setters
	public String getnCasa() {
		return nCasa;
	}

	public void setnCasa(String nCasa) {
		this.nCasa = nCasa;
	}

	public String getIDArrendador() {
		return IDArrendador;
	}

	public void setIDArrendador(String IDArrendador) {
		this.IDArrendador = IDArrendador;
	}

	public double getCostoMensual() {
		return costoMensual;
	}

	public void setCostoMensual(double costoMensual) {
		this.costoMensual = costoMensual;
	}

	public int getCantidadMesesArrendando() {
		return cantidadMesesArrendando;
	}

	public void setCantidadMesesArrendando(int cantidadMesesArrendando) {
		this.cantidadMesesArrendando = cantidadMesesArrendando;
	}

}
