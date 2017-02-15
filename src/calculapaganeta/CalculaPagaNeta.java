/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculapaganeta;
import java.util.Scanner; //Clase para leer datos de la consola
public class CalculaPagaNeta {

    public static void main(String[] args) {
        // Declaracion de variables
        float PagaNeta, HT,TH,TI;
        Scanner lector=new Scanner(System.in);
        int Respuesta=1;
        String nombre;        
        // Pedir entradas
        while(Respuesta==1)
         {            
          System.out.print("Dame nombre del trabajador: ");
          nombre=lector.next();  
          System.out.print("Dame las Horas Trabajadas: ");
          HT=lector.nextFloat();
          System.out.print("Dame la Tarifa x Hora: ");
          TH=lector.nextFloat();
          System.out.print("Dame la Tasa de Impuesto: ");
          TI=lector.nextFloat();
          //Proceso
          PagaNeta=HT*TH - (HT*TH*TI/100);
          System.out.print("La Paga Neta de " + nombre + " es: "+ PagaNeta + "\n");       
          System.out.print("Quieres Calcular otra paga (1=Si,0=No): ");
          Respuesta=lector.nextInt();
         }       
    }
}
