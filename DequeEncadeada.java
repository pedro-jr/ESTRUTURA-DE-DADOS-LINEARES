package com.miniteste.dequeencadeada;

public class DequeEncadeada {
	
	Conta inicio;
	private int inseridos;
	private Conta front;
	
	public int size() {
		return inseridos;
	}
	
	public void insertFront(Conta obj) {
		if(inicio ==null) {
			inicio = obj;
		} else {
			Conta temp = inicio;
			inicio = obj;
			inicio.proximo = temp;
		}
		inseridos++;
	}
	public void insertLast(Conta obj) {
		if(inicio ==null) {
			inicio = obj;
		} else {
			Conta temp = inicio;
			while(inicio.proximo!= null) {
				temp = temp.proximo;
			}
		}
	}

}
