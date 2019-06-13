package excepciones3;

public class Main {

	public static void main(String[] args) {
		
		int x = 10;
		
		MatriculaAuto n = new MatriculaAuto();
		try {
			x=9;
			n.setMatricula('c', 123456789);
			x = 11;
			
		}catch (Letrainvalidaexception e1) {
			System.out.println("letra invalida:" + e1.getMessage());
		}catch (Numeroinvalidoexception e2) {
			System.out.println("el numero es fruta");
		}
		System.out.println(x);

	}

}
