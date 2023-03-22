package POO;

public class cuentaBanco {
	private int numeroCuenta;
	private String titular;
	private double saldo;
	
	public cuentaBanco(int numeroCuenta, String titular, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}
	public cuentaBanco(final cuentaBanco a) {
		numeroCuenta = a.numeroCuenta;
		titular = a.titular;
		saldo = a.saldo;
	}
	public int getNumeroCuenta() {
		return this.numeroCuenta;
	}
	public String getTitular() {
		return this.titular;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean ingreso(double monto) {
	    boolean ingresoCorrecto = true;
	    if (monto < 0) {
	        ingresoCorrecto = false;
	    } else {
	        saldo = saldo + monto;
	    }
	    return ingresoCorrecto;
	}
	public boolean depositar(double monto) {
		boolean resultado = true;
		if(monto < 0) {
			resultado = false;
		}else if(this.saldo >= monto) {
			this.saldo -= monto;
		}else {
			resultado = false;
		}
		
		return resultado;
	}
	public boolean retirar(double monto) {
		boolean resultado = true;
		if(monto < 0) {
			resultado = false;
		}else if(this.saldo >= monto) {
			this.saldo -= monto;
		}else {
			resultado = false;
		}
		return resultado;
	}
	public boolean transferencia(cuentaBanco c, double monto) {
		boolean correcto = true;
		if(monto<0) {
			correcto = false;
		}else if(saldo >= monto) {
			retirar(monto);
			c.ingreso(monto);
		}else {
			correcto = false;
		}
		return correcto;
	}
	
	
}
