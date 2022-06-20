package ar.edu.unlam.pb2.eva03;

public class Camion extends Vehiculo implements Terrestre {

	private Double velocidad;

	public Camion(Integer codigo, String modelo) {
		super(codigo, modelo);
		velocidad=0.0;
	}

	public Camion(String codigo, String modelo) {
		super(codigo, modelo);
		velocidad=0.0;
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

}
