package ej6;

public class Hora {
	//atributos
	private int hh;
	private int mm;
	private int ss;
	//constructores
	public Hora(){
		hh = 0;
		mm = 0;
		ss = 0;
	}
	public Hora(int hh,int mm,int ss) {
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}
	//metodos
	public int getHora() {
		return (this.hh);
	}
	public int getMinutos() {
		return (this.mm);
	}
	public int getSegundos() {
		return (this.ss);
	}
	public String ver() {
		return (this.hh+":"+this.mm+":"+this.ss);
	}
	public String miembro(int h1,int m1,int s1, int h2,int m2, int s2) {
		int hr = h1 + h2;
		int mr = m1 + m2;
		int sr = s1 + s2;
		return (hr+":"+mr+":"+sr);
	}
	//public String miembrof(class Hora f1, class Hora f2) {
		//int hr = f1.hh + f2.hh;
		//int mr = f1.mm + f2.mm;
		//int sr = f1.ss + f2.ss;
		//return (hr+":"+mr+":"+sr);
	//}
}
