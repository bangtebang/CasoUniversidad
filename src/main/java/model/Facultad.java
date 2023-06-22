package model;

import java.util.ArrayList;
import model.Departamento;

public class Facultad {
	private String nombre;
	private int longitud;
	private int latitud;
	private Universidad universidad;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLongitud() {
		return this.longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getLatitud() {
		return this.latitud;
	}

	public void setLatitud(int latitud) {
		this.latitud = latitud;
	}
	public ArrayList<Departamento> getDepartamentos() {
		return this.departamentos;
	}
	public void setDepartamentos(ArrayList<Departamento> departamentos){
		this.departamentos = departamentos;
	}

	public Facultad(String nombre, int longitud,int latitud,Universidad universidad) {
		this.nombre = nombre;
		this.longitud = longitud;
		this.latitud= latitud;
		this.departamentos = new ArrayList<>();
		this.universidad=universidad;
	}
	public void agregarDepartamento(Departamento departamento) {
		departamentos.add(departamento);
	}
	public ArrayList<Profesor> obtenerProfesoresPorNombre(String nombreProfesor) {
		ArrayList<Profesor> profesoresEncontrados = new ArrayList<>();
		for (Departamento departamento : departamentos) {
			for (Profesor profesor : departamento.getProfesores()) {
				if (profesor.getNombre().equals(nombreProfesor)) {
					profesoresEncontrados.add(profesor);
				}
			}
		}
		return profesoresEncontrados;
	}
	public ArrayList<CarreraUniversitaria> obtenerCarrerasUniversitarias() {
		ArrayList<CarreraUniversitaria> carreras = new ArrayList<>();
		for (Departamento departamento : departamentos) {
			carreras.addAll(departamento.getCarrerasUniversitarias());
		}
		return carreras;
	}
}