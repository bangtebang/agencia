public class Cliente {
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

	public Cliente(String nombre, int edad, String run) {
		throw new UnsupportedOperationException();
	}
}