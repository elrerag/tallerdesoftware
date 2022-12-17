package org.tds.sgh.business;

import java.util.Date;

class Documento {
}

public class Reserva {
	private Date fechaInicio;
	private Date fechaTermino;
	private Date estado;
	private Boolean activa;
	private Boolean esModificable;

	public Reserva() {
	}

	public Reserva(Date fechaInicio, Date fechaTermino, Date estado, Boolean activa, Boolean esModificable) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaTermino = fechaTermino;
		this.estado = estado;
		this.activa = activa;
		this.esModificable = esModificable;
	}

	@Override
	public String toString() {
		return "Reserva [fechaInicio=" + fechaInicio + ", fechaTermino=" + fechaTermino + ", estado=" + estado
				+ ", activa=" + activa + ", esModificable=" + esModificable + "]";
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaTermino() {
		return fechaTermino;
	}

	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public Date getEstado() {
		return estado;
	}

	public void setEstado(Date estado) {
		this.estado = estado;
	}

	public Boolean getActiva() {
		return activa;
	}

	public void setActiva(Boolean activa) {
		this.activa = activa;
	}

	public Boolean getEsModificable() {
		return esModificable;
	}

	public void setEsModificable(Boolean esModificable) {
		this.esModificable = esModificable;
	}

	public Boolean coincideCR(int codigoResrva) {
		return false;
	}

	public Boolean estaPendiente(int codigoResrva) {
		return false;
	}

	public Boolean agregarHuesped(String nombre, int codDocumento) {
		return false;
	}

	public Boolean esModificable() {
		return false;
	}

	public Boolean estaAsignada(int codHabitacion) {
		return false;
	}

	public Boolean coincide(String nombreTipoHabitacion, Date fechaInicio, Date fechaFin) {
		return false;
	}

	public Boolean perteneceA(int codCliente) {
		return false;
	}

}
