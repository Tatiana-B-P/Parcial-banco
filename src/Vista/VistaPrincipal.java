package Vista;

import java.util.Scanner;

public class VistaPrincipal {
	public static void pantallaPrincipal() {
		System.out.println("Bienvenido al banco Cachetes!!");
		System.out.println("Digite la opcion que desea para continuar: \n1. Creacion de cliente\n2. Consultar datos del cliente\n3. Depositar\n4. Retirar");
		Scanner entrada = new Scanner(System.in);
		int opcion = entrada.nextInt();
		switch(opcion) {
		case 1:
			crearCliente();
			break;
		case 2:
			//consultarCliente();
			break;
		case 3:
			//depositar();
			break;
		case 4:
			//retirar();
			break;
		default:
			System.out.println("opcion invalida");
			VistaPrincipal.pantallaPrincipal();
		}
		entrada.close();
	}
	public static void crearCliente() {
		System.out.println("Bienvenido al banco Cachetes!!");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite el nombre del cliente: ");
		String nombre = entrada.next();
		
		entrada.close();
	}
}
