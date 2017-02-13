/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avi
 * Agregar documentacion
 * Agregar el caso faltante al factorial
 */
public class Factorial {
    private int factor;
    
    public Factorial(){
        
    }
    
    public Factorial(int factor){
        this.factor=factor;
    }
    
    public void set_factor(int factor){
        this.factor=factor;
    }
    
    public int Solucion(){
        int aux=factor;
        
        for(int i=factor;i>2;i--){
            aux*=i-1;
        }
        return aux;
    }
    
}
