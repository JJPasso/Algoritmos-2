package interface1;

public class Termometro implements Medible {
	private int temperatura;
	private int incremento;
	private int decremento;
	private boolean turno; // true = incremento, false = decremento
	
	public void setTermometro(int k) throws IllegalArgumentException{
		if (k >= -273) {
			if (temperatura < k) {
				turno = true;
				if (k < 0) {
					incremento = temperatura + k; 
				}else {
					incremento = temperatura - k;
				}
			}else {
				turno = false;
				if (k < 0) {
					decremento = temperatura - k; 
				}else {
					decremento = temperatura + k;
				}
			}
			temperatura = k;
		}
		if (k < -273) {
			 throw new IllegalArgumentException("no puede ser la temperatura menor -273°K");
		}
	}
	public float medida() {
		System.out.println("la temperatura es: "+ temperatura);
		return (float)temperatura;
		
	}
	public boolean incremento(float x) {
		if (x < 0) {
			throw new IllegalArgumentException("el incremento debe ser positivo");
		}
		temperatura += x;
		if (temperatura < -273) {
			throw new IllegalArgumentException("menos de -273K");
		}else{
			return false;
		}
	}
	public boolean decremento(float x) {
		if (x > 0) {
			throw new IllegalArgumentException("el decremento debe ser negativo");
		}
		temperatura += x;
		if (temperatura < -273) {
			throw new IllegalArgumentException("menos de -273K");
			
		}else{
			return false;
		}
	}
}
