package excepciones3;

public class Main {

	public static void main(String[] args) {
		
		MatriculaAuto n = new MatriculaAuto(A,345677);
		try {
			n.setMatricula(c, 123456789);
		}catch (Letrainvalidaexception e1) {
			System.out.println("letra invalida");
		}catch (Numeroinvalidoexception e2) {
			System.out.println("el numero es fruta");
		}

	}

}
