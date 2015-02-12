package ordenacao;

import java.util.ArrayList;

import classes.Modelo;

public class Ordenacao {
	
	private ArrayList<Dependencias> dependencias;
	
	public Ordenacao (Modelo modelo){
		dependencias = Dependencias.geraDependencia(modelo);
	}

}
