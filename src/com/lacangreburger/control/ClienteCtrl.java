package com.lacangreburger.control;
import com.lacangreburger.entity.Cliente;


public class ClienteCtrl {

private Conexion conexion;
	
	public ClienteCtrl (Conexion conexion) {
		this.conexion = conexion;
	}


	public int Insertar(Cliente cli) throws Throwable
	{
		conexion.SQL("Insert into cliente(NIT,nombre,direccion,telefono) VALUES(?,?,?,?)");
		conexion.preparedStatement().setInt(1, cli.getNIT());
		conexion.preparedStatement().setString(2, cli.getNombre());
		conexion.preparedStatement().setString(3, cli.getDireccion());
		conexion.preparedStatement().setString(4, cli.getTelefono());
		conexion.CUD();
		return cli.getNIT();
	}
}
