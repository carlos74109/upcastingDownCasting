package Pirncipal;

import Entidades.Conta;
import Entidades.ContaNegocio;
import Entidades.SalvarConta;

public class Principal {

	public static void main(String[] args) {
		
		Conta acc = new Conta(1001, "Carlos", 300.0);
		ContaNegocio contaNegocio = new ContaNegocio(1002, "Henrique", 200.0, 450.0);
		
		//UPCASTING
		
		Conta acc1 = contaNegocio;
		Conta acc2 = new ContaNegocio(200, "Vale", 700.0, 0.15);
		Conta acc3 = new SalvarConta(200, "Vale", 700.0, 0.15);
	 
		//DOWNCASTING
		
		ContaNegocio acc4 = (ContaNegocio) acc2;
		acc4.emprestimo(100);
		
		if(acc3 instanceof ContaNegocio) {
			ContaNegocio acc5 = (ContaNegocio) acc3;
			acc5.emprestimo(100);
			System.out.println("emprestado");
		}
		if(acc3 instanceof SalvarConta) {
			SalvarConta acc5 = (SalvarConta) acc3;
			acc5.UpdateSaldo();
			System.out.println("Update");
		}
		
		if(acc2 instanceof ContaNegocio) {
			ContaNegocio acc5 = (ContaNegocio) acc2;
			acc5.emprestimo(140);
			System.out.println("Tudo certo");
		}
	}

}
