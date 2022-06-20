package ar.edu.unlam.pb2.eva03;

public class Portaviones extends Vehiculo implements Acuatico {

	private Double profundidad;

	public Portaviones(Integer codigo, String modelo) {
		super(codigo, modelo);
		profundidad=0.0;
	}

	public Portaviones(String codigo, String modelo) {
		super(codigo, modelo);
		profundidad=0.0;	
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	
}
