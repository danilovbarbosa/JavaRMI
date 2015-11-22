package server;

import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;

import util.ExceptionTransferencia;

public class Account {

	private int id = 0;
	private String userNome;
	private double saldo;
	private ArrayLinkedList<Double> saques;

	public Account(int id, String userNome) {
		super();
		this.id = id;
		this.userNome = userNome;
		this.saldo = 0;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public double getIdConta() {
		return this.id;
	}

	public String saque(double valorDoSaque) {
		if (valorDoSaque < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		}else if (this.saldo >= valorDoSaque) {
			this.saldo = this.saldo - valorDoSaque;
			this.saques.add(valorDoSaque);
			return "Seu saldo atual é de " + this.saldo;
		} else {
			return "Seu saldo atual é insuficiente (R$ " + this.saldo + ") para o saque no valor desejado ";
		}
	}

	public String deposito(double valorDoDeposito) {
		if (valorDoDeposito < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		} else {
			this.saldo = this.saldo + valorDoDeposito;
			return "Valor depositado com sucesso. Seu saldo atual é de R$ " + this.saldo;
		}

	}

	public String transferir(Account contaQueRecebe, double valorDaTranferencia){
		if (valorDaTranferencia < 0) {
			throw new IllegalArgumentException("Você tentou transferir um valor negativo");
			//throw new ExceptionTransferencia("Você tentou transferir um valor negativo");
		}else{
			this.saque(valorDaTranferencia);
			contaQueRecebe.deposito(valorDaTranferencia);
			return "Valor tranferido com sucesso. Seu saldo atual é de R$ " + this.saldo;
		}
	}

	public String extratoConta() {
		return "Banco SD.\n Extrato : " + this.toString();
	}

}
