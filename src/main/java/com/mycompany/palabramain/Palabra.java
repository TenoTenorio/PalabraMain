/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.palabramain;

import java.util.Scanner;
import java.util.ArrayList;

public class Palabra {

    String palabraOculta = "perro";
    String respuesta;
    private final int X = 1;
    private final int Y = 5;

    private int[][] oculta = new int[X][Y];

    public Palabra() {
    }

    public void setPalabraOculta(String palabraOculta) {
        this.palabraOculta = palabraOculta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getPalabraOculta() {
        return palabraOculta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void xogar(String respuesta) {

        if (palabraOculta.contentEquals(respuesta)) {
            System.out.println("Felicidades, gañaches");
        } else {
            System.out.println(respuesta.toCharArray());
        }
    }

    private void convertirArray() {
        palabraOculta.toCharArray();
        respuesta.toCharArray();

    }
}
