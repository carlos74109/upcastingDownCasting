package Entidades;

public class SalvarConta extends Conta {
	
	private Double taxaJuros;

	public SalvarConta() {
		super();
	}

	public SalvarConta(Integer numero, String conta, Double saldo, Double taxaJuros) {
		super(numero, conta, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void UpdateSaldo() {
		saldo += saldo * taxaJuros;
	}
	
	@Override
	public void saque(double saque) {
		saldo -= saque;
	}
	
}
