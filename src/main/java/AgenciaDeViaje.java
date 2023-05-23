import java.util.List;
import java.util.ArrayList;

public class AgenciaDeViaje {
	private ArrayList<AgenteDeViaje> agentes;
	public List<AgenteDeViaje> getAgentes() {
		return this.agentes;
	}
	public AgenteDeViaje agregarAgente(String nombre, int edad, String run) {
		AgenteDeViaje agente = new AgenteDeViaje(nombre,edad,run);
		this.agentes.add(agente);
		return agente;
	}

	public List<Cliente> buscarCliente(String nombre,String run) {
		List<Cliente> clientes = new ArrayList<Cliente>();
		//recorre la lista de Clientes
		for (AgenteDeViaje agente: this.agentes) {
			//por cada agente, recorre su lista de clientes
				if (agente.getNombre().equals(nombre)&&agente.getRun().equals(run)) {
					clientes.addAll(agente.getClientes());}
		}
		return clientes;
	}

	public AgenciaDeViaje() {
		this.agentes = new ArrayList<AgenteDeViaje>();
	}

	}
