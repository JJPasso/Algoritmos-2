package Parciales;

public class Main {
	public static void main(String[] args) {

		Empresa empresa;
		Empresa empresa2;
		
		empresa = Empresa.getInstancia();
		empresa2 = Empresa.getInstancia();
		System.out.println("Instancia empresa: " + empresa);
		System.out.println("Instancia empresa2: " + empresa2);
		
		
		Titular titular1 = new Titular("Juan", "Perez");
		Titular titular2 = new Titular("Laura", "Lopez");
		
		Automotor auto = new Automotor();
		auto.asignarTitular(titular1);
		auto.setValorFiscal(100);
		auto.setValorMercado(120);
		
		
		Cuenta cuenta = new Cuenta(titular2);
		
		try {
			auto.setAlicuota((float) 1.5);
			
			empresa.agregarBien(auto);
			empresa.agregarBien(cuenta);
			
			/* La siguiente linea se comenta porque la transferencia de un titular a si mismo
			 * lanza una excepcion de tipo RuntimeException, lo cual salta al catch y
			 * no continua ejecutando las instrucciones posteriores del try
			 */
			//auto.transferir(titular1);
			
			auto.transferir(titular2);
			
			System.out.println("El impuesto del " + auto + " es: " + auto.calcularImpuesto());
			
		} catch (BienExistenteException e) {
			System.out.println("El bien ya existe");
		} catch (TransferenciaInvalidaException e) {
			System.out.println("La transferencia fue invalida");
		} catch (AlicuotaInvalidaException e) {
			System.out.println("Alicuota invalida");
		}
		
		empresa.mostrarBienes(titular2);

	}

}