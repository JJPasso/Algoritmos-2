package excepciones3;

public class MatriculaAutoException extends Exception{}
public class Letrainvalidaexception extends MatriculaAutoException{}
public class Numeroinvalidoexception extends MatriculaAutoException{}
public class MatriculaAuto {
	private char letra;
	private int numero;
	public MatriculaAuto(char l,int n) {
		letra = l;
		numero = n;
	}
	public char getLetra() {
		return letra;
	}
	public int getNumero() {
		return numero;
	}
	public void setMatricula (char l,int n) throws Letrainvalidaexception(), Numeroinvalidoexception(){
		if (l != A)&&(l != B){} throw new Letrainvalidaexception();
		if (n < 10000000 || n > 99999999) {} throw new Numeroinvalidoexception();
		
	}
}
