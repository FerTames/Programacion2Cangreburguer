package com.lacangreburger.view;
import java.sql.SQLException;
import java.util.Scanner;

import com.lacangreburger.Menu.MenuCliente;
import com.lacangreburger.control.Conexion;
import com.lacangreburger.control.Factura;
import com.lacangreburger.entity.Cliente;

public class Pantalla {
	static Conexion conexion = new Conexion();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Conexion conexion = new Conexion();
		try 
		{			
			EmpleadoView empleado = new EmpleadoView(conexion,scanner);
			int idEmpleado = empleado.InsertarEmpleado();
			ClienteView cliente = new ClienteView(conexion , scanner);
			int idCliente = cliente.InsertarCliente();
			ProductosView productos = new ProductosView(conexion , scanner);
			boolean enPedido = true;
			do
			{
				System.out.println("Combos Lacangreburguer  ");
				System.out.println("------------------- ");
				productos.listar();
				int idEleccion = ReadTypes.leerEntero(scanner,"Elija un combo ");
				int idEnvio = VerificarEnvio(scanner);
				PedidosView pedido = new PedidosView(conexion , scanner);
				int confirmarPedido = pedido.ConfirmarPedido(idEmpleado, idCliente, idEleccion, idEnvio);
				if(confirmarPedido == 0)
				{
					System.out.println("Pedido Cancelado");
				}				
				else
				{
					System.out.println("Su pedido esta en proceso");
					FacturaView factura = new FacturaView(conexion);
					factura.InsertarFactura(idCliente);
					System.out.println("Se creo la factura con Nit "+ idCliente);
					System.out.println("muchas gracias por su compra");				
				}
				
				int seguirPedido = ReadTypes.leerEntero(scanner,"Desea hacer otro pedido? 1 -> si, 2 -> no");
				if(seguirPedido != 1)
					enPedido = false;
			}while(enPedido);
			System.out.println("Proceso Terminado");
			conexion.close();
		} catch (SQLException e) {
			System.out.println(e.getSQLState());
		}
		
		
		scanner.close();
	}

	static private int VerificarEnvio(Scanner scanner)
	{
		EnviosView envios = new EnviosView(conexion , scanner);
		envios.listar();
		int idEnvio = ReadTypes.leerEntero(scanner,"Elija una empresa para envio");
		return idEnvio;
		
	}
	
}

