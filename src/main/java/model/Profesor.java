package model;

import java.util.ArrayList;
import model.Departamento;

public class Profesor extends Trabajador {
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
	private String tipoContrato;

	public Profesor(String nombre, String direccion, String estadoCivil, String rut, String horario, String tipoContrato) {
		super(nombre, direccion, estadoCivil, rut, horario);
		this.tipoContrato = tipoContrato;
	}

	public String getTipo() {
		return "Profesor";
	}
}