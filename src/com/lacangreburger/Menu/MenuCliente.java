package com.lacangreburger.Menu;
import java.util.ArrayList;
import java.util.Scanner;

import com.lacangreburger.control.ProductosCtrl;
import com.lacangreburger.entity.Cliente;
import com.lacangreburger.entity.Productos;
import com.lacangreburger.view.ReadTypes;



public class MenuCliente {
	/**********************************************************************************************************************
	*
	***********************************************************************************************************************/
	public static int opciones(Scanner scanner) {

		int opcion;

		while (true) {
			try {
				
				System.out.println("Combos Lacangreburguer  ");
				System.out.println("------------------- ");
				System.out.println("1. Combo ChesseBurguer ");
				System.out.println("2. Combo EmmentalBurguer ");
				System.out.println("3. Combo MonsterBurguer ");
				System.out.println("4. Combo LacangreBurguer ");
				System.out.println("0. Salir ");
				System.out.println();
				ArrayList<Productos> Productos = new ArrayList<Productos>();

				opcion = scanner.nextInt();
				scanner.nextLine();

				if (opcion >= 0 && opcion <5 ) {
					return opcion;
				}

			} catch (java.util.InputMismatchException e) {
				System.out.println("Ingrese solo valores numéricos");
				System.out.println();
				scanner.nextLine();
			}
		}
	}

	/**********************************************************************************************************************
	*
	***********************************************************************************************************************/
	public static void menu(Scanner scanner, Cliente cliente) {
		boolean salir = false;

		while (!salir) {
			switch (opciones(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				System.out.print("Nombre anterior: ");
				System.out.println(cliente.getNombre());
				String nombre = ReadTypes.leerCadena(scanner, "Ingrese el nuevo valor de nombre: ");
				cliente.setNombre(nombre);
				break;
			}
		}
	}


}
