/**
 * 
 */
package ar.edu.unlam.pb2.eva03;

/**
 * @author German
 *
 */
public class Avion extends Vehiculo implements Volador {

	/**
	 * @param codigo
	 * @param modelo
	 */
	private Double altura;
	public Avion(Integer codigo, String modelo) {
		super(codigo, modelo);
		this.altura=0.0;
	}

	public Avion(String codigo, String modelo) {
		super(codigo, modelo);
		this.altura=0.0;
	}

	@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	

}
