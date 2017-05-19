package com.fra.test.models;

public class Cliente {

	private long id;

	private String nombreApellido;

	private String telefono;

	private String direccion;

	private String establecimiento;

	public static Cliente create() {
		return new Cliente();
	}

	public long getId() {
		return id;
	}

	public Cliente setId(long id) {
		this.id = id;
		return this;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public Cliente setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
		return this;
	}

	public String getTelefono() {
		return telefono;
	}

	public Cliente setTelefono(String telefono) {
		this.telefono = telefono;
		return this;
	}

	public String getDireccion() {
		return direccion;
	}

	public Cliente setDireccion(String direccion) {
		this.direccion = direccion;
		return this;
	}

	public String getEstablecimiento() {
		return establecimiento;
	}

	public Cliente setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
		return this;
	}

	@Override
	public String toString() {
		return String.format("Cliente: %s con telefono: %s y direccion: %s",
				nombreApellido, telefono, direccion);
	}

}
