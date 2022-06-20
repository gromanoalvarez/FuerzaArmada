/**
 * 
 */
package ar.edu.unlam.pb2.eva03;

/**
 * @author German
 *
 */
public class Vehiculo {
	private Integer codigo;
	private String modelo;
	
	//Sobrecarga de constructor
	public Vehiculo() {}

	public Vehiculo(Integer codigo, String modelo) {
		this.codigo=codigo;
		this.modelo=modelo;
	}
	
	public Vehiculo(String codigo, String modelo) {
		this.codigo=Integer.valueOf(codigo);
		this.modelo=modelo;
	}
	
}
