/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplegit;

/**
 *
 * @author daguaman
 */
public class SampleGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=0; i<10; i++){
            System.out.println("Inc " + i);
        }
        Imprimir(20);
        System.out.println("Suma" + Sumar(2, 8));
    }
    
    public static void Imprimir(int intValor){
        System.out.println("Imprimir "+ intValor);
    }
    
    public static double Sumar(int intA, int intB){
        double sumar= intA + intB;
        return sumar;
    }
    
}
