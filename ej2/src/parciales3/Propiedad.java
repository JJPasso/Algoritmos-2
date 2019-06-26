package parciales3;

public abstract class Propiedad {
	protected String nombrepropietario;
	protected String calle;
	protected int altura;
	protected int piso;
	protected int idAgenteinmobiliario;
	protected Luminosidad luz;
	protected Lugar ll;
	protected Estado es;
	protected Vigilancia v;
	public abstract int importeInmobiliara();
	public abstract int importeDueño();
	public Propiedad(String n,int ai,Lugar ll,Estado es,Vigilancia v){
		nombrepropietario = n;
		idAgenteinmobiliario = ai;
		this.ll = ll;
		this.es = es;
		this.v = v;
		
		
		
	}
	
}
