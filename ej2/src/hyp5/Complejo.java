package hyp5;

public class Complejo extends Numero<Complejo> {
	private int r;
	private int i;
	public Complejo(int r,int i){
		this.r = r;
		this.i = i;
	}
	public void multiplicacion(Complejo c,Complejo r,Complejo d) {
		int rf1 = c.getReal() * r.getReal();
		int if1 = c.getReal() * getImaginario();
		int if2 = c.getImaginario() * getReal();
		int rf2 = c.getImaginario() * getImaginario();
		rf2 = rf2 * -1;
		int rr = rf1 + rf2;
		int ii = if1 + if2;
		d = new Complejo(rr,ii);
	}
	public int getReal() {
		return (this.r);
	}
	public int getImaginario() {
		return (this.i);
	}
	public void setReal(int r) {
		this.r = r;
	}
	public void setImaginario(int i) {
		this.i = i;
	}

	public void suma(Complejo c,Complejo r,Complejo d) {
		int rr = c.getReal() + r.getReal();
		int i = c.getImaginario() + r.getImaginario();
		d = new Complejo(rr,i);
	}
	

	

}
