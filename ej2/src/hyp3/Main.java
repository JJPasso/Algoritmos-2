package hyp3;
import ej12.Fecha;
public class Main {

	public static void main(String[] args) {
		Fecha fquijote = new Fecha(04,05,1605);
		Libro quijote = new Libro("don quijote de la mancha",1000,500,fquijote);
		Disco Daftpunk = new Disco("Around the World",260,380);
		Daftpunk.infoDisco(Daftpunk);
		quijote.infoLibro(quijote);
	}

}
