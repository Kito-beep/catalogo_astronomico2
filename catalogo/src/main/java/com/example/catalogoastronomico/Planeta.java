package com.example.catalogoastronomico;

import java.util.Objects;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
public class Planeta extends Astro {

    protected boolean habitado;
    protected Estrella estrella;

    /** Constructor de Planeta, escribe un nombre, distancia, si está habitado o no y una estrella */
    public Planeta(String nombre, double brillo, double distancia, boolean habitado, Estrella estrella) {
        super(nombre, brillo, distancia);
        this.habitado = habitado;
        this.estrella = estrella;
    }

    public boolean isHabitado() {
        return habitado;
    }

    public Estrella getEstrella() {
        return this.estrella;
    }

    public void setHabitado(boolean habitado) {
        this.habitado = habitado;
    }

    public void setEstrella(Estrella estrella) {
        this.estrella = estrella;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planeta)) return false;
        if (!super.equals(o)) return false;
        Planeta planeta = (Planeta) o;
        return habitado == planeta.habitado &&
                estrella.equals(planeta.estrella);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitado, estrella);
    }

    @Override
    public String toString() {
        return "objeto-Astro {nombre: " + super.getNombre() + ", tipo: Planeta" +  ", brillo: " + super.getBrillo() + ", distancia: " + super.getDistancia() + ", habitado: " + this.habitado + ", estrella: " + this.estrella.getNombre() + '}';
    }
}
