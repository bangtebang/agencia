package AgenciaDeViaje;

import java.util.ArrayList;
import AgenciaDeViaje.Venta;

public class Cliente extends Persona {
	private ArrayList<Venta> ventas = new ArrayList<Venta>();
	public Cliente(String nombre, int edad, String run) {
		super(nombre, edad, run);
	}
	public String getTipo() {
		return "Cliente";
	}
	public String tipoIngreso() {
		return "Puerta Principal";
	}
}