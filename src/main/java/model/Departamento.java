package model;

import java.util.ArrayList;

public class Departamento {
	private String nombre;
	private Facultad facultad;
	private ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	private ArrayList<CarreraUniversitaria> carrerasUniversitarias = new ArrayList<CarreraUniversitaria>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Departamento(String nombre) {
		this.nombre = nombre;
		this.profesores = new ArrayList<>();
		this.carrerasUniversitarias = new ArrayList<>();
		this.administrativos = new ArrayList<>();
	}
	public ArrayList<Profesor> getProfesores() {
		return this.profesores;
	}
	public void setProfesores(ArrayList<Profesor> profesores){
		this.profesores= profesores;
	}
	public ArrayList<Administrativo> getAdministrativos() {
		return this.administrativos;
	}
	public void setAdministrativos(ArrayList<Administrativo> administrativos){
		this.administrativos= administrativos;
	}
	public void agregarProfesor(Profesor profesor) {
		profesores.add(profesor);
	}
	public void agregarCarreraUniversitaria(CarreraUniversitaria carreraUniversitaria) {
		carrerasUniversitarias.add(carreraUniversitaria);
	}
	public ArrayList<Profesor> obtenerProfesoresPorTipoContrato(String tipoContrato) {
		ArrayList<Profesor> profesoresFiltrados = new ArrayList<>();
		for (Profesor profesor : profesores) {
			if (profesor.getTipoContrato().equals(tipoContrato)) {
				profesoresFiltrados.add(profesor);
			}
		}
		return profesoresFiltrados;
	}
	public ArrayList<CarreraUniversitaria> getCarrerasUniversitarias() {
		return this.carrerasUniversitarias;
	}
	public void setCarrerasUniversitarias(ArrayList<CarreraUniversitaria> carrerasUniversitarias){
		this.carrerasUniversitarias = carrerasUniversitarias;
	}

}