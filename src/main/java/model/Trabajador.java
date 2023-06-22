package model;

public abstract class Trabajador {
	private String tituloProfesional;
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private String rut;
	private String horario;
	private final Universidad universidad;

	public abstract String getTipo();

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getHorario() {
		return this.horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Trabajador(String nombre, String direccion, String estadoCivil, String rut, String horario,final Universidad universidad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.rut = rut;
		this.horario = horario;
		this.universidad=universidad;
	}
	public Trabajador(String nombre, String direccion, String estadoCivil, String rut,final Universidad universidad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.rut = rut;
		this.universidad=universidad;
	}
}
