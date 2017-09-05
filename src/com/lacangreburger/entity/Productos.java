package com.lacangreburger.entity;

import java.util.Date;

public class Productos {
	private int codigoProducto;
	private int cantidadUnidad;
	private int precioUnidad;
	private int unidadesPedido;
	private String nombreProducto;
	
	public Productos(int codigoProducto, int cantidadUnidad, int precioUnidad, int unidadesPedido, String nombreProducto){
				this.codigoProducto = codigoProducto;
				this.cantidadUnidad = cantidadUnidad;
				this.precioUnidad = precioUnidad;
				this.unidadesPedido = unidadesPedido;
				this.nombreProducto = nombreProducto;				
	}
	
	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		codigoProducto = codigoProducto;
	}
	
	public int getCantidadUnidad() {
		return cantidadUnidad;
	}

	public void setCantidadUnidad(int cantidadUnidad) {
		cantidadUnidad = cantidadUnidad;
	}
	
	public int getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(int precioUnidad) {
		precioUnidad = precioUnidad;
	}
	
	public int getUnidadesPedido() {
		return unidadesPedido;
	}

	public void setUnidadesPedido(int unidadesPedido) {
		unidadesPedido = unidadesPedido;
	}
	
	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		nombreProducto = nombreProducto;
	}
}
