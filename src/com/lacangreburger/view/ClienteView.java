package com.lacangreburger.view;

import java.util.Date;
import java.util.Scanner;

import com.lacangreburger.control.ClienteCtrl;
import com.lacangreburger.control.Conexion;
import com.lacangreburger.entity.Cliente;

public class ClienteView {

	

		private Scanner scanner;
		private Cliente cliente;
		private ClienteCtrl clienteCtrl;
		
		public ClienteView(Conexion conexion, Scanner scanner) {
		
			this.scanner = scanner;
			clienteCtrl = new  ClienteCtrl(conexion);
			
		}
		
		public int InsertarCliente(){
			int NIT;
			String nombre;
			String direccion;
			String telefono;
			
			
			System.out.println("BIENVENIDO REGISTRE AL CLIENTE POR FAVOR");
			System.out.println("------------------- ");
			NIT= ReadTypes.leerEntero(scanner, "Ingrese el NIT de cliente: ");
			nombre = ReadTypes.leerCadena(scanner, "Ingrese el nombre: ");
			direccion = ReadTypes.leerCadena(scanner, "Ingrese el direccion: ");
			telefono = ReadTypes.leerCadena(scanner, "Ingrese el telefono: ");
			
		    Cliente cliente= new Cliente(NIT, nombre, direccion, telefono );
			
			try {
				return clienteCtrl.Insertar(cliente);

			} catch (Throwable e) {
				System.out.println(e.getMessage());
				return 0;
			}
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
		
}
