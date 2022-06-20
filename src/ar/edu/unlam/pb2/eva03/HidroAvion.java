/**
 * 
 */
package ar.edu.unlam.pb2.eva03;

/**
 * @author German
 *
 */
public class HidroAvion extends Vehiculo implements Volador, Acuatico {

	/**
	 * @param codigo
	 * @param modelo
	 */
	private Double profundidad, altura;
	
	public HidroAvion() {
		this.profundidad=0.0;
		this.altura=0.0;
	}
	
	public HidroAvion(Integer codigo, String modelo) {
		super(codigo, modelo);
		this.profundidad=0.0;
		this.altura=0.0;
	}

	public HidroAvion(String codigo, String modelo) {
		super(codigo, modelo);
		this.profundidad=0.0;
		this.altura=0.0;	
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

	@Override
	public Double getAltura() {
		return altura;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
