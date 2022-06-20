package ar.edu.unlam.pb2.eva03;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {

	private Set<Vehiculo> convoy; // El convoy es el conjunto de Vehículos que disponen (no importa el tipo de vehículo).
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

	//2. Las batallas se identifican unívocamente por su nombre. (En este caso como es String no hace falta sobreescribir equals o hashcode)
	public void crearBatalla(String nombreDeBatalla, TipoDeBatalla TERRESTREoAEREAoNAVAL, double latitud, double longitud) {
		Batalla b = new Batalla( TERRESTREoAEREAoNAVAL, latitud, longitud);
		batallas.put(nombreDeBatalla, b);
	}

	public void crearBatalla(String tipoDeBatalla, double latitud, double longitud, String nombreDeBatalla) {
		Batalla b = new Batalla( tipoDeBatalla, latitud, longitud);
		batallas.put(nombreDeBatalla, b);		
	} 
	
	//dar la CLAVE y retorna el VALOR
	public Batalla getBatalla(String nombreDeLaBatalla) {		
		return batallas.get(nombreDeLaBatalla);
	}

	public void presentarBatalla() {
		//Que desea implementar?
	}

	
	/*
	5. El Vehículo que se envía a una batalla determinada debe ser apto para esta:
		a. En las batallas aeras, sólo se podrán utilizar Vehículos Voladores.
		b. En las batallas por tierra se podrán utilizar Vehículos Terrestre.
		c. En las batallas por agua sólo se podrán utilizar Vehículos Acuáticos.
		*/
	public boolean enviarALaBatalla(String nombreDeBatalla, Integer codigoVehiculo) {
		Batalla batallaDeseada = getBatalla(nombreDeBatalla);

		for(Vehiculo v : convoy) { //Para enviar un Vehículo a una batalla se debe confirmar que el mismo forme parte de la fuerza.
			if(v.getCodigo() == codigoVehiculo) {
				if(v instanceof Volador && batallaDeseada.getTipo().equals(TipoDeBatalla.AEREA)) {
					batallaDeseada.asignarVehiculoABatalla(v);
					return true;
				}else if(v instanceof Terrestre && batallaDeseada.getTipo().equals(TipoDeBatalla.TERRESTRE)) {
					batallaDeseada.asignarVehiculoABatalla(v);
					return true;
				}else if(v instanceof Acuatico && batallaDeseada.getTipo().equals(TipoDeBatalla.NAVAL)) {
					batallaDeseada.asignarVehiculoABatalla(v);
					return true;
				}
			}	
		}
		return false;
	}

}
