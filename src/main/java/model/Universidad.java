package model;

import java.util.ArrayList;
import model.Trabajador;
import model.Facultad;

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

	public String getDireccionesAsociadas() {
		return this.direccionesAsociadas;
	}

	public void setDireccionesAsociadas(String direccionesAsociadas) {
		this.direccionesAsociadas = direccionesAsociadas;
	}

	public Universidad(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.facultades = new ArrayList<>();
	}


}