package ej12;

public class Fecha {
	int dia;
	int mes;
	int a�o;
	public Fecha(int dia,int mes,int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}
	public boolean esMayor(Fecha f1,Fecha f2) {
		if (f1.a�o > f2.a�o) {
			return true;
		}else {
		if (f1.a�o == f2.a�o) {
			if (f1.mes > f2.mes) {
				return true;
			}else {
				if (f1.dia > f2.dia) {
					return true;
				}else {
					return false;
				}
			}
		}else {
			return false;
		}
	}
}
	public String toSpring() {
		return "Dia:"+dia+"\n"+"Mes:"+mes+"\n"+"A�o:"+a�o;
	}
}
