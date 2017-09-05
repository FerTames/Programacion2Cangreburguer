package com.lacangreburger.view;
import java.util.ArrayList;
import java.util.Scanner;

import com.lacangreburger.control.Conexion;
import com.lacangreburger.control.EnviosCtrl;
import com.lacangreburger.entity.Empleado;
import com.lacangreburger.entity.Envios;

public class EnviosView {
	private Scanner scanner;
	private Envios envios;
	private EnviosCtrl enviosCtrl;
	
	public EnviosView(Conexion conexion, Scanner scanner) {		
		this.scanner = scanner;
		enviosCtrl = new EnviosCtrl(conexion);		
	}
	
	public void listar() {
		ArrayList<Envios> enviosLista;

		try {
			enviosLista = enviosCtrl.ListarProductos();
			for (int i = 0; i < enviosLista.size(); i++) {
				System.out.print(enviosLista.get(i).getCodigoEnvio());
				System.out.print(" -> ");
				System.out.println(enviosLista.get(i).getEmpresa() + " telefono: " + enviosLista.get(i).getTelefono());
			}
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}
}
