package Cuenta;

public class CuentaCorriente extends Cuenta {
	private final Double DESCUBIERTO_MAX= 150.0;
	private final Double COMISION= 0.05;
	
	private Double descubiertoActual= 0.0;
	private Double deuda= 0.0;
	
	public CuentaCorriente() {
		super();
		
	}
	
	@Override
	public Boolean extraer(Double monto) {
		Double descubiertoInicial= descubiertoActual;
		if (monto <= saldo) {
			saldo -= monto;
			return true;
		} else if (monto <= (saldo+(DESCUBIERTO_MAX-descubiertoActual))) {
			descubiertoActual+= (monto-saldo);
			deuda+= ((descubiertoActual-descubiertoInicial)*COMISION);
			saldo= 0.0;
			return true;
		}
		return false;
	}
}
