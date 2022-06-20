package ar.edu.unlam.pb2.eva03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSePuedaCrearUnObjetoVolador() {
		//Vehiculo avion = new Volador(); NO SE PUEDE INSTANCIAR UNA INTERFAZ
		Volador avion = new Avion(1, "A-10");

		//assertEquals(0.0, avion.getAltura()); metodo assertEquals en deprecate
		assertEquals(0.0, avion.getAltura(), 0.01);
	}

	@Test
	public void queSePuedaCrearUnObjetoTerrestre() {
		//Vehiculo tanque = new Terrestre();NO SE PUEDE INSTANCIAR UNA INTERFAZ
		Terrestre tanque = new Tanque(5, "Renault FT");

		//assertEquals(0.0, tanque.getVelocidad());metodo assertEquals en deprecate
		assertEquals(0.0, tanque.getVelocidad(), 0.1);
	}

	@Test
	public void queSePuedaCrearUnObjetoAcuatico() {
		//Vehiculo submarino = new Acuatico();NO SE PUEDE INSTANCIAR UNA INTERFAZ
		Acuatico submarino = new Submarino(8, "ARA - San Juan");

		//assertEquals(0.0, submarino.getProfundidad());metodo assertEquals en deprecate
		assertEquals(0.0, submarino.getProfundidad(), 0.01);
	}

	@Test
	public void queSePuedaCrearUnObjetoAnfibio() {
		//Vehiculo var = new Anfibio(); duplica la variable var
		Anfibio var = new Anfibio(12, "LARC-5");

		//assertEquals(0.0, var.getVelocidad());metodo assertEquals en deprecate
		//assertEquals(0.0, var.getProfundidad());metodo assertEquals en deprecate
		assertEquals(0.0, var.getVelocidad(), 0.01);
		assertEquals(0.0, var.getProfundidad(), 0.01);
	}

	@Test
	public void queSePuedaCrearUnHidroavion() {
		//Vehiculo ag600 = new HidroAvion(); duplica la variable var
		HidroAvion ag600 = new HidroAvion(12, "AG600");

		//assertEquals(0.0, ag600.getAltura()); GETALTITUD DECIA igual esta en deprecate
		//assertEquals(0.0, ag600.getProfundidad()); deprecate
		assertEquals(0.0, ag600.getAltura(), 0.01);
		assertEquals(0.0, ag600.getProfundidad(), 0.01);
	}

	@Test
	public void queSePuedaArmarElConvoy() {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Avion("0001", "A-10"));
		argentina.agregarVehiculo(new Avion("0002", "A-10"));
		argentina.agregarVehiculo(new Avion("0003", "F-102"));
		argentina.agregarVehiculo(new Avion("0004", "F-15"));
		argentina.agregarVehiculo(new Tanque("0005", "Renault FT"));
		argentina.agregarVehiculo(new Camion("0006", "T-72"));
		argentina.agregarVehiculo(new Camion("0007", "T-72"));
		argentina.agregarVehiculo(new Submarino("0008", "A-10"));
		argentina.agregarVehiculo(new Portaviones("0009", "A-10"));
		argentina.agregarVehiculo(new Destructor("0010", "A-10"));
		argentina.agregarVehiculo(new Destructor("0011", "A-10"));
		argentina.agregarVehiculo(new HidroAvion("0012", "A-10"));//decia Hidroavion pero es HidroAvion
		argentina.agregarVehiculo(new Anfibio("0012", "A-10"));// !!! ???? xq lo agrega !!!! ????
		argentina.agregarVehiculo(new Avion(1, "A-10"));
		argentina.agregarVehiculo(new Avion(2, "A-10"));
		argentina.agregarVehiculo(new Avion(3, "F-102"));
		argentina.agregarVehiculo(new Avion(4, "F-15"));
		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Submarino(8, "ARA - San Juan"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "Mitsubishi F1M"));
		argentina.agregarVehiculo(new Anfibio(12, "LARC-5"));

		//agregado para verificar
		System.out.println(argentina.getConjuntoDefensa());
		//assertEquals((12, argentina.getCapacidadDeDefensa());
		assertEquals((Integer)12, argentina.getCapacidadDeDefensa());
	}

	@Test
	public void queSePuedaCrearUnaBatalla() {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3); //Pretende que se puedan cargar 2 batallas iguales? 
		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3); //No se puede porque es un Map donde la clave no se puede repetir. Si la key es un String no hacia falta sobreescribir el equals y hashCode
		/*
		assertEquals(100.5, argentina.getBatalla("San Lorenzo").getLatitud()); deprecate
		assertEquals(20.3, argentina.getBatalla("San Lorenzo").getLongitud()); deprecate
	}	esta de mas */ 

		assertEquals(100.5, argentina.getBatalla("San Lorenzo").getLatitud(),0.01);
		assertEquals(20.3, argentina.getBatalla("San Lorenzo").getLongitud(),0.01);
	}	

	@Test
	// public void queSePuedaPlanearLaBatallaSobreElOceano() { @Test METODO Desarrollado a continuacion de este
	public void queSePuedaPresentarBatallaTerrestre() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Avion("0001", "A-10"));
		argentina.agregarVehiculo(new Avion("0002", "A-10"));
		argentina.agregarVehiculo(new Avion("0003", "F-102"));
		argentina.agregarVehiculo(new Avion("0004", "F-15"));
		argentina.agregarVehiculo(new Tanque("0005", "Renault FT"));
		argentina.agregarVehiculo(new Camion("0006", "T-72"));
		argentina.agregarVehiculo(new Camion("0007", "T-72"));
		argentina.agregarVehiculo(new Submarino("0008", "A-10"));
		argentina.agregarVehiculo(new Portaviones("0009", "A-10"));
		argentina.agregarVehiculo(new Destructor("0010", "A-10"));
		argentina.agregarVehiculo(new Destructor("0011", "A-10"));
		argentina.agregarVehiculo(new HidroAvion("0012", "A-10")); //error tipeado decia Hidroavion es HidroAvion
		argentina.agregarVehiculo(new Anfibio("0012", "A-10"));

		argentina.crearBatalla("Terrestre", 100.5, 20.3, "San Lorenzo"); //error tipeado faltaba ; - Este crearBatalla necesita sobreescribir metodo con nuevos parametros

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));

		argentina.presentarBatalla(); //error tipeado faltaba ;  ... Que accion deberia hacer este metodo?
		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);
		try {
		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 5));
		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 6));
		assertTrue(argentina.enviarALaBatalla("San Lorenzo", 7));
		}catch(VehiculoInexistente vinex){
			System.err.println(vinex);
		}catch(VehiculoIncompatible vincom){
			System.err.println(vincom);
		}
	}
	
	public void queSePuedaPlanearLaBatallaSobreElOceano() { //@Test METODO Desarrollado del que estaba incompleto
	
	}

	@Test
	public void queSePuedaPresentarBatallaNaval() throws VehiculoInexistente, VehiculoIncompatible { //si no uso el expected debo tratar con try y catch
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Submarino(8, "A-10"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "A-10"));
		argentina.agregarVehiculo(new Anfibio(13, "A-10"));

		assertEquals((Integer)6, argentina.getCapacidadDeDefensa()); //esperaba 12 pero solo agrega 6 no iba a dar nunca assertEquals y agregar el casteo para manejar Wrapper
		argentina.crearBatalla("Pacifico", TipoDeBatalla.NAVAL, 200.5, 45.8);
		try {
		assertTrue(argentina.enviarALaBatalla("Pacifico", 8));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 9));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 10));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 11));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 12));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 13));	
		}catch(VehiculoInexistente vinex){
			System.err.println(vinex);
		}catch(VehiculoIncompatible vincom) {
			System.err.println(vincom);
		}
	}

	@Test (expected = VehiculoIncompatible.class)
	public void queSeNoSePuedaEnviarAUnaBatallaEnTierraUnBarco() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertFalse(argentina.enviarALaBatalla("San Lorenzo", 11));
	}

	@Test (expected = VehiculoInexistente.class) 
	public void queSeNoSePuedaEnviarAUnaBatallaUnVehiculoQueNoExista() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		argentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);

		assertFalse(argentina.enviarALaBatalla("San Lorenzo", 4)); //envio el vehiculo 4 que no he creado y lanza el error al expected
	}
}
