package ar.edu.unju.fi.test;

import java.util.ArrayList;

import ar.edu.unju.fi.model.Automovil;
import ar.edu.unju.fi.model.Cliente;
import ar.edu.unju.fi.model.genericodosatributos;
import ar.edu.unju.fi.model.constantes.Colores;

public class TestArrayList {
	public  static void main(String []args ) {
		
		ArrayList <Automovil>catalogo = new ArrayList<>();
		
		Colores colorauto = Colores.NEGRO;
		
		Automovil automovil1 = new Automovil("dfun2", "Renault", "208", (short)2005, 1000., colorauto);
		Automovil automovil2 = new Automovil("dfun2", "Renault", "208", (short)2005, 1000., colorauto);
		catalogo.add(automovil1);
		catalogo.add(automovil2);
		
		System.out.println("Tamaño de la lista: " + catalogo.size());
	
		Automovil auto = catalogo.get(0);
		
		System.out.println(auto.getPatente());
		
		Automovil ultimoAuto = catalogo.get(catalogo.size()-1);
		System.out.println(ultimoAuto);
		
		System.out.println(catalogo.get(0).getColor());
		
		for (Automovil a: catalogo) {
			System.out.println("precio del auto es: "+ a);
		}
		
		Automovil automovil3 = new Automovil("234880", 
		"toyota", "cronnos", (short)2002, 20000., Colores.ROJO);

		catalogo.add(automovil3);
		
		//catalogo.set(0, automovil3);
		Boolean encontrado = false;
		for(Automovil a: catalogo) {
		
			System.out.println(a);
			if(a.getMarca() == "toyota") {
				encontrado = true;
			}else {
				encontrado = false;
			}
		}
		System.out.println(encontrado);
		
		//catalogo.remove(automovil3);
		
		//System.out.println(catalogo.get(0)); 
		
		
		
		
		/*genericodosatributos<String, String> documento = new genericodosatributos<>();
		documento.setCodigo("DNI");
		documento.setNumero("46598949");
		
		Cliente cliente = new Cliente(documento, "Flores", "Jonatan");
		
		*/
	}
	
	
	
}
