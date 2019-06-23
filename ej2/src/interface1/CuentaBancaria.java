package interface1;

public class CuentaBancaria implements Medible{
	private float saldo;
	private int num_cuenta;
	private String nombreCliente;
	private int dni;
	public int getNum_cuenta() {
		return num_cuenta;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public int getDni() {
		return dni;
	}
	
	public CuentaBancaria(int id,String n,int dni) {
		saldo = 0;
		num_cuenta = id;
		nombreCliente = n;
		this.dni = dni;
	}
	public float medida() {
		this.consulta();
		return saldo;
	}
	public boolean incremento(float x) {
		deposito(x);
		return true;
	}
	public boolean decremento(float x) {
		double c = extraccion(x);
		if (c == 0.0) {
			throw new IllegalArgumentException("no hay ese importe en la cuenta");
		}else {
			return false;
		}
	}
	private void deposito(float d) {
		saldo += d;
	}
	private double extraccion(float d) {
		if (d < saldo) {
			saldo -= d;
			return d;
		}else {
			return 0.0;
		}
	}
	private void consulta() {
		System.out.println("el saldo actual en su cuenta es:"+ saldo);
	}
}
