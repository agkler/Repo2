package Cuenta;

public class CajaDeAhorro extends Cuenta {
	private Double cobroAdicionaldeseispesos;
	private final Double CONCEPTO_ADICIONAL = 6.0;
	
	
	public CajaDeAhorro() {
		super();
		
	}
	
	public Double getCobroAdicionaldeseispesos() {
		return cobroAdicionaldeseispesos;
	}
	
	public void calcularAdicional(Double saldo){
		cobroAdicionaldeseispesos= saldo + CONCEPTO_ADICIONAL;
		
	}
	
	
	
}