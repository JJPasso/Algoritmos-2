package hyp11;


public class Main {
	public static void main(String[] args) {
		
	TipoDeViaje tviaje = new TipoDeViaje();
	
	try {
		
		tviaje.setTipoDeViaje(0);
		Trayecto viaje1398 = new Trayecto("buenos aires","cordoba",tviaje,200,23,6,50);
		System.out.println("el trayecto de "+ viaje1398.TerminalOrigen +" a "+ viaje1398.TerminalDestino+" tendra un tiempo de demora de "+ viaje1398.TiempodeDemora()+" minutos");
	}catch (IllegalArgumentException e1) {
		System.out.println(e1.getMessage());
		}
	}
}
