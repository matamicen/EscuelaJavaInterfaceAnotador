package com.captton.interfaces;

public class Computadora extends Electronico implements IAnotador {

	public Computadora() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void anotar(String mensaje) {
		// TODO Auto-generated method stub
		System.out.println("Abro un editor de texto y escribo el mensaje: " + mensaje);

	}

}
