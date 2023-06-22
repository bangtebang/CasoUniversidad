package model;

import java.util.ArrayList;
import model.Administrativo;
import model.Profesor;
import model.CarreraUniversitaria;

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
	}

}