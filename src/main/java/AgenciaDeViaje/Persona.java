package AgenciaDeViaje;

public class Persona {
	private String nombre;
	private int edad;
	private String run;

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
	public Persona(String nombre,int edad,String run) {
		this.nombre=nombre;
		this.edad=edad;
		this.run=run;
	}
}