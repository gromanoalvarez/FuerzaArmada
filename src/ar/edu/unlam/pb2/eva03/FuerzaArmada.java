package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	//Map<Key,Value> nombreColeccion
	private Map<String, Batalla> batallas;
	//para la Clave o Key en este caso es String pero si fuera Object deberia hacer  @Override del equals y hashCode (Y ADEMAS implements Comparable con el metodo compareTo si es un TreeSet)
	
	public FuerzaArmada() {
		convoy = new HashSet<Vehiculo>();
		batallas = new HashMap<String, Batalla>();
	}
	
	public void agregarVehiculo(Vehiculo nuevo) {
		convoy.add(nuevo);
	}

	public HashSet<Vehiculo> getCapacidadDeDefensa() {
		return (HashSet<Vehiculo>) convoy;
	}

	public void crearBatalla(String nombreDeBatalla, TipoDeBatalla TERRESTREoAEREAoNAVAL, double latitud, double longitud) {
		Batalla b = new Batalla( TERRESTREoAEREAoNAVAL, latitud, longitud);
		batallas.put(nombreDeBatalla, b);
	}

	//dar la CLAVE y retorna el VALOR
	public Batalla getBatalla(String nombreDeLaBatalla) {		
		return batallas.get(nombreDeLaBatalla);
	} 

}
