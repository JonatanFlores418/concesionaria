package ar.edu.unju.fi.test;

import ar.edu.unju.fi.model.genericodosatributos;

public class Generico {

	public static void main(String[] args) {

		genericodosatributos<Integer, Integer> telefono 
	= new genericodosatributos<Integer,Integer>(388,5901322);
		
		genericodosatributos <String, String> identidad 
	= new genericodosatributos<String, String> ("46.", "598949");
		
		System.out.println(telefono.getCodigo());
		
		System.out.println(identidad.getNumero());
		
	}

}
