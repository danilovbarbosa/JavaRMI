package server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

	public static void main(String[] args) {
		/** Cria um objeto remoto para a comunicação na porta 123
		 * libera o objeto para a comunicação através do 'registro.bind'
		*/
		try {
			Registry registro = LocateRegistry.createRegistry(123);
			
			registro.bind("adm", Adm.getIntacia());
			
		} catch (RemoteException | AlreadyBoundException e) {
			e.printStackTrace();
		}
		

	}

}
