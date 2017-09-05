package com.lacangreburger.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.lacangreburger.control.Conexion;
import com.lacangreburger.control.EmpleadoCtrl;
import com.lacangreburger.control.ProductosCtrl;
import com.lacangreburger.entity.Empleado;
import com.lacangreburger.entity.Productos;

public class ProductosView {
	
	private Scanner scanner;
	private Productos producto;
	private ProductosCtrl productoCtrl;
	
	public ProductosView(Conexion conexion, Scanner scanner) {
		
		this.scanner = scanner;
		productoCtrl = new ProductosCtrl(conexion);
		
	}
	
	public void listar() {
		ArrayList<Productos> clientes;

		try {
			clientes = productoCtrl.ListarProductos();
			for (int i = 0; i < clientes.size(); i++) {
				System.out.print(clientes.get(i).getCodigoProducto());
				System.out.print(" -> ");
				System.out.println(clientes.get(i).getNombreProducto());
			}
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}
}
