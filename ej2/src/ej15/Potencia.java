package ej15;

public class Potencia {
		private float base;
		private int exp;
		public Potencia(float b,int e) {
			base = b;
			exp = e;
		}
		public float getBase() {
			return base;
		}
		public int getExp() {
			return exp;
		}
		
		public float evaluar(float b,int e) {
			if (e < 0) {
				return 1/evaluar(b,-e);
			}else {
				if (e == 0) {
					return 1;
				}else {
					return b*evaluar(b,e-1);
				}
			}
		}
}
