package ej12;

public class Fecha {
	int dia;
	int mes;
	int año;
	public Fecha(int dia,int mes,int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	public boolean esMayor(Fecha f1,Fecha f2) {
		if (f1.año > f2.año) {
			return true;
		}else {
		if (f1.año == f2.año) {
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
		return "Dia:"+dia+"\n"+"Mes:"+mes+"\n"+"Año:"+año;
	}
}
