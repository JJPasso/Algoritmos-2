package Parciales;

import java.util.List;
import java.util.ArrayList;

public class Empresa {
	
	private String nombre;
	private List<Bien> bienes;
	private static Empresa instancia = null;
	
	private Empresa() {
		nombre = "Empresa unica";
		bienes = new ArrayList<>();
	}
	
	public static Empresa getInstancia() {
		if (instancia == null)
			instancia = new Empresa();
		
		return instancia;
	}
	
	
	public void agregarBien(Bien b) throws BienExistenteException {
		for (Bien x : bienes) {
			if (x.equals(b)) {
				throw new BienExistenteException();
			}
		}
		
		bienes.add(b);
	}
	
	public void quitarBien(Bien b) throws BienInexistenteException {
		if (! bienes.remove(b)) {
			throw new BienInexistenteException();
		}
	}

	public static void notificarTransferencia(Titular titular, int codigo) throws EmailNotSentException {
		// sendMail(titular.getEmail()....);
		System.out.println("Se envia un mail a " + titular.getNombre() + " por la transferencia del bien " + codigo);
		
	}
	
	public void mostrarBienes(Titular titular) {
		System.out.println("Los bienes de " + titular + ":");
		for (Bien x : bienes) {
			if (x.getTitular().equals(titular)) {
				System.out.println(" - " + x);
			}
		}
	}

}
