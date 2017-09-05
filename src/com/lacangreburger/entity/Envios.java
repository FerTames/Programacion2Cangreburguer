package com.lacangreburger.entity;

public class Envios {
	private int codigoEnvio;
	private String empresa;
	private int telefono;
	
	public Envios(int codigoEnvio, String empresa, int telefono){
		this.codigoEnvio = codigoEnvio;
		this.empresa = empresa;
		this.telefono = telefono;					
	}
	
	public int getCodigoEnvio() {
		return codigoEnvio;
	}

	public void setCodigoEnvio(int codigoEnvio) {
		codigoEnvio = codigoEnvio;
	}
	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(int empresa) {
		empresa = empresa;
	}
	
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		telefono = telefono;
	}
}
