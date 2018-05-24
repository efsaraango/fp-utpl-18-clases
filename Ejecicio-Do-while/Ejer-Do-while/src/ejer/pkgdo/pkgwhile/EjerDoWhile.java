/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer.pkgdo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author SARANGO
 */
public class EjerDoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre, reporte, reporte1, reporte2, contpases, contgol;
        int gol, pase, suma1 = 0, suma2 = 0, numparti = 0, salir1 = 0, numjugador = 0;
        double prompase = 0, promgol = 0;
        boolean salir = true;

        reporte = String.format("Generar el siguiente reporte\nReporte de Jugafores del Equipo\"UTPL\"\n\n%-22s%-16s%-16s%-17s\n\n", "Nombre del Jugador", "Total de Pases", "Total de Goles", "Nivel de Jugador");

        do {
            numjugador = numjugador + 1;
            System.out.printf("Nombre del Jugador: ");
            nombre = entrada.nextLine();
            System.out.printf("Cuantos partidos a Jugado: ");
            numparti = entrada.nextInt();

            reporte1 = String.format("%-22s", nombre);

            for (int cont = 1; cont <= numparti; cont++) {

                System.out.printf("Total de Pases Partido %d: ",cont);
                pase = entrada.nextInt();
                System.out.printf("Total Goles Partido %d: ",cont);
                gol = entrada.nextInt();

                contpases = String.format("P%d:%-16d",cont, pase);
                contgol = String.format("G%d:%-16d",cont, gol);

                if (cont == 1) {
                    reporte1 = String.format("%s%-18s%-18s\n", reporte1, contpases, contgol);
                } else {
                    reporte1 = String.format("%s%-22s%-18s%-18s\n", reporte1, "", contpases, contgol);
                }
                suma1 = suma1 + pase;
                suma2 = suma2 + gol;

            }
            if (suma1 >= 100) {
                reporte2 = "Excelente";

            } else if (suma1 < 100 && suma1 >= 80) {
                reporte2 = "Muy bueno";
            } else if (suma1 < 80 && suma1 >= 60) {
                reporte2 = "Bueno";
            } else {
                reporte2 = "Regular";
            }

            contpases = String.format("Total:%d", suma1);
            contgol = String.format("Total:%d", suma2);
            reporte1 = String.format("%s\n%-22s%-18s%-18s%-17s", reporte1, "", contpases, contgol, reporte2);
            reporte = String.format("%s%s\n\n", reporte, reporte1);

            prompase = prompase + suma1;
            promgol = promgol + suma2;

            System.out.printf("¿Desea salir? Pulse 1-Si --- 2-No:");
            salir1 = entrada.nextInt();
            entrada.nextLine();
            
            if (salir1 == 1) {
                salir = false;
            }

            suma1 = 0;
            suma2 = 0;

        } while (salir);

        prompase = prompase / numjugador;
        promgol = promgol / numjugador;

        reporte = String.format("%sDatos Finales:\n%d Jugadores Analizados.\nPromedio de Pases del equipo es %.2f\nPromedio de Goles del equipo %.2f \n\nDepartamento Estadistico ", reporte, numjugador, prompase, promgol);
        System.out.println(reporte);
    }

}
