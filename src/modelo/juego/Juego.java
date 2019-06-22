package modelo.juego;

import javafx.scene.image.ImageView;
import modelo.Direccion.Direccion;
import modelo.interfaz.ObjetoMinecraft;
import modelo.jugador.Jugador;
import modelo.mapas.Mapa;
import modelo.materiales.*;
import modelo.posicion.Posicion;



public class Juego {
	

    public Mapa mapa;
    public Jugador jugador;

    public void Juego(){

        iniciar();

    }

    public Jugador getJugador(){ return this.jugador;}


    public void iniciar(){

        this.mapa = new Mapa();
        Jugador jugador = cargarJugador();
        cargarTerreno();

    }


    public Jugador cargarJugador(){

        Jugador jugador = new Jugador();
        this.mapa.posicionarJugador(jugador);
        return jugador;

    }


    public void cargarTerreno(){

        cargarMadera();
        cargarPiedra();
        cargarMetal();
        cargarDiamante();

    }


    public void cargarMadera(){

        for(int i = 0; i <= 8; i++){

            Madera madera = new Madera();
            Posicion posicion = this.mapa.posicionarMaterial(madera);

        }

    }


    public void cargarPiedra(){

        for(int i = 0; i <= 5; i++){

            Piedra piedra = new Piedra();
            Posicion posicion = this.mapa.posicionarMaterial(piedra);

        }

    }


    public void cargarMetal(){

        for(int i = 0; i <= 4; i++){

            Metal metal = new Metal();
            Posicion posicion = this.mapa.posicionarMaterial(metal);

        }

    }


    public void cargarDiamante(){

        Diamante diamante = new Diamante();
        Posicion pos1 = this.mapa.posicionarMaterial(diamante);
        Diamante diamante1 = new Diamante();
        Posicion pos2 = this.mapa.posicionarMaterial(diamante1);


    }


    public void moverJugador(Direccion direccion){}


    public Mapa getMapa(){

        return this.mapa;

    }


}