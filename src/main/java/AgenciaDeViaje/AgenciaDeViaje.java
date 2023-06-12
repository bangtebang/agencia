package AgenciaDeViaje;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class AgenciaDeViaje {

	private ArrayList<Cliente> clientes;
	private ArrayList<Agente> agentes;

	public AgenciaDeViaje() {
		this.clientes = new ArrayList<>();
		this.agentes = new ArrayList<>();
	}

	public Cliente buscarCliente(String nombre, int edad, String run) {
		for (Cliente cliente : clientes) {
			if (cliente.getNombre().equals(nombre) && cliente.getRun().equals(run) && cliente.getEdad() == (edad)) {
				return cliente;
			}
		}
		return null;
	}

	public void anadirCliente(Cliente cliente) {
		if (!clienteExiste(cliente)) {
			this.clientes.add(cliente);
		}

	}

	public boolean clienteExiste(Cliente cliente) {
		for (Cliente c : clientes) {
			if (c.getNombre().equals(cliente.getNombre()) &&
					c.getRun().equals(cliente.getRun())) {

				return true;
			}
		}

		return false;
	}

	public void anadirAgente(Agente agente) {
		if (!agenteExiste(agente)) {
			this.agentes.add(agente);
		}

	}

	public boolean agenteExiste(Agente agente) {
		for (Agente a : agentes) {
			if (a.getNombre().equals(agente.getNombre()) &&
					a.getRun().equals(agente.getRun())) {

				return true;
			}
		}

		return false;
	}

	public Agente buscarAgente(String nombre, int edad, String run) {
		for (Agente agente : agentes) {
			if (agente.getNombre().equals(nombre) && agente.getRun().equals(run) && agente.getEdad() == (edad)) {
				return agente;
			}
		}
		return null;
	}


	public void eliminarAgente(Agente agente) {
		agentes.remove(agente);
	}

	public Venta generarVenta(Cliente cliente, Agente agente, int precioVenta, int idVenta, int fechaVenta) {
		Venta venta = new Venta(cliente, agente, precioVenta, idVenta, fechaVenta);
		return venta;
	}



		public static void main(String[] args) {
			// Ejemplo de uso
			AgenciaDeViaje agencia = new AgenciaDeViaje();

			// Añadir un cliente
			Cliente cliente1 = new Cliente("Juan",19,"1548516-a");
			agencia.anadirCliente(cliente1);

			// Añadir un vendedor
			Agente vendedor1 = new Agente("Pedro",18,"202848-5");
			agencia.anadirAgente(vendedor1);

			// Buscar cliente
			Cliente clienteEncontrado = agencia.buscarCliente("Juan",19,"1548516-a");
			System.out.println("Cliente encontrado: " + clienteEncontrado.getNombre());

			// Buscar vendedor
			Agente vendedorEncontrado = agencia.buscarAgente("Pedro",18,"202848-5");
			System.out.println("Vendedor encontrado: " + vendedorEncontrado.getNombre());

			// Eliminar vendedor
			agencia.eliminarAgente(vendedor1);

			// Generar venta
			Venta venta = agencia.generarVenta(cliente1, vendedorEncontrado,100,1215,549848);
			System.out.println("Venta generada: " + venta);
		}
}