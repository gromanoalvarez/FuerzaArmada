package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	public FuerzaArmada() {
		convoy = new HashSet<Vehiculo>();
		batallas = new HashMap<String, Batalla>();
	}
	
	public void agregarVehiculo(Vehiculo nuevo) {
		convoy.add(nuevo);
	} 

}
