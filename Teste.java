package com.miniteste.filaencadeada;

public class Teste {

	public static void main(String[] args) {
		
		FilaEncadeada obj = new FilaEncadeada();
		
		FilaBanco ob1 = new FilaBanco("Pedro");
		FilaBanco ob2 = new FilaBanco("Pereira");
		FilaBanco ob3 = new FilaBanco("da");
		FilaBanco ob4 = new FilaBanco("Silva");
		FilaBanco ob5 = new FilaBanco("Junior");
		
		obj.enqueue(ob1);
		obj.enqueue(ob2);
		obj.enqueue(ob3);
		obj.enqueue(ob4);
		obj.enqueue(ob5);
		
		obj.getFront();
		obj.getReare();
		obj.size();
		obj.isEmpty();
	}

}
