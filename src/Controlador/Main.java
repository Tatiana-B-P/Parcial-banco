package Controlador;

import Modelo.*;

public class Main {

	public static void main(String[] args) {
		Cuenta[] cuentas = new Cuenta[2];
		cuentas[0] = new CuentaDebito(12323,12321312);
		cuentas[1] = new CuentaCredito(new Tarjeta(4567),123);
		Cliente cliente1 = new Cliente("Francisco", 1223213, cuentas);
		
		cliente1.datosCliente();
	}
}
