package semana2;

public class Cuenta {

	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria(20.0);
		CuentaBancaria cuenta2 = new CuentaBancaria(10);
		CuentaBancaria cuenta3 = new CuentaBancaria();
		
		System.out.println("saldo cuenta Destino: " + String.valueOf(cuenta2.saldo));
		
		cuenta2.transferencia(cuenta1, 60);
		
		System.out.println("saldo cuenta Destino: " + String.valueOf(cuenta2.saldo));
		
		cuenta1.transferencia(cuenta2, cuenta3);
		
		System.out.println(cuenta1.saldo);
		System.out.println(cuenta2.saldo);
		System.out.println(cuenta3.saldo);
	}

}
