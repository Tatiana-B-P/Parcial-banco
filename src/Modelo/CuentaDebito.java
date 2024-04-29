package Modelo;

public class CuentaDebito {
	double interes;
	int numeroCuenta;
	public CuentaDebito(double interes, int numeroCuenta) {
		super();
		this.interes = interes;
		this.numeroCuenta = numeroCuenta;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	
}
