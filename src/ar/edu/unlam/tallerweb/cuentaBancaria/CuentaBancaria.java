package ar.edu.unlam.tallerweb.cuentaBancaria;

public class CuentaBancaria {
		private Double saldoActual = 0.0;
		
		public Double getSaldoActual(){
			return saldoActual;
		}

		public void depositar(Double deposito) {
			Double saldoADepositar = deposito;
			if(saldoADepositar>=1){
				saldoActual = saldoActual + saldoADepositar;
			}
		}

		public Boolean extraer(Double dineroAExtraer) {
			Double dineroExtraido = dineroAExtraer;
			Double saldoAuxiliar = saldoActual - dineroExtraido;
			
			if((dineroExtraido>=1)&&(saldoAuxiliar>=0)){
				saldoActual = saldoAuxiliar;
				return true;
			} else {
				return false;
			}
		}
		
}
