import java.rmi.Naming;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cliente {

	private static Scanner sc;
	/**
	* @param args
	*/

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		try{
			InterfaceRMI i=(InterfaceRMI)Naming.lookup("rmi://localhost//saludo");
			//InterfaceRMI
			String nombre;
			sc = new Scanner(new InputStreamReader(System.in));
			System.out.println("Hola, ¿Como Te Llamas?");
			nombre=sc.next();
			System.out.println(i.saludar(nombre));
		}catch(Exception e){

		}
	}
}