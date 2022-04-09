package entity;

/*
 * Crie uma classe para implementar uma ContaCorrente. 
 * A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. 
 * Os métodos são os seguintes: alterarNome, depósito e saque; 
 * No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
 */


public class ContaCorrente {
	
	private String nome;
	private int numConta;
	private double saldo;
	
	public ContaCorrente() {
	}

	public ContaCorrente(String nome, int numConta, double saldo) {
		super();
		this.nome = nome;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void alterarNome() {
		
	}
	
	public double depositar() {
		return numConta;
		
	}
	
	public double saque() {
		return numConta;
		
	}
	

}
