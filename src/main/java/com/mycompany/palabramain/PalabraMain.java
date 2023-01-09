/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.palabramain;

import java.util.Scanner;

public class PalabraMain {

    public static void main(String[] args) {
        int vidas = 5;
        Scanner respuestas = new Scanner(System.in);
        Palabra palabra = new Palabra();

        do {

            System.out.println("Introduce unha palabra");
            String respuesta = respuestas.nextLine();
            palabra.xogar(respuesta);
            vidas--;

        } while (vidas != 0);
        if (vidas == 0) {
            System.out.println("A palabra era: " + palabra.palabraOculta);
        }
    }
}
