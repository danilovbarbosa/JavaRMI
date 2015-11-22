package server;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import util.InterfaceMensage;

public class Adm implements InterfaceMensage {
	/** Classe Adm implementa InterfaceMensage,
	 *  gerando algoritmos para cada métodos
	*/
	private static InterfaceMensage mensagem = null;
	private static final long serialVersionUID = 1L;
	private List<Account> listaDeContas;
	
	
	
	private Adm() throws RemoteException {
		super();
		this.listaDeContas = new ArrayList<Account>();
	}

	public static InterfaceMensage getIntacia() throws RemoteException{
		if (mensagem == null){
			mensagem = new Adm();
		}
		return mensagem;
	}
	
	@Override
	public boolean criarConta(String nomeUser, int idConta) throws RemoteException {
		for (Account conta : this.listaDeContas){
			if (conta.getIdConta() == idConta){
				return false;
			}
		}
		listaDeContas.add(new Account(idConta, nomeUser));
		return true;
	}

	@Override
	public boolean removerConta(int idConta) throws RemoteException {
		for (Account conta : this.listaDeContas){
			if (conta.getIdConta() == idConta){
				listaDeContas.remove(conta);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean sacar(int idConta, double valor) throws RemoteException {
		for (Account conta : this.listaDeContas){
			if (conta.getIdConta() == idConta){
				System.out.println(conta.saque(valor));
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean tranferir(int idContaQueTranfere, int idContaQueRecebe, double valor) throws RemoteException {
		for (Account conta : this.listaDeContas){
			if (conta.getIdConta() == idContaQueTranfere){
				for (Account conta2 : this.listaDeContas){
					if (conta2.getIdConta() == idContaQueRecebe){
						System.out.println(conta.transferir(conta2, valor));
						return true;
					}
				}	
			}
		}
		return false;
	}

	@Override
	public boolean depositar(int idConta, double valor) throws RemoteException {
		for (Account conta : this.listaDeContas){
			if (conta.getIdConta() == idConta){
				System.out.println(conta.deposito(valor));
				return true;
			}
		}
		return false;
	}
	
}
