package com.example.catalogoastronomico;

import java.util.Objects;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */

public class Astro {

    private String nombre;
    private double brillo;
    private double distancia;

    /** Constructor de la Clase Astro por defecto */
    public Astro(){

        this.nombre = "Sirius";
        this.brillo = -1.42;
        this.distancia = 8.7;
    }

    /** Constructor de la Clase Astro, añadimos un nombre, brillo y distanca */
    public Astro(String nombre, double brillo, double distancia){

        this.nombre = nombre;
        this.brillo = brillo;
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getBrillo() {
        return brillo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBrillo(double brillo) {
        this.brillo = brillo;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void SetBrillo(double brillo){

        this.brillo = brillo;
    }

    /** Devuelve true si el astro es más distante que el aportado y false si no*/
    public boolean masDistante(Astro otro){

        if(this.distancia > otro.getDistancia()) return true; else return false;
    }

    /** Devuelve 1 si el astro es más brillante que el aportado, 0 si son iguales y -1 si es menos brillante*/
    public int masBrillante(Astro otro){

        if(this.brillo > otro.getBrillo()) return 1; else if(this.brillo == otro.getBrillo()) return 0; else return -1;
    }

    /** Especifica el nivel de visibilidad del astro: "A simple vista", "con prismáticos" o "con grandes telescopios" */
    public String visibleCon(){

        if (this.brillo < 5) return "a simple vista";
        else if (this.brillo > 5 && this.brillo < 7) return "con prismáticos";
        else if (this.brillo > 7 && this.brillo < 25) return "con telescopio";
        return "con grandes telescopios";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Astro)) return false;
        Astro astro = (Astro) o;
        return Double.compare(astro.brillo, brillo) == 0 &&
                Double.compare(astro.distancia, distancia) == 0 &&
                nombre.equals(astro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, brillo, distancia);
    }

    @Override
    public String toString() {
        return "objeto-Astro {" + "nombre: " + nombre + ", brillo: " + brillo + ", distancia: " + distancia + "}";
    }
}
