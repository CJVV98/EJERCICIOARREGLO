/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarreglos;

import java.util.Scanner;

/**
 *
 * @author johan
 */
public class EjercicioArreglos {
    public final Vector vector1;
    public final Arreglo arreglo1;
    
   // private final Matriz matriz1;
    /**
     * @param args the command line arguments
     */
    
    public EjercicioArreglos() {
        vector1=new Vector();  
        arreglo1=new Arreglo();
        int i,respuestadecon;
           do{
           
           System.out.println("LISTA");
           System.out.println("1 VECTOR");
           System.out.println("2 MATRIZ");
           Scanner opcion = new Scanner(System.in);
           int leer=opcion.nextInt();
           switch(leer){
               case 1:{
                   
                   vector1.llenarvector();
                   vector1.descendente();
                   vector1.ascendente();
                   break;
                    }
               case 2:{
                   arreglo1.llenararreglo();
                   arreglo1.descendente();
                   arreglo1.ascendente();
                   break;
               }
               default:{
                   System.out.println("ERROR OPCION INVALIDA");
                   
               }
           }
           System.out.println("DESEA SEGUIR EN ESTE PROGRAMA  S[1] O N[2]" );
           Scanner opcion2 = new Scanner(System.in);
           respuestadecon=opcion2.nextInt();
           while(respuestadecon>=3 || respuestadecon<=0){
               System.out.println("ERROR: DESEA SEGUIR EN ESTE PROGRAMA  S[1] O N[2]" );
               respuestadecon=opcion2.nextInt();
           }
           }while(respuestadecon==1);
           }
    
    public static void main(String[] args) {
        EjercicioArreglos ejercicioArreglos=new EjercicioArreglos();
    }
   
    
}
