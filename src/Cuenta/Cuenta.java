package Cuenta;

public class Cuenta {

	protected Double saldo;

	
	public Cuenta() {
		saldo=0.0;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public void depositar(Double monto) {
		this.saldo+= monto;
		
	}

	public Boolean extraer(Double monto) {
		if(monto<=saldo) {
			this.saldo-= monto;
			return true;
		}
		return false;
	}
	
	
}
