package Modelo;

public abstract class Cuenta {
	private int saldo; 
	
	public Cuenta(int saldo) {
		this.saldo = saldo;
	}

	public int getSaldo() { //getter
		return saldo;
	}
	
	public void aumentarSaldo(int aumento) {
		saldo = saldo + aumento;
		
	}
	
	public void retiroSaldo(int retiro) {
		saldo = saldo - retiro;
	}
	
	public abstract void descripcionCuenta();
}
