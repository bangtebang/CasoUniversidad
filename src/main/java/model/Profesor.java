package model;

import java.util.ArrayList;
import model.Departamento;

public class Profesor extends Trabajador {
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
	private String tipoContrato;

	public String getTipoContrato() {
		return this.tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public Profesor(String nombre, String direccion, String estadoCivil, String rut, String tipoContrato) {
		super(nombre, direccion, estadoCivil, rut, null);
		this.tipoContrato = tipoContrato;
	}

	public String getTipo() {
		return "Profesor";
	}

	public void asignarHorario(int opcion) {
		switch (opcion) {
			case 1 -> super.setHorario("Jornada parcial");
			case 2 -> super.setHorario("Media Jornada");
			case 3 -> super.setHorario("Jornada completa");
		}
	}
}