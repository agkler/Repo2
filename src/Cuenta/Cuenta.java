package Cuenta;

public class Cuenta {

	private Double saldo;

	
	public Cuenta() {
		saldo=0.0;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public Boolean depositar(Double monto) {
		this.saldo= this.saldo + monto;
		return true;
	}
	
	public Boolean extraer(Double monto) {
		if(monto<=this.saldo) {
			this.saldo= this.saldo - monto;
			return true;
		
		}
		return false;	
	}
}
