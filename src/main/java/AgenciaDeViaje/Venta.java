package AgenciaDeViaje;

import java.util.ArrayList;
import java.util.Date;

public class Venta {
	private int precioVenta;
	private int fechaVenta;
	private int idVenta;
	private Agente agente;
	private Cliente cliente;


	public int getPrecioVenta() {
		return this.precioVenta;
	}

	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getFechaVenta() {
		return this.fechaVenta;
	}

	public void setFechaVenta(int fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public int getIdVenta() {
		return this.idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public Venta(Cliente cliente,Agente agente, int  precioVenta, int idVenta, int fechaVenta) {
		this.fechaVenta=fechaVenta;
		this.idVenta=idVenta;
		this.precioVenta=precioVenta;
		this.cliente=cliente;
		this.agente=agente;
	}
}
