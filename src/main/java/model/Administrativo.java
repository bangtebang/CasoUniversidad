package model;

import java.util.ArrayList;
import model.Departamento;

public class Administrativo extends Trabajador {
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
	private String horarioAtencion;
	public String getHorarioAtencion() {
		return this.horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public Administrativo(String nombre, String direccion, String estadoCivil, String rut, String horario, String horarioAtencion){
		super(nombre, direccion, estadoCivil, rut, horario,null);
		this.horarioAtencion = horarioAtencion;
	}

	public String getTipo() {
		return "Administrativo";
	}
}