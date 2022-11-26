/**
 * Ejercicio semana novena.
 * @author Angela Serantes
 * @version 1.0
 */

import com.semananovena.ejercicios.Perro;

public class Main {
    /**
     * metodo main para llamadas
     * @param args parametros de entrada de la aplicacion
     */
    public static void main(String[] args) {
        Perro perro_1 = new Perro();
        perro_1.setPelo("corto");
        perro_1.setColor("marron");
        perro_1.setChip(123);
        Perro perro_2 = new Perro();
        perro_2.setPelo("largo");
        perro_2.setColor("negro");
        perro_2.setChip(345);
        Perro perro_3 = new Perro();
        perro_3.setPelo("largo");
        perro_3.setColor("gris");
        perro_3.setChip(789);


        Perro perroladrar = new Perro();// objeto para llamar a la función ladrar
        Perro listadoPerro[]= new Perro[3];
        listadoPerro[0] = new Perro("corto", "negro", 567, 41, 25);
        listadoPerro[1] = new Perro("largo", "marron", 896, 25, 18);
        listadoPerro[2] = new Perro("corto", "gris", 127, 10, 12);

        for (int i = 0; i < listadoPerro.length; i++) {
            System.out.println("El perro tiene el pelo "+ listadoPerro[i].getPelo() + " y es de color " + listadoPerro[i].getColor() + " su número de chip es " + listadoPerro[i].getChip() + " su altura es de " + listadoPerro[i].getAltura() + " cm y su peso es de " + listadoPerro[i].getPeso() + " kg y tiene el ladrido " + perroladrar.ladrar(listadoPerro[i].getPeso(),listadoPerro[i].getAltura()));
        }


    }




}


// En el ejercicio tres poner los atributos en privado no se puede acceder desde la clase main a esos atributos, para poder hacerlo tendrian que ser public