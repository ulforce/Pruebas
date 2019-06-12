package modelo.herramientas;


import modelo.materiales.Diamante;
import modelo.materiales.Madera;
import modelo.materiales.Material;
import modelo.materiales.Metal;
import modelo.materiales.Piedra;


public abstract class Herramienta{


    protected float durabilidad;
    protected int fuerza;
    protected float factorDeDesgaste;


    public abstract void desgastarse();
/*
    public abstract Boolean validar(Material unMaterial);
*/
    public int getFuerza(){

        return this.fuerza;

    }

    public float getDurabilidad(){
        return this.durabilidad;

    }


	public void usar(Material unMaterial) {
		unMaterial.recibeGolpeDe(this);
		
	}


	public abstract void golpear(Madera unaMadera);
	
	public abstract void golpear(Piedra unaPiedra);
	
	public abstract void golpear(Metal unaMaetal);
	
	public abstract void golpear(Diamante unaDiamante);
}