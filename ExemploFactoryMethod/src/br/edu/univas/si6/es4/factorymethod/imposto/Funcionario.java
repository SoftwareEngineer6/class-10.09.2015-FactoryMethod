package br.edu.univas.si6.es4.factorymethod.imposto;

public abstract class Funcionario {

	private String nome;

	public double salarioLiquido() {
		throw new RuntimeException("N�o implementado");
	}

	public abstract double salarioBruto();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
