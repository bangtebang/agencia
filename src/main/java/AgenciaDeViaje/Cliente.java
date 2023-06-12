package AgenciaDeViaje;

import java.util.ArrayList;
import AgenciaDeViaje.Venta;

public class Cliente {
	private String nombre;
	private int edad;
	private String run;
	private ArrayList<Venta> ventas = new ArrayList<Venta>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRun() {
		return this.run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public Cliente(String nombre, int edad, String run) {
		this.edad=edad;
		this.run=run;
		this.nombre=nombre;
	}
}