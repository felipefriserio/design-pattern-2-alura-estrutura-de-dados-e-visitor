package br.com.alura.design.pattern.visitor;

public interface Expressao {
	public int avalia();
	void aceita(Visitor impressora);
}
