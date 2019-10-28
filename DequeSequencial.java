package com.miniteste.dequesequencial;

public class DequeSequencial {

	private Object[] elementos;
	private int tamanho;

	public DequeSequencial() {
		elementos = new Object[3];
	}

	public void insertFront(Object elemento) {
		this.aumentarCapacidade();
		if (tamanho > 0) {
			for (int i = 0; i <= tamanho; i++) {
				elementos[i + 1] = elementos[i];
			}
		}
		elementos[0] = elemento;
		tamanho++;

	}

	public void deleteFront() {

		for (int i = 0; i < tamanho - 1; i++) {
			elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

	public void insertLast(Object elemento) {
		this.aumentarCapacidade();

		if (tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
		}
	}

	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("não elementos para excluir");
		}
		Object[] temp = new Object[elementos.length - 1];
		for (int i = 0; i < tamanho - 1; i++) {
			temp[i] = elementos[i];
		}
		elementos = temp;
		tamanho--;
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

}