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
public class Arreglo implements Orientacioninterfaz {
    public static int [][]arreglo;
    public static int dimension;
    
    @Override
    public void ascendente() {
        int mayor;
        for(int x=0;x<arreglo.length;x++){
          for(int y=0;y<arreglo.length;y++){
           for(int j=0;j<arreglo.length;j++){
               for(int i=0;i<arreglo.length;i++){
                   if(arreglo[i][j]>=arreglo[x][y]){
                    mayor=arreglo[i][j];
                    arreglo[i][j]=arreglo[x][y];
                    arreglo[x][y]=mayor;
                    
               }             
               }
           }
          }  
           }
           System.out.println("ORDEN DEL ARREGLO DE MENOR A MAYOR"); 
           for(int j=0;j<dimension;j++){
            for(int i=0;i<dimension;i++){
                 System.out.print(arreglo[i][j]+"  ");
           }
            System.out.println();
           }
    }

    @Override
    public void descendente() {
        int menor;
        for(int x=0;x<arreglo.length;x++){
          for(int y=0;y<arreglo.length;y++){
           for(int j=0;j<arreglo.length;j++){
               for(int i=0;i<arreglo.length;i++){
                   if(arreglo[i][j]<=arreglo[x][y]){
                    menor=arreglo[i][j];
                    arreglo[i][j]=arreglo[x][y];
                    arreglo[x][y]=menor;
                    
               }             
               }
           }
          }  
           }
           System.out.println("ORDEN DEL ARREBLO DE MAYOR A MENOR"); 
           for(int j=0;j<arreglo.length;j++){
            for(int i=0;i<arreglo.length;i++){
                System.out.print(arreglo[i][j]+"   ");
            }
            System.out.println();
           }
    }
    
       
    
    public void llenararreglo(){
        System.out.println("DIGITE EL NUMERO DE  LAS DIMENSIONDES DEL ARREGLO EJ 3X3");
        Scanner tamaf = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        dimension=tamaf.nextInt();
        arreglo=new int[dimension][dimension];
        for(int j=0;j<arreglo.length;j++){
            for(int i=0;i<arreglo.length;i++){
                 System.out.println("DIGITE EL NUMERO  "+j+i);
                  arreglo[j][i]=num.nextInt();
                        //To change body of generated methods, choose Tools | Templates.
    }
    }
    }
}
