package Modelo;

public class CuentaCredito extends Cuenta {
	private Tarjeta tarjeta;

	public CuentaCredito(Tarjeta tarjeta,int saldo) {
		super(saldo);
		this.tarjeta = tarjeta;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	
	public String descripcionCuenta() {
		return "El numero de su tarjeta credito es: " + tarjeta.getNumeroTarjeta();
	}
	
	
}
