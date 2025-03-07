package ar.edu.unju.fi.model;

public class genericodosatributos <K, V> {

	private K codigo;
	private V numero;
	
	public genericodosatributos() {
		
	}
	
	
	public genericodosatributos(K codigo, V numero) {
		super();
		this.codigo = codigo;
		this.numero = numero;
	}


	public K getCodigo() {
		return codigo;
	}


	public void setCodigo(K codigo) {
		this.codigo = codigo;
	}


	public V getNumero() {
		return numero;
	}


	public void setNumero(V numero) {
		this.numero = numero;
	}
	
	
}
