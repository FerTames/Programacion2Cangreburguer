package com.lacangreburger.entity;

import java.util.*;

public class Pedidos {
	private int NIT;
	private int codigoEmpleado;
	private int codigoEnvio;
	private Date fecha_pedido;
	private Date fecha_entrega;
	private Date fecha_envio;
	private int producto;
	
	public Pedidos(int NIT,int codigoEmpleado,int producto, int codigoEnvio, Date fecha){
		this.NIT = NIT;
		this.codigoEmpleado = codigoEmpleado;
		this.codigoEnvio = codigoEnvio;
		this.fecha_pedido = fecha;
		this.fecha_entrega = fecha;
		this.fecha_envio = fecha;
		this.producto = producto;
	}
	
	public int getcodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setcodigoEmpleado(int codigoEmpleado) {
		codigoEmpleado = codigoEmpleado;
	}
	
	public int getNIT() {
		return NIT;
	}

	public void setNIT(int NIT) {
		NIT = NIT;
	}
	
	public int getcodigoEnvio() {
		return codigoEnvio;
	}

	public void setcodigoEnvio(int codigoEnvio) {
		codigoEnvio = codigoEnvio;
	}
	
	public Date getfecha_pedido() {
		return fecha_pedido;
	}

	public void setfecha_pedido(Date fecha_pedido) {
		fecha_pedido = fecha_pedido;
	}
	
	public Date getfecha_entrega() {
		return fecha_entrega;
	}

	public void setfecha_entrega(Date NIT) {
		fecha_entrega = fecha_entrega;
	}
	
	public Date getfecha_envio() {
		return fecha_envio;
	}

	public void setfecha_envio(Date fecha_envio) {
		fecha_envio = fecha_envio;
	}
	
	public int getProducto() {
		return producto;
	}

	public void setProducto(int producto) {
		producto = producto;
	}
}
