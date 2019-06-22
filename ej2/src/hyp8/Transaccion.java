package hyp8;

public abstract class Transaccion {
	double saldo;
	int num_cuenta;
	public abstract void consulta();
	public abstract double extraccion(double d);
	public abstract void deposito(double d);
}
