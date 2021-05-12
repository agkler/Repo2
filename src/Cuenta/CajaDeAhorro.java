package Cuenta;

public class CajaDeAhorro extends Cuenta {
	private Double cobroAdicionaldeseispesos;
	private final Double CONCEPTO_ADICIONAL = 6.0;
	private Integer cantidadDeExtracciones= 0;
	
	public CajaDeAhorro() {
		super();
		
	}
	
	public Double getCobroAdicionaldeseispesos() {
		return cobroAdicionaldeseispesos;
	}
	
	public void calcularAdicional(Double saldo){
		cobroAdicionaldeseispesos= saldo + CONCEPTO_ADICIONAL;
		
	}
	
	@Override 
	public Boolean extraer(Double monto) {
		if (cantidadDeExtracciones < 5) {
			if (monto <= super.saldo) {
				this.saldo = super.saldo - monto;
				cantidadDeExtracciones++;
				return true;
			}
			
		} else if (cantidadDeExtracciones >= 5) {
				this.saldo = super.saldo - (monto + CONCEPTO_ADICIONAL);
				cantidadDeExtracciones++;
				return true;
		}
		return false;
	}
	
	
	
}