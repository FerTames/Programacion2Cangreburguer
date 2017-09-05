package com.lacangreburger.control;

import com.lacangreburger.entity.Cliente;

public class Factura {
	private Conexion conexion;
	public Factura (Conexion conexion) {
		this.conexion = conexion;
	}


	public int Insertar(int nit) throws Throwable
	{
		try
		{
			conexion.SQL("Insert into factura(NIT) VALUES(?)");
			conexion.preparedStatement().setInt(1, nit);
			return 1;
		}catch(Exception e){return 0;}
		
	}

}
