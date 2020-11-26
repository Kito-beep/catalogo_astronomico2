package com.example.catalogoastronomico;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */

public enum TipoEstrella {
    ENANA_AMARILLA("Enana Amarilla", "https://es.wikipedia.org/wiki/Estrella_de_tipo-G_de_la_secuencia_principal"),
    ENANA_BLANCA("Enana Blanca", "https://es.wikipedia.org/wiki/Enana_blanca"),
    GIGANTE_ROJA("Gigante Roja", "https://es.wikipedia.org/wiki/Gigante_roja"),
    SUBGIGANTE_BLANCO("Subgigante Blanco", "https://es.wikipedia.org/wiki/Subgigante");

    private String nombre;
    private String enlaze;

    /** Constructor del TipoEstrella, escribe un nombre y un enlace */
    TipoEstrella(String nombre, String enlaze) {

        this.nombre = nombre;
        this.enlaze = enlaze;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEnlaze() {
        return enlaze;
    }
}
