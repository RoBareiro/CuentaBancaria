package ar.edu.unlam.tallerweb.testCuentaBancaria;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.tallerweb.cuentaBancaria.CuentaBancaria;

public class TestCuentaBancaria {

	@Test
	public void probarQueMuestreElSaldoInicial() {
		CuentaBancaria miCuenta= new CuentaBancaria(1234);
		Double valorEsperado= 0.00;
		assertEquals(valorEsperado, miCuenta.getSaldoActual());
		
	}
	
	@Test
	public void depositarPlataYConsultarSaldo(){
		CuentaBancaria miCuenta = new CuentaBancaria(1234);
		Double deposito = miCuenta.depositar(100.00);
		Double valorEsperado = miCuenta.getSaldoActual();
		assertEquals(valorEsperado, deposito);
	}
	
	@Test
	public void extraerPlataDeCuentaYConsultarSaldo(){
		CuentaBancaria miCuenta = new CuentaBancaria(1234);
		miCuenta.depositar(100.00);
		Double extraccion = miCuenta.extraer(20.00);
		Double valorEsperado = miCuenta.getSaldoActual();
		assertEquals(valorEsperado, extraccion);
	}

}
