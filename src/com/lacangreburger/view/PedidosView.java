package com.lacangreburger.view;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.lacangreburger.control.Conexion;
import com.lacangreburger.control.PedidosCtrl;
import com.lacangreburger.entity.Pedidos;

public class PedidosView {	
	private Scanner scanner;
	private Pedidos pedidos;
	private PedidosCtrl pedidosCtrl;
	
	public PedidosView(Conexion conexion, Scanner scanner) {		
		this.scanner = scanner;
		pedidosCtrl = new PedidosCtrl(conexion);		
	}
	
	public int ConfirmarPedido(int idEmpleado,int idCliente,int idEleccion,int idEnvio){
		
		System.out.println("Confirma que desa pedir el combo "+ idEleccion + "envio: "+ idEnvio );
		int confirmacionPedido = ReadTypes.leerEntero(scanner,"1-> si, 2->no");		
		if(confirmacionPedido == 1)
		{
			Date fechaActual = new Date();
			pedidos = new Pedidos(idCliente,idEmpleado,idEleccion,idEnvio, fechaActual);
			
			try {
				return pedidosCtrl.Insertar(pedidos);
				//AQUI INGRESAMEEE
			} catch (Throwable e) {
				System.out.println(e.getMessage());
				return 0;
			}
		}
		else
		{
			return 0;
		}
		
	}
}
