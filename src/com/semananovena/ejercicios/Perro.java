/**
 * Ejercicio semana novena.
 * @author Angela Serantes
 * @version 1.0
 */
package com.semananovena.ejercicios;


public class Perro {
    /**
     * pelo del perro
     */
    String pelo;
    /**
     * color del perro
     */
    String color;
    /**
     * chip del perro
     */
    int chip;
    /**
     * peso del perro
     */
    private int peso;
    /**
     * altura del perro
     */
    private int altura;

    /**
     * constructor vacio que por defecto tienen todas las clases
     */
   public Perro() {

    }

    /**
     * Getter.
     * @return pelo.
     */
    public String getPelo() {
       return pelo;
    }

    /**
     * Getter.
     * @return color.
     */
    public String getColor() {
       return color;
    }

    /**
     * Getter.
     * @return chip.
     */
    public int getChip() {
       return chip;
    }

    /**
     * Getter.
     * @return peso.
     */
    public int getPeso() {
       return peso;
    }

    /**
     * Getter.
     * @return altura.
     */
    public int getAltura() {
       return altura;
    }

    /**
     * Setter.
     * @param pelo del perro
     */
    public void setPelo(String pelo) {

        this.pelo = pelo;
    }

    /**
     * Setter.
     * @param color del perro
     */
    public void setColor(String color) {
        this.color = color;

    }

    /**
     * Setter.
     * @param chip del perro
     */
    public void setChip(int chip) {
        this.chip = chip;

    }

    /**
     * Calcula el tipo de ladrido según su peso y altura
     * @param peso del perro
     * @param altura del perro
     * @return ladrido
     */
    public String ladrar(int peso, int altura) {
       this.peso=peso;
       this.altura=altura;
       String ladrido;

        if (peso > 40 && altura > 20) {
            ladrido = "muy grave";
        } else if (peso <= 40 && peso >= 20 && altura < 20 && altura >= 10) {
            ladrido = "grave";
        } else {
            ladrido = "agudo";
        }
        return ladrido;
    }

    /**
     * constructor parametrizado de la clase Perro
     * @param pelo del perro
     * @param color del perro
     * @param chip del perro
     * @param peso del perro
     * @param altura del perro
     */
    public Perro(String pelo, String color, int chip, int peso, int altura){
        this.pelo = pelo;
        this.color = color;
        this.chip = chip;
        this.peso = peso;
        this.altura = altura;
    }
}
//comentario