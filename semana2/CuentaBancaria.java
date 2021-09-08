package semana2;

public class CuentaBancaria {
	
	double saldo;
	// builder
	public CuentaBancaria() {
		this.saldo = 0;
		
	}
	
	// builder with parameters
	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
		
	}
	
	// methods
	public double saldo() {
		
		return this.saldo;
	}
	
	public void transferencia(CuentaBancaria origen, double valor) {
		if (origen.saldo < valor) {
			System.out.println("saldo insuficiente");
		}else {
			this.saldo += valor;
			origen.saldo -= valor;
		}
	}
	
	public void transferencia(CuentaBancaria  destino1, CuentaBancaria destino2) {
		
		destino1.saldo += this.saldo/2;
		destino2.saldo += this.saldo/2;
		
		this.saldo = 0;
	}
}
