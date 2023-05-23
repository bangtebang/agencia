import java.util.ArrayList;
import java.util.List;
public class AgenteDeViaje {
	private String nombre;
	private int edad;
	private String run;
	private ArrayList<Cliente> clientes;
	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRun() {
		return this.run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public AgenteDeViaje(String nombre, int edad, String run) {
		this.nombre= nombre;
		this.edad= edad;
		this.run=run;
		this.clientes= new ArrayList<Cliente>();
	}
}