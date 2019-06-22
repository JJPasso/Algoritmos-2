package hyp8;

public class Cuentabancaria extends Transaccion{
	private String nombreCliente;
	private int dni;
	public String getNombreCliente() {
		return nombreCliente;
	}
	public int getDni() {
		return dni;
	}
	
	public Cuentabancaria(int id,String n,int dni) {
		saldo = 0;
		num_cuenta = id;
		nombreCliente = n;
		this.dni = dni;
	}
	public void deposito(double d) {
		saldo += d;
	}
	public double extraccion(double d) {
		if (d < saldo) {
			saldo -= d;
			return d;
		}else {
			System.out.println("no hay ese importe en la cuenta");
			return 0;
		}
	}
	public void consulta() {
		System.out.println("el saldo actual en su cuenta es:"+ saldo);
	}
}
