package model;

import java.util.ArrayList;

public class Universidad {
	private String nombre;
	private String tipo;
	private String direccionesAsociadas;
	private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
	private ArrayList<Facultad> facultades = new ArrayList<Facultad>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void asignarTipo(int opcion) {
		switch (opcion) {
			case 1 -> setTipo("Publica");
			case 2 -> setTipo("Privada");
		}
	}

	public String getDireccionesAsociadas() {
		return this.direccionesAsociadas;
	}

	public void setDireccionesAsociadas(String direccionesAsociadas) {
		this.direccionesAsociadas = direccionesAsociadas;
	}

	public Universidad(String nombre) {
		this.nombre = nombre;
		this.facultades = new ArrayList<>();
	}
	public ArrayList<Profesor> obtenerProfesores() {
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		for(Trabajador trabajador : this.trabajadores){
			if(trabajador.getTipo().equals("Profesor")){
				profesores.add((Profesor) trabajador);
			}
		}
		return profesores;
	}
	public ArrayList<Administrativo> obtenerAdministrativos() {
		ArrayList<Administrativo> administrativos = new ArrayList<>();
		for (Facultad facultad : this.facultades) {
			for (Departamento departamento : facultad.getDepartamentos()) {
				administrativos.addAll(departamento.getAdministrativos());
			}
		}
		return administrativos;
	}
}