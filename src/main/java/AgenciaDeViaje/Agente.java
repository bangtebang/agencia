package AgenciaDeViaje;

import java.util.ArrayList;
import AgenciaDeViaje.Venta;

public class Agente extends Persona {
	private AgenciaDeViaje agenciaDeViaje;
	private ArrayList<Venta> ventas = new ArrayList<Venta>();

	public Agente(String nombre, int edad, String run) {
		super(nombre, edad, run);
	}
}
