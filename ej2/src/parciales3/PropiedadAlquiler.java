    
package parciales3;

public class PropiedadAlquiler extends Propiedad implements Confirmable {
	public PropiedadAlquiler (String n,int ai,Lugar ll,Estado es,Vigilancia v) {
		super(n,ai,ll,es,v);
	}
	public float importeInmobiliara(int montomensual,int n) throws ComisionincorrectaException {
	if ((n == 3)||(n == 3.5 )||(n == 4)||(n == 4.5)) {	
		Confirmar();
		return(montomensual+((n*100)/montomensual));
	}else {
		throw new ComisionincorrectaException();
	}
	}
	private void Confirmar() {
		System.out.println("transaccion ok");
	}

}
