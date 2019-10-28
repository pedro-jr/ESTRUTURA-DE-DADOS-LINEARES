package com.miniteste.pilhasequencial;

public class PilhaSequencial {

	private Object[] elementos;
	private int tamanho;

	public PilhaSequencial() {
		elementos = new Object[3];

	}

	public void push(Object elemento) {
		int posicao = 0;
		this.aumentarCapacidade();

		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		tamanho++;
	}

	public void aumentarCapacidade() {
		if (this.tamanho == this.elementos.length) {
			Object[] elementosNovos = new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}

	}

	public void pop(Object elemento) {
		if (tamanho == 0) {
			System.out.println("Não há elementos");
		}

		for (int i = 0; i < tamanho - 1; i--) {
			this.elementos[i] = this.elementos[i + 1];
		}

		tamanho--;
	}
	public int size() {
		return tamanho;
	}

	public void clear() {
		Object[] temp = new Object[3];
		elementos = temp;
	}

	public Object top() {
		return elementos[0];
	}
}