package Modelo;



public class Cliente implements iCliente {
	private String nombre;
	private int docIdentificacion;
	private Cuenta[] cuenta;
	
	public Cliente(String nombre, int docIdentificacion,Cuenta[] cuenta) {
		super();
		this.nombre = nombre;
		this.docIdentificacion = docIdentificacion;
		this.cuenta = cuenta;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDocIdentificacion() {
		return docIdentificacion;
	}
	public void setDocIdentificacion(int docIdentificacion) {
		this.docIdentificacion = docIdentificacion;
	}
	
	public Cuenta[] getCuenta() {
		return cuenta;
	}
	
	public void datosCliente() {
		System.out.println("El nombre del cliente es: " + nombre + "\nSu numero de identificacion es: " + docIdentificacion + "\n" + cuenta[0].descripcionCuenta() + "\n" + cuenta[1].descripcionCuenta());
	}
	
}
