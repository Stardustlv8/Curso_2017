/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avi
 */
public class Potencia {
    private int base;
    private int exponente;
    
    public Potencia(){
        
    }
    
    public Potencia(int base, int exponente){
        this.base = base;
        this.exponente = exponente;
    }
    
    public void set_base(int base){
        this.base = base;
    }
    
    public void set_exponente(int exponente){
        this.exponente = exponente;
    }
    
    public int Solucion(){
        int aux=base;
        
        for(int i=1;i<exponente;i++){
            aux*=base;
        }
        return aux;
    }
    
}
