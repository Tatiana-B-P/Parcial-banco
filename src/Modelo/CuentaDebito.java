package Modelo;

public class CuentaDebito extends Cuenta{
	double interes = 0.2;
	int numeroCuenta;
	public CuentaDebito(int numeroCuenta, int saldo) {
		super(saldo);
		this.numeroCuenta = numeroCuenta;
	}
	public double getInteres() {
		return interes;
	}
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public String descripcionCuenta() {
		return "El numero de su cuenta debito es: " + numeroCuenta + " con un interes del:" + interes + "%";
	}
}
