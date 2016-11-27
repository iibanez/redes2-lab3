import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ImplementacionRMI extends UnicastRemoteObject implements InterfaceRMI{
	
	private static final long serialVersionUID = 1L;
	
	public ImplementacionRMI() throws RemoteException{
		super();
	}

	public String saludar(String nombre) throws RemoteException{
		return "Hola "+nombre;
	}
}