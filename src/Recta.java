/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *<>zZ
 * @author avi
 */
public class Recta {
    private int m;
    private int b;
    private int in_a;
    private int in_b;
    /**
     * @param Constructor vacio
     */
    public Recta(){
        
    }
    /**
     * Constructor
     * Parametros de la ecuacion de la recta
     * @param m 
     * @param b
     * @param in_a
     * @param in_b
     * 
     */
    public Recta(int m, int b, int in_a,int in_b){
        this.m=m;
        this.b=b;
    }
    
    /**
     * Constructor
     * @param m
     * @param b
     * @see Instanciar ecuacion
     */
    public void set_Ecuacion(int m,int b){
        this.m=m;
        this.b=b;
    }
    /**
     * @param in_a
     * @param in_b
     */
    public void set_intervalo(int in_a,int in_b){
        this.in_a=in_a;
        this.in_b=in_b;
    }
    /**
     * @see Mostrar valores resultantes en pantalla
     * Lo ideal es almacenar los datos y retornarlos
     * al final de este metodo (Modificar a criterio)
     */
    public void Solucion(){
        int y;
        for(int i=in_a;i<=in_b;i++){
            y=m*i+b;
            System.out.println("x: "+i+"y: "+y);
        }
    }
    
}
