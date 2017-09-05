package application;

import com.lacangreburger.entity.Empleado;

public class EmpleadoCtrl {
private Conexion conexion;
	
	public EmpleadoCtrl (Conexion conexion) {
		this.conexion = conexion;
	}


	public int Insertar(Empleado emp) throws Throwable
	{
		conexion.SQL("Insert into empleados(codigoEmpleado,nombre,apellidos,direccion,telefono,fecha_contrato,fecha_nacimiento,cargo) VALUES(?,?,?,?,?,?,?,?)");
		conexion.preparedStatement().setInt(1, emp.getCodigoEmpleado());
		conexion.preparedStatement().setString(2, emp.getNombre());
		conexion.preparedStatement().setString(3, emp.getApellido());
		conexion.preparedStatement().setString(4, emp.getDireccion());
		conexion.preparedStatement().setString(5, emp.getTelefono());
		conexion.preparedStatement().setDate(6, new java.sql.Date(emp.getFechaContrato().getTime()));
		conexion.preparedStatement().setDate(7, new java.sql.Date(emp.getFechaNacimiento().getTime()));
		conexion.preparedStatement().setString(8, emp.getCargo());
		conexion.CUD();
		return emp.getCodigoEmpleado();
	}

}
