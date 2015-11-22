package util;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceMensage extends Remote {
	
	//Métodos da interface
	
	boolean criarConta(String nomeUser, int idConta) throws RemoteException;
	
	boolean removerConta(int idConta) throws RemoteException;

	boolean sacar(int idConta, double valor) throws RemoteException;

	boolean tranferir(int idContaQueTranfere, int idContaQueRecebe, double valor) throws RemoteException;

	boolean depositar(int idConta, double valor) throws RemoteException;

	
}
