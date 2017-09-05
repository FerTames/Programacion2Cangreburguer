package com.lacangreburger.entity;

import java.util.Date;

public class Empleado {
	private int CodigoEmpleado;
	private String Nombre;
	private String Apellido;
	private String Direccion;
	private String Telefono;
	private Date FechaContrato;
	private Date FechaNacimiento;
	private String Cargo;
	
	public Empleado(int codigoEmpleado, String nombre, String apellido, String direccion, String telefono,
	Date fechaContrato,
	Date fechaNacimiento,
	String cargo){
		this.CodigoEmpleado = codigoEmpleado;
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Direccion = direccion;
		this.Telefono = telefono;
		this.FechaContrato = fechaContrato;
		this.FechaNacimiento = fechaNacimiento;
		this.Cargo = cargo;
	}

	public int getCodigoEmpleado() {
		return CodigoEmpleado;
	}

	public void setCodigoEmpleado(int codigoEmpleado) {
		CodigoEmpleado = codigoEmpleado;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public Date getFechaContrato() {
		return FechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		FechaContrato = fechaContrato;
	}

	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	@Override
	public String toString() {
		return "Empleado [CodigoEmpleado=" + CodigoEmpleado + ", Nombre=" + Nombre + ", Apellido=" + Apellido
				+ ", Direccion=" + Direccion + ", Telefono=" + Telefono + ", FechaContrato=" + FechaContrato
				+ ", FechaNacimiento=" + FechaNacimiento + ", Cargo=" + Cargo + "]";
	}
	
	
	
}
