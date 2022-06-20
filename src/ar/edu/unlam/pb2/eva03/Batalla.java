package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;

public class Batalla {
	private Double latitud, longitud;
	private TipoDeBatalla tipo;
	private Set<Vehiculo> vehiculosEnLaBatalla;
	
	public Batalla( TipoDeBatalla TERRESTREoAEREAoNAVAL, double latitud, double longitud) {
		this.latitud=latitud;
		this.longitud=longitud;
		this.tipo=TERRESTREoAEREAoNAVAL;
		this.vehiculosEnLaBatalla = new HashSet<Vehiculo>();
	}

	public Double getLatitud() {
		return latitud;
	}

	public Double getLongitud() {
		return longitud;
	}
	
}
