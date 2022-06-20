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

	public Batalla(String tipoDeBatalla, double latitud2, double longitud2) {
		this.latitud=latitud;
		this.longitud=longitud;
		asignarTipoDeBatalla(tipoDeBatalla);
		this.vehiculosEnLaBatalla = new HashSet<Vehiculo>();
	}
	
	private void asignarTipoDeBatalla(String tipoDeBatalla) {
		switch(tipoDeBatalla.toUpperCase()) {
		case "TERRESTRE" :
			tipo=TipoDeBatalla.TERRESTRE;
			break;
		case "NAVAL" :
			tipo=TipoDeBatalla.NAVAL;
			break;
		case "AEREA" :
			tipo=TipoDeBatalla.AEREA;
		}
	}

	public Double getLatitud() {
		return latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}

	public void asignarVehiculoABatalla(Vehiculo vehiculoDeseado) {
		vehiculosEnLaBatalla.add(vehiculoDeseado);
	}
	
}
