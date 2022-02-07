package Entidades;

public class Conta {

	private Integer numero;
	private String conta;
	protected Double saldo;
	
	
	
	public Conta() {
		
	}
	
	
	
	
	public Conta(Integer numero, String conta, Double saldo) {
		
		this.numero = numero;
		this.conta = conta;
		this.saldo = saldo;
	}




	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	public void saque (double saque) {
		saldo -= saque + 5.0;
	}
	
	public void depositar(double depositar) {
		saldo += depositar;
	}
	
	
}
