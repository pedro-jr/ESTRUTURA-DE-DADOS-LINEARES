package com.miniteste.pilhaencadeada;

public class PilhaEncadeada {

	private Pilha inicio;
	private int inseridos;
	private Pilha front;

	public void push(Pilha obj) {
		if (inicio == null) {
			inicio = obj;
		} else {
			Pilha temp = inicio;
			inicio = obj;
			inicio.proximo = temp;
		}
	}

	public Pilha pop() {
		Pilha pop = null;
		if (inicio != null) {
			pop = inicio;
			inicio = inicio.proximo;
		} else {
			throw new IllegalArgumentException("Ninguem na pilha");
		}
		inseridos--;
		return pop;
	}

	public Pilha top() {
		Pilha temp = inicio;
		temp.proximo = null;
		return temp;
	}
	
	public int size() {
		return inseridos;
	}
	
	public void clear() {
		inicio = null;
	}

}