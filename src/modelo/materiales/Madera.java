package modelo.materiales;

import javafx.scene.image.Image;
import modelo.herramientas.Hacha;
import modelo.herramientas.Herramienta;
import modelo.herramientas.Pico;

public class Madera extends Material{
		
	public Madera(){

		this.durabilidad = 10;
		this.identidad = "1";
		this.imagen = "madera.png";

	}

	
	public void recibeGolpeDe(Herramienta unaHerramienta) {

		unaHerramienta.golpear(this);

	}

	public void reducirDurabilidad(int conFuerza){

		this.durabilidad = this.durabilidad - conFuerza;

	}

	public String getIdentidad(){

		return this.identidad;

	}

	
}
