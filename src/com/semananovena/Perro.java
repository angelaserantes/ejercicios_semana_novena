package com.semananovena;

public class Perro {
    String pelo;
    String color;
    int chip;
    private int peso;
    private int altura;

   public Perro() {

    }

    public String getPelo() {
        return pelo;
    }

    public String getColor() {
        return color;
    }

    public int getChip() {
        return chip;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public void setChip(int chip) {
        this.chip = chip;

    }

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

    public Perro(String pelo, String color, int chip, int peso, int altura){
        this.pelo = pelo;
        this.color = color;
        this.chip = chip;
        this.peso = peso;
        this.altura = altura;
    }
}