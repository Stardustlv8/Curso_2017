/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *<>zZ
 * @author avi
 */
public class Burbuja {
    
    private int [] datos;
    /***
     * @see Sobre carga de metodos
     * constructor vacio he inicio de datos.
     */
    public Burbuja(){
        this.datos = new int [10];
    }
    //Completar cadena de documentacion aqui...
    public Burbuja(int [] datos){
        this.datos = new int [10];
        this.datos=datos;
    }

    public void set_Datos(int [] datos){
        this.datos = datos;
    }
    /***
     * @see Aplicar Algoritmo Burbuja para el ordenamiento.
     */
    public void Ordenar(){
        int aux;

        for(int i=1;i<this.datos.length;i++){
            for(int j=0;j<this.datos.length-i;j++){
                if(this.datos[j]>this.datos[j+1]){
                    aux=this.datos[j];
                    this.datos[j]=this.datos[j+1];
                    this.datos[j+1]=aux;
            
            }
         }
        }

    }
    /***
     * @see Datos del arreglo
     */
    public void Mostrar(){
        System.out.println("");
        for(int i=0;i<this.datos.length;i++){
            System.out.print(datos[i]+" ");
        }
        System.out.println("");
    }
}
