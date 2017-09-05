package application;


import java.io.IOException;
import java.util.Scanner;
import com.lacangreburger.control.Conexion;
import com.lacangreburger.view.ClienteView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ClienteformController {


	@FXML private TextField txt_Codigo;
	@FXML private TextField txt_Nombre;
	@FXML private TextField txt_Apellido;
	@FXML private TextField txt_Direccion;
	@FXML private TextField txt_Telefono;

	//@FXML private Label lb;





	public void clickAgregar(ActionEvent e) throws IOException{
		Scanner scanner = new Scanner(System.in);
		Conexion conexion = new Conexion();
		ClienteView p = new ClienteView(conexion,scanner);
		try{
			int a = Integer.parseInt(txt_Codigo.getText().toString());
			String b = txt_Nombre.getText();
			String c = txt_Apellido.getText();

			String d = txt_Direccion.getText();
			int ef =Integer.parseInt(txt_Telefono.getText().toString());


		//p.insertar(a,b,c,d,ef);
		}catch(Exception ee){}

	}
	public void clickEditar(ActionEvent e) throws IOException{
		Scanner scanner = new Scanner(System.in);
		Conexion conexion = new Conexion();
		ClienteView p = new ClienteView(conexion,scanner);
		try{
			int a = Integer.parseInt(txt_Codigo.getText().toString());
			String b = txt_Nombre.getText();
			String c = txt_Apellido.getText();

			String d = txt_Direccion.getText();
			int ef =Integer.parseInt(txt_Telefono.getText().toString());
			//p.actualizar(a,b,c,d,ef);
		}catch(Exception eee){}
	}
	public void clickVer(ActionEvent e) throws IOException{
		Scanner scanner = new Scanner(System.in);
		Conexion conexion = new Conexion();
		ClienteView p = new ClienteView(conexion,scanner);
		//p.listar();
//System.out.println(p.listar().toString());

//lb.setText(p.listar().toString());
	}

}
