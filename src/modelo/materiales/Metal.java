package modelo.materiales;

import modelo.herramientas.Hacha;

public class Metal extends Material {

	public Metal() {
		durabilidad = 50;
	}
	
	public void recibeGolpeDe(Hacha unaHerramienta) {
		durabilidad -= unaHerramienta.getFuerza(); 
	}
}
