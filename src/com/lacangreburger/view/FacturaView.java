package com.lacangreburger.view;

import com.lacangreburger.control.Conexion;
import com.lacangreburger.control.Factura;
import com.lacangreburger.entity.Cliente;

public class FacturaView {
	Conexion conexion;
	
	public FacturaView( Conexion conexion)
	{
		this.conexion = conexion;
	}
	
	public int InsertarFactura(int Nit){
		Factura factura= new Factura(conexion);
		
		try {
			return factura.Insertar(Nit);

		} catch (Throwable e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

}
