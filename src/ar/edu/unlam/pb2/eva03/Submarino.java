package ar.edu.unlam.pb2.eva03;

public class Submarino extends Vehiculo implements Acuatico {

	private Double profundidad;

	public Submarino(Integer codigo, String modelo) {
		super(codigo, modelo);
		profundidad=0.0;
	}
	public Submarino(String codigo, String modelo) {
		super(codigo, modelo);
		profundidad=0.0;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}
	
	
}
