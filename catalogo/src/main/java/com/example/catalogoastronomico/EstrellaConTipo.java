package com.example.catalogoastronomico;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */

public class EstrellaConTipo extends Estrella{

    private TipoEstrella tipo;
    private Galaxia galaxia;

    /** Constructor del EstrellaConTipo, escribe un nombre, un brillo, una distancia, el úmero de planetas, una galaxia y un TipoEstrella */
    public EstrellaConTipo(String nombre, double brillo, double distancia, int planetas, Galaxia galaxia, TipoEstrella tipo) {

        super(nombre, brillo, distancia, planetas, galaxia);
        this.tipo = tipo;
        this.galaxia = galaxia;
    }

    public TipoEstrella getTipo() {
        return tipo;
    }

    @Override
    public Galaxia getGalaxia() {
        return galaxia;
    }

    public void setTipo(TipoEstrella tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setGalaxia(Galaxia galaxia) {
        this.galaxia = galaxia;
    }

    @Override
    public String toString() {

        String info = tipo.getNombre() + " \"" +tipo.getEnlaze() + "\"";

        return "objeto-Astro {nombre: " + super.getNombre() + ", tipo: EstrellaConTipo" + ", brillo: " + super.getBrillo() +
                ", distancia: " + super.getDistancia() + ", planetas: " + super.getPlanetas() + ", galaxia: " + super.getGalaxia().getNombre() +
                ", info: " + info + "}";
    }
}
