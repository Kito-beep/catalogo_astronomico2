package com.example.catalogoastronomico;
/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
public class Galaxia extends Astro {

    /** Constructor de Galaxia, escribe un nombre, un brillo y una distancia */
    public Galaxia(String nombre, double brillo, double distancia) {
        super(nombre, brillo, distancia);
    }

    public String toString() {
        return "objeto-Astro {nombre: " + super.getNombre() + ", tipo: Galaxia" +  ", brillo: " + super.getBrillo() + ", distancia: " + super.getDistancia() + '}';
    }
}
