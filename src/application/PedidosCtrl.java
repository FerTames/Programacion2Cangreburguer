package application;
import java.sql.ResultSet;

import com.lacangreburger.entity.Empleado;
import com.lacangreburger.entity.Pedidos;

public class PedidosCtrl {
	private Conexion conexion;
	
	public PedidosCtrl (Conexion conexion) {
		this.conexion = conexion;
	}
	
	public int Insertar(Pedidos pedido) throws Throwable
	{
		ResultSet rs;
		conexion.SQL("Insert into pedidos(NIT,codigoEmpleado,codigoEnvio,fecha_pedido,fecha_entrega,fecha_envio) VALUES(?,?,?,?,?,?)");
		conexion.preparedStatement().setInt(1, pedido.getNIT());
		conexion.preparedStatement().setInt(2, pedido.getcodigoEmpleado());
		conexion.preparedStatement().setInt(3, pedido.getcodigoEnvio());
		conexion.preparedStatement().setDate(4, new java.sql.Date(pedido.getfecha_pedido().getTime()));
		conexion.preparedStatement().setDate(5, new java.sql.Date(pedido.getfecha_entrega().getTime()));
		conexion.preparedStatement().setDate(6, new java.sql.Date(pedido.getfecha_envio().getTime()));
		conexion.CUD();
		
		conexion.SQL("Select * from pedidos Order by codigoPedidos desc");
		rs = conexion.resultSet();
		int pedidoID = 0;
		if (rs.next()) {
			pedidoID = rs.getInt("codigoPedidos");
		}
		
		
		conexion.SQL("Insert into detallesdepedido(codigoPedidos,codigoProducto,precio_unidad,cantidad) VALUES(?,?,?,?)");
		conexion.preparedStatement().setInt(1, pedidoID);
		conexion.preparedStatement().setInt(2, pedido.getProducto());
		conexion.preparedStatement().setInt(3, 0);
		conexion.preparedStatement().setInt(4, 1);		
		
		conexion.CUD();
		return pedidoID;
	}
}
