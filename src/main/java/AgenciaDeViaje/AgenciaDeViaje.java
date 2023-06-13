package AgenciaDeViaje;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import AgenciaDeViaje.Agente;

public class AgenciaDeViaje {
	private ArrayList<Agente> agentes;
	private ArrayList<Cliente> clientes;

	public void anadirAgente(Agente agente) {
		if (!agenteExiste(agente)) {
			this.agentes.add(agente);
		}
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

	public Venta generarVenta(Cliente cliente, Agente agente, int precioVenta, String fechaVenta, int idVenta) {
		Venta venta = new Venta(cliente, agente, precioVenta,fechaVenta,idVenta);
		return venta;
	}

	public AgenciaDeViaje() {
		this.clientes = new ArrayList<>();
		this.agentes = new ArrayList<>();
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

	public boolean agenteExiste(Agente agente) {
		for (Agente a : agentes) {
			if (a.getNombre().equals(agente.getNombre()) &&
					a.getRun().equals(agente.getRun())) {

				return true;
			}
		}

		return false;
	}
}