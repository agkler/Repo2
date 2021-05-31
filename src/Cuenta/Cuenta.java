package Cuenta;

public class Cuenta {
	private Integer numero;
	private String apellidoTitular;
	private String nombreTitular;
	
	protected Double saldo;

	
	public Cuenta() {
		saldo=0.0;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public Boolean depositar(Double monto) {
		this.saldo+= monto;
		return true;
		
	}

	public Boolean extraer(Double monto) {
		if(monto<=saldo) {
			this.saldo-= monto;
			return true;
		}
		return false;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getApellidoTitular() {
		return apellidoTitular;
	}

	public void setApellidoTitular(String apellidoTitular) {
		this.apellidoTitular = apellidoTitular;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	
	
}
