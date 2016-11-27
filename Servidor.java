import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.rmi.Naming;

public class Servidor {
	/**
	* @param args
	*/
	public Servidor(){
		
		try{
		InterfaceRMI i = new ImplementacionRMI();
		Naming.rebind("rmi://localhost//saludo", i);
		
		}catch(Exception e){
		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Servidor();
	}
}