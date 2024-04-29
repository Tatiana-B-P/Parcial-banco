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
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public void descripcionCuenta() {
		System.out.println("El numero de su cuenta debito es: " + numeroCuenta);
	}
}
