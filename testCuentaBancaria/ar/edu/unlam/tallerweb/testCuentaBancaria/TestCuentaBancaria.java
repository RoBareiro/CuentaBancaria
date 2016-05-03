package ar.edu.unlam.tallerweb.testCuentaBancaria;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.tallerweb.cuentaBancaria.CuentaBancaria;

public class TestCuentaBancaria {

	@Test
	public void probarQueMuestreElSaldoInicial() {
		CuentaBancaria miCuenta = new CuentaBancaria();
		Double valorEsperado = 0.00;
		assertEquals(valorEsperado, miCuenta.getSaldoActual());

	}

	@Test
	public void depositarSaldoPositivoYConsultarSaldo() {
		CuentaBancaria miCuenta = new CuentaBancaria();
		miCuenta.depositar(100.00);
		Double valorObtenido = miCuenta.getSaldoActual();
		Double valorEsperado = 100.00;
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void extraerPlataDeCuentaYConsultarSaldo() {
		CuentaBancaria miCuenta = new CuentaBancaria();
		miCuenta.depositar(100.00);
		miCuenta.extraer(50.00);
		Double valorObtenido = miCuenta.getSaldoActual();
		Double valorEsperado = 50.00;
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void noRecibeSaldoNegativoAlDepositar(){
		CuentaBancaria miCuenta = new CuentaBancaria();
		miCuenta.depositar(-1000.00);
		Double valorObtenido = miCuenta.getSaldoActual();
		Double valorEsperado = 0.00;
		assertEquals(valorEsperado, valorObtenido);		
	}

}
