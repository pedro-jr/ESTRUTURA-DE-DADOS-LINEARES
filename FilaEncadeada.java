package com.miniteste.filaencadeada;

public class FilaEncadeada {

	private FilaBanco inicio;
	private int inseridos;
	private FilaBanco lastIn;

	public void enqueue(FilaBanco cliente) {
		if (inicio == null) {
			inicio = cliente;
		} else {
			FilaBanco temp = inicio;
			while (temp.proximo != null) {
				temp = temp.proximo;
			}
			temp.proximo = cliente;
			lastIn = temp.proximo;
		}
		inseridos++;
	}

	public FilaBanco dequeue() {
		FilaBanco front = null;
		if (inicio != null) {
			front = inicio;
			inicio = inicio.proximo;
			inseridos--;
		}
		return front;
	}
	
	public int size() {
		return inseridos;
	}
	
	public FilaBanco getFront() {
		FilaBanco front = inicio;
		front.proximo = null;
		return front;
	}
	
	public FilaBanco getReare() {
		return lastIn;
	}
	public boolean isEmpty() {
		return inseridos == 0;
	}
}