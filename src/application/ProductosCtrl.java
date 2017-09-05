package application;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.lacangreburger.entity.Productos;

public class ProductosCtrl {
	
	private Conexion conexion;
	
	public ProductosCtrl (Conexion conexion) {
		this.conexion = conexion;
	}
	
	public ArrayList<Productos> ListarProductos() throws Throwable {
		ArrayList<Productos> Productos = new ArrayList<Productos>();
		ResultSet rs;		

		conexion.SQL("Select * from productos");

		rs = conexion.resultSet();

		while (rs.next()) {
			Productos producto = new Productos(rs.getInt("codigoProducto"),
					rs.getInt("cantidad_unidad"),
					rs.getInt("precio_unidad"),
					rs.getInt("unidades_pedido"),
					rs.getString("nombreProducto"));
			Productos.add(producto);
		}

		return Productos;

	}
}
