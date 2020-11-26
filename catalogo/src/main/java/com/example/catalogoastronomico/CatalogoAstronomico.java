package com.example.catalogoastronomico;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
public class CatalogoAstronomico {

    private ArrayList<Astro> catalogo = new ArrayList<Astro>();
    private HashSet<String> galaxias = new HashSet<String>();
    private int numAstrosSimpleVista;

    CatalogoAstronomico(){
    }

    public ArrayList<Astro> getCatalogo() {
        return catalogo;
    }

    public HashSet<String> getGalaxias() {

        return galaxias;
    }

    public int getNumEstrellasSimpleVista() {
        return numAstrosSimpleVista;
    }

    /** Devuelve true si ell Astro en la posición aportada del catálogo está a simple vista, si no, devuelve false */
    public boolean esEstrellaSimpleVista(int i){

        Astro astro = this.catalogo.get(i);

        if(astro.visibleCon().equals("a simple vista")) return true;
        else return false;
    }

    /** Añade un astro inexistente en el catálogo */
    public boolean anade(Astro astro){

        for (int i = 0; i < this.catalogo.size(); i++) {

            if (astro.getNombre() == this.catalogo.get(i).getNombre()) return false;
        }

        if(astro.visibleCon().equals("a simple vista")) numAstrosSimpleVista++;
        if(astro instanceof Galaxia) galaxias.add(astro.getNombre());
        if(astro instanceof Estrella){

            galaxias.add(((Estrella) astro).getGalaxia().getNombre());

            int count = 0;
            for(int i = 0; i < this.catalogo.size(); i++){

                if(this.catalogo.get(i).getNombre() == ((Estrella) astro).getGalaxia().getNombre()) count++;
            }

            if (((Estrella) astro).getGalaxia().getNombre() == null) count++;
            if(count == 0) this.catalogo.add(((Estrella) astro).getGalaxia());
        }
        if(astro instanceof Planeta) {

            galaxias.add(((Planeta) astro).getEstrella().getGalaxia().getNombre());

            int count = 0;
            for(int i = 0; i < this.catalogo.size(); i++){

                if(this.catalogo.get(i).getNombre() == ((Planeta) astro).getEstrella().getNombre()) count++;
            }

            if (((Planeta) astro).getEstrella().getNombre() == null) count++;
            if(count == 0) this.catalogo.add(((Planeta) astro).getEstrella());
        }

        catalogo.add(astro);

        return true;
    }

    /** Elimina un Astro del catálogo dado el nombre del mismo */
    public void borrar(String nombre){

        for(int i = 0; i < this.catalogo.size(); i++){

            Astro astro = this.catalogo.get(i);
            if(nombre.equals(astro.getNombre())) {

                if(this.catalogo.get(i).visibleCon().equals("a simple vista")) numAstrosSimpleVista--;
                this.catalogo.remove(i);
            }
        }
    }

    /** Busca un Astro en el catálogo dado el nombre */
    public Astro buscaAstro(String nombre) {

        int count = -1;

        for (int i = 0; i < this.catalogo.size(); i++) {

            if (nombre.equals(this.catalogo.get(i).getNombre())) count = i;
        }

        if (count == -1) return null; else return this.catalogo.get(count);
    }

    /** Devuelve el primer Astro más brillante, dentro del catálogo de Astros, que el Astro aportado */
    public Astro primeroMasBrillanteQue(Astro a){


        for (int i = 0; i < this.catalogo.size(); i++){

            Astro x = catalogo.get(i);

            if (x.masBrillante(a) == 1){

                return catalogo.get(i);
            }
        }
        return null;
    }

    /** Devuelve un catálogo con todos los Astros del catálogo actual que estén a simple vista */
    public ArrayList<Astro> filtraEstrellasSimpleVista(){

        ArrayList<Astro> newCatalogo = new ArrayList<Astro>();

        for(int i = 0; i < this.catalogo.size(); i++){

            if(this.catalogo.get(i) instanceof Estrella){

                if(this.catalogo.get(i).visibleCon().equals("a simple vista")) newCatalogo.add(this.catalogo.get(i));
            }
        }

        return newCatalogo;
    }

    /** Devuelve el Astro más brillante del catálogo */
    public Astro brillaMas(){

        Astro masBrillante = this.catalogo.get(0);

        for(int i = 1; i < this.catalogo.size(); i++){

            if(this.catalogo.get(i).getBrillo() > masBrillante.getBrillo()) masBrillante = this.catalogo.get(i);
        }

        return masBrillante;
    }

    @Override
    public String toString() {

        String res = this.catalogo.get(0).toString();

        for(int i = 1; i < this.catalogo.size(); i++){

            res = res + "\n" + this.catalogo.get(i).toString();
        }

        return res + "\n";
    }
}