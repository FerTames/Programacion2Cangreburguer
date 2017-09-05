package application;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.lacangreburger.entity.Envios;

public class EnviosCtrl {
	private Conexion conexion;
	
	public EnviosCtrl (Conexion conexion) {
		this.conexion = conexion;
	}
	
	public ArrayList<Envios> ListarProductos() throws Throwable {
		ArrayList<Envios> EnviosList = new ArrayList<Envios>();
		ResultSet rs;		

		conexion.SQL("Select * from envios");

		rs = conexion.resultSet();

		while (rs.next()) {
			Envios envios = new Envios(rs.getInt("codigoEnvio"),
					rs.getString("empresa"),
					rs.getInt("telefono"));
			EnviosList.add(envios);
		}

		return EnviosList;

	}
}
