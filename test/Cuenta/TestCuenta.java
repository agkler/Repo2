package Cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCuenta {

	@Test
	public void queSePuedaCrearUnaCuenta() {
		Cuenta nuevaCuenta= new Cuenta();
		
		assertNotNull(nuevaCuenta);


	}

	@Test
	public void queSePuedaConsultarElSaldoDeUnaCuenta() {
		Cuenta nuevaCuenta= new Cuenta();
		Double saldo= 0.0 ;
		
		assertEquals(saldo, nuevaCuenta.getSaldo());
		


	}

	@Test
	public void queSePuedaCrearUnaCuentaSueldo() {
		CuentaSueldo nuevaCuenta= new CuentaSueldo();
		
		assertNotNull(nuevaCuenta);
		

	}

	@Test
	public void queSePuedaCrearUnaCajaDeAhorro() {
		CajaDeAhorro nuevaCuenta= new CajaDeAhorro();
		
		assertNotNull(nuevaCuenta);
		

	}

	@Test
	public void queSePuedaCrearUnaCuentaCorriente() {
		CuentaCorriente nuevaCuenta= new CuentaCorriente();
		
		assertNotNull(nuevaCuenta);


	}

	@Test
	public void queSePuedaDepositarDineroEnUnaCuentaSueldo() {
		CuentaSueldo nuevaCuenta= new CuentaSueldo();
		nuevaCuenta.depositar(15000.0);
		
		
		assertEquals(15000.0, nuevaCuenta.getSaldo());


	}

	@Test
	public void queSePuedaExtraerDeUnaCuentaSueldoUnImporteMenorAlSaldo() {
		CuentaSueldo nuevaCuenta= new CuentaSueldo();
		nuevaCuenta.depositar(15000.0);
		nuevaCuenta.extraer(13000.0);
		
		assertEquals(2000.0, nuevaCuenta.getSaldo());


	}

	@Test
	public void queSePuedaExtraerDeUnaCuentaSueldoUnImporteIgualAlSaldo() {
		CuentaSueldo nuevaCuenta= new CuentaSueldo();
		nuevaCuenta.depositar(15000.0);
		nuevaCuenta.extraer(15000.0);
		
		assertEquals(0.0, nuevaCuenta.getSaldo());


	}

	@Test
	public void queNoSePuedaExtraerDeUnaCuentaSueldoUnImporteMayorAlSaldo() {
		CuentaSueldo nuevaCuenta= new CuentaSueldo();
		
		nuevaCuenta.extraer(1000.0);
		
		assertEquals(0.0, nuevaCuenta.getSaldo());


	}

	@Test
	public void queNoSeCobreAdicionalLuegoDeLaQuintaExtraccionDeUnaCuentaSueldo() {
		CuentaSueldo nuevaCuenta= new CuentaSueldo();
		nuevaCuenta.depositar(50000.0);
		nuevaCuenta.extraer(5000.0);
		nuevaCuenta.extraer(5000.0);
		nuevaCuenta.extraer(5000.0);
		nuevaCuenta.extraer(5000.0);
		nuevaCuenta.extraer(5000.0);
		nuevaCuenta.extraer(5000.0);
		
		assertEquals(20000.0, nuevaCuenta.getSaldo());


	}



	@Test
	public void queSePuedaDepositarDineroEnUnaCuentaDeAhorro() {
		CajaDeAhorro nuevaCuentaDeAhorro= new CajaDeAhorro();
		nuevaCuentaDeAhorro.depositar(50000.0);
		
		Double montoEsperado= 50000.0;
		
		assertEquals(montoEsperado, nuevaCuentaDeAhorro.getSaldo());


	}

	@Test
	public void queSePuedaExtraerDeUnaCuentaDeAhorroUnImporteMenorAlSaldo() {
		CajaDeAhorro nuevaCuentaDeAhorro= new CajaDeAhorro();
		nuevaCuentaDeAhorro.depositar(50000.0);
		nuevaCuentaDeAhorro.extraer(30000.0);
		
		Double montoEsperado= 20000.0;
		
		assertEquals(montoEsperado, nuevaCuentaDeAhorro.getSaldo());


	}

	@Test
	public void queSePuedaExtraerDeUnaCuentaDeAhorroUnImporteIgualAlSaldo() {
		CajaDeAhorro nuevaCuentaDeAhorro= new CajaDeAhorro();
		nuevaCuentaDeAhorro.depositar(50000.0);
		nuevaCuentaDeAhorro.extraer(50000.0);
		
		Double montoEsperado= 0.0;
		
		assertEquals(montoEsperado, nuevaCuentaDeAhorro.getSaldo());


	}

	@Test
	public void queNoSePuedaExtraerDeUnaCuentaDeAhorroUnImporteMayorAlSaldo() {
		CajaDeAhorro nuevaCuentaDeAhorro= new CajaDeAhorro();
		nuevaCuentaDeAhorro.depositar(50000.0);
		nuevaCuentaDeAhorro.extraer(50001.0);
		
		Double montoEsperado= 50000.0;
		
		assertEquals(montoEsperado, nuevaCuentaDeAhorro.getSaldo());


	}

	@Test
	public void queSeCobreSeisPesosAdicionalesLuegoDeLaQuintaExtraccionDeUnaCuentaDeAhorro() {
		CajaDeAhorro nuevaCuentaDeAhorro= new CajaDeAhorro();
		nuevaCuentaDeAhorro.depositar(50000.0);
		nuevaCuentaDeAhorro.extraer(5000.0);
		nuevaCuentaDeAhorro.extraer(5000.0);
		nuevaCuentaDeAhorro.extraer(5000.0);
		nuevaCuentaDeAhorro.extraer(5000.0);
		nuevaCuentaDeAhorro.extraer(5000.0);
		nuevaCuentaDeAhorro.extraer(5000.0);
		
		
		
		Double montoEsperado= 19994.0;
		
		assertEquals(montoEsperado, nuevaCuentaDeAhorro.getSaldo());
	}

	@Test
	public void queNoSeCobreNingunAdicionalAntesDeLaQuintaExtraccionDeUnaCuentaDeAhorro() {
		CajaDeAhorro nuevaCuentaDeAhorro= new CajaDeAhorro();
		nuevaCuentaDeAhorro.depositar(50000.0);
		nuevaCuentaDeAhorro.extraer(5000.0);
		nuevaCuentaDeAhorro.extraer(5000.0);
		nuevaCuentaDeAhorro.extraer(5000.0);
		
	
		
		
		
		Double montoEsperado= 35000.0;
		
		assertEquals(montoEsperado, nuevaCuentaDeAhorro.getSaldo());


	}

	@Test
	public void queNoSeCobreNingunAdicionalEnLaQuintaExtraccionDeUnaCuentaDeAhorro() {
		CajaDeAhorro nuevaCuentaDeAhorro= new CajaDeAhorro();
		nuevaCuentaDeAhorro.depositar(50000.0);
		nuevaCuentaDeAhorro.extraer(5000.0);
		nuevaCuentaDeAhorro.extraer(5000.0);
		nuevaCuentaDeAhorro.extraer(5000.0);
		
	
		
		
		
		Double montoEsperado= 35000.0;
		
		assertEquals(montoEsperado, nuevaCuentaDeAhorro.getSaldo());



	}

	@Test
	public void queSePuedaDepositarDineroEnUnaCuentaCorriente() {
		CuentaCorriente nuevaCuentaCorriente= new CuentaCorriente();
		nuevaCuentaCorriente.depositar(1500.0);
		
		Double montoEsperado= 1500.0;
		
		assertEquals(montoEsperado, nuevaCuentaCorriente.getSaldo());


	}

	@Test
	public void queSePuedaExtraerDeUnaCuentaCorrienteUnImporteMenorAlSaldo() {
		CuentaCorriente nuevaCuentaCorriente= new CuentaCorriente();
		nuevaCuentaCorriente.depositar(1500.0);
		nuevaCuentaCorriente.extraer(1000.0);
		
		Double montoEsperado= 500.0;
		
		assertEquals(montoEsperado, nuevaCuentaCorriente.getSaldo());



	}

	@Test
	public void queSePuedaExtraerDeUnaCuentaCorrienteoUnImporteIgualAlSaldo() {
		CuentaCorriente nuevaCuentaCorriente= new CuentaCorriente();
		nuevaCuentaCorriente.depositar(1500.0);
		nuevaCuentaCorriente.extraer(1500.0);
		
		Double montoEsperado= 0.0;
		
		assertEquals(montoEsperado, nuevaCuentaCorriente.getSaldo());


	}

	@Test
	public void queSePuedaExtraerDeUnaCuentaCorrienteoUnImporteIgualAlSaldoMasElDescubierto() {
		CuentaCorriente nuevaCuentaCorriente= new CuentaCorriente();
		nuevaCuentaCorriente.depositar(1500.0);
		nuevaCuentaCorriente.extraer(1600.0);
		
		Double montoEsperado= -100.0;
		
		assertEquals(montoEsperado, nuevaCuentaCorriente.getSaldo());


	}

	@Test
	public void queNoSePuedaExtraerDeUnaCuentaCorrienteUnImporteMayorAlSaldoMasElDescubierto() {



	}

	@Test
	public void queSeCobreCincoPorcientoDeComisionAlDepositarDineroLuegoDeHaberRealizadoUnaExtraccionMayorAlSaldo() {



	}

}
