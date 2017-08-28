/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarreglos;

/**
 *
 * @author johan
 */
import java.util.Scanner;
public class Vector implements Orientacioninterfaz {
public static int []vector;
public static int columnas;



    @Override
    public void descendente() {
        
           int i,mayor;
           for(int j=0;j<vector.length-1;j++){
               for(i=j+1;i<vector.length;i++){
                   if(vector[j]>vector[i]){
                    mayor=vector[j];
                    vector[j]=vector[i];
                    vector[i]=mayor;
                    
               }             
               }
               
           }
           System.out.println("ORDEN DEL VECTOR DE MENOR A MAYOT"); 
           for(i=0;i<columnas;i++){
               System.out.println(+vector[i]); 
           }
    }

    @Override
    public void ascendente() {
         int i,mayor;
           for(int j=0;j<vector.length-1;j++){
               for(i=j+1;i<vector.length;i++){
                   if(vector[j]<vector[i]){
                    mayor=vector[j];
                    vector[j]=vector[i];
                    vector[i]=mayor;
                    
               }             
               }
               
           }
           System.out.println("ORDEN DEL VECTOR DE MAYOR A MENOR"); 
           for(i=0;i<columnas;i++){
               System.out.println(+vector[i]); 
           }
    }

    public void llenarvector() {
        System.out.println("DIGITE EL TAMAÑO DEL VECTOR");
        Scanner tama = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        columnas=tama.nextInt();
        vector=new int[columnas];
        for(int i=0;i<columnas;i++){
                 System.out.println("DIGITE EL NUMERO  "+i);
                  vector[i]=num.nextInt();
                        //To change body of generated methods, choose Tools | Templates.
    }
}
}
