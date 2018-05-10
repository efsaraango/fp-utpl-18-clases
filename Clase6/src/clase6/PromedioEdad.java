
/*
Realizar un proceso repetitivo que permita ingresar las estaturas de los estudiantes de una escuela para el equipo de basquet.
Al usuario se le preguntará si desea ingresar más estaturas.
Existe una consideración, si el usuario ingresa la estatura de un estudiante como menor a 1.20,
el programa deberá considerar la edad como 1.20 obligatoriamente, esto debido a una restricción en el reglamento para ingreso al equipo.


Al final debe hacer el proceso de ingreso de las siguientes estaturas:

1.30
1.10
1.20
1.25
1.10

Reporte quedaría así:

Reporte de Estaturas:

Edad Estudiante

1.30
1.20
1.20
1.25
1.20

Promedio de estaturas: 1.23

Reporte generado por Dep. Deportes*/

package clase6;

import java.util.Scanner;

/**
 *
 * @author SARANGO
 */
public class PromedioEdad {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);

               
        int contador = 1;
        double estatura=0;
        double prome = 0;
        boolean cond = true;
        String cadenaF = String.format("%s\n", "Estatura de Estudiante");
        
        while(cond){
            System.out.printf("\nIngrese estatura %d: ",contador);
            estatura = entrada.nextDouble();
            
            if(estatura < 1.20){
                estatura = 1.20;
            
            }
            prome = prome + estatura;
            contador =contador + 1;
            
            cadenaF = String.format("%s%.2f\n", cadenaF, estatura);
            
            entrada.nextLine();
            
            System.out.println("Ingrese 'si' para salir");
            String temp = entrada.nextLine();
            if(temp.equals("si")){
                cond = false;
            }
            
        }
        
        prome = prome/(contador-1);
        
        System.out.printf("%s\nPromedio de estaturas: %.2f\nReporte generado por Dep. Deportes\n", cadenaF, prome);
        
    

        
    }
}