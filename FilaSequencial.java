package com.miniteste.filasequencial;

public class FilaSequencial {

	private Object[] elementos;
	private int tamanho;

	public FilaSequencial() {
		elementos = new Object[3];
	}

	public boolean enqueue(Object elemento) {
		this.aumentarCapacidade();

		if (tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;
	}

	public void aumentarCapacidade() {
		if (tamanho == elementos.length) {
			Object[] elementosNovos = new Object[elementos.length * 2];
			for (int i = 0; i < elementos.length; i++) {
				elementosNovos[i] = elementos[i];
			}
			elementos = elementosNovos;
		}
	}

	public Object dequeue() {
		final int POS = 0;
		if (tamanho == 0) {
			return null;
		}

		Object elementoASerRemovido = elementos[POS];
		this.remove(POS);
		return elementoASerRemovido;
	}

	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao Invalida");
		}
		for (int i = posicao; i < tamanho - 1; i++) {
			elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

	public int size() {
		return tamanho;
	}

	public boolean isEmpty() {
		return tamanho == 0;
	}

	public Object getFront() {
		return elementos[0];
	}

	public Object getReare() {
		return elementos[tamanho - 1];
	}
	
	public Object[] getObject() {
		return this.elementos;
	}
}