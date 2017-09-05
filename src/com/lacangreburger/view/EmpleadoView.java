package com.lacangreburger.view;

import java.util.Date;
import java.util.Scanner;

import com.lacangreburger.control.Conexion;
import com.lacangreburger.control.EmpleadoCtrl;
import com.lacangreburger.entity.Empleado;

import java.text.DateFormat;

public class EmpleadoView {
	private Scanner scanner;
	private Empleado empleado;
	private EmpleadoCtrl empleadoCtrl;
	
	public EmpleadoView(Conexion conexion, Scanner scanner) {
	
		this.scanner = scanner;
		empleadoCtrl = new  EmpleadoCtrl(conexion);
		
	}
	
	public int InsertarEmpleado(){
		int CodigoEmpleado;
		String Nombre;
		String Apellido;
		String Direccion;
		String Telefono;
		Date FechaContrato;
		Date FechaNacimiento;
		String Cargo;


		CodigoEmpleado = ReadTypes.leerEntero(scanner, "Ingrese el codigo de empleado: ");
		Nombre = ReadTypes.leerCadena(scanner, "Ingrese el nombre: ");
		Apellido = ReadTypes.leerCadena(scanner, "Ingrese el apellido: ");
		Direccion = ReadTypes.leerCadena(scanner, "Ingrese el direccion: ");
		Telefono = ReadTypes.leerCadena(scanner, "Ingrese el telefono: ");
		FechaContrato = ReadTypes.leerFecha(scanner, "Ingrese fecha de contrato: ");
		FechaNacimiento = ReadTypes.leerFecha(scanner, "Ingrese fecha de nacimiento: ");
	    Cargo = ReadTypes.leerCadena(scanner, "Ingrese cargo: ");
	    
	    empleado = new Empleado(CodigoEmpleado, Nombre, Apellido, Direccion, Telefono, FechaContrato, FechaNacimiento, Cargo);
		
		try {
			return empleadoCtrl.Insertar(empleado);
			//AQUI INGRESAMEEE
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
}
