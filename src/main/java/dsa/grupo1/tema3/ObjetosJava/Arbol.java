package dsa.grupo1.tema3.ObjetosJava;

public class Arbol {
	
	private Integer altura;
	private String nombre;
	
	
	Arbol(int altura, String nombre){
		this.altura = altura;
	    this.nombre = nombre;
	}
	
	Arbol(int altura){
		
		this.altura = altura;
		nombre = "árbol";
	}
	
	Arbol(String nombre){
	    this.nombre = nombre;	
	}
	
	Arbol(){
	    nombre = "árbol genérico";	
	}
	
	public String getNombre() {
	      return nombre;
	}
	
	public int getAltura() {
	      return altura;
	}

	
	
	
	
	
	

}
