package dsa.grupo1.tema3.PruebaFormas;

import java.util.*;

public class Forma {
	
	public String contorno;
	
	Forma(){
	    this.contorno = "genérica";	
	}
	
	public String queEs() {
		return "Un objeto de forma "+contorno;
	}

}
