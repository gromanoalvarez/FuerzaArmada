package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements Terrestre, Acuatico {

	private Double profundidad;
	private Double velocidad;

	public Anfibio() {
		this.profundidad=0.0;
	}

	public Anfibio(Integer codigo, String modelo) {
		super(codigo, modelo);
		this.profundidad=0.0;
	}
	
	public Anfibio(String codigo, String modelo) {
		super(codigo, modelo);
		this.profundidad=0.0;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}
	
	public void setProfundidad(Double profundidadDeseada) {
		this.profundidad=profundidadDeseada;
	}
	
	public void setVelocidad(Double velocidadDeseada) {
		this.velocidad=velocidadDeseada;
	}

}
