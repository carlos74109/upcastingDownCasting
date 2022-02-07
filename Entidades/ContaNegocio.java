package Entidades;

public class ContaNegocio extends Conta {
	
	private double limteEmprestimo;
	
	
	public ContaNegocio() {
		super();
	}

	public ContaNegocio(Integer numero, String conta, Double saldo, double limteEmprestimo) {
		super(numero, conta, saldo);
		this.limteEmprestimo = limteEmprestimo;
	}

	public double getLimteEmprestimo() {
		return limteEmprestimo;
	}

	public void setLimteEmprestimo(double limteEmprestimo) {
		this.limteEmprestimo = limteEmprestimo;
	}
	
	public void emprestimo(double deposito) {
		if(deposito <= limteEmprestimo) 
		saldo += deposito -10;
	}
	
	public void exibir() {
		
	}
	
}
