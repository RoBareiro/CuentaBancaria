package ar.edu.unlam.tallerweb.cuentaBancaria;

public class CuentaBancaria {
		private Double saldoActual = 0.0;

		public CuentaBancaria(Integer numeroDeCuenta){
			this.saldoActual = saldoActual;
		}
		
		public Double getSaldoActual(){
			return saldoActual;
		}

		public Double depositar(Double deposito) {
			Double saldoADepositar = deposito;
			if(saldoADepositar>=1){
				saldoActual = saldoActual + saldoADepositar;
			}
			return saldoActual;
		}

		public Double extraer(Double dineroAExtraer) {
			Double dineroExtraido = dineroAExtraer;
			Double saldoAuxiliar = saldoActual - dineroExtraido;
			if((dineroExtraido>=1)&&(saldoAuxiliar>=1)){
				saldoActual = saldoAuxiliar;
			}
			return saldoActual;
		}
		
}
