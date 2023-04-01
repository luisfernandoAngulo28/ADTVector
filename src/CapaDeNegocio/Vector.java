
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeNegocio;

/**
 *1 Atributos
 *2 Constructor 
 *3 set(insertar)
 *4 get(obtener)
 *5 toString(mostrar) 
 * @author ferna
 */
public class Vector {
   //*1 Atributos
    int V[];
    int cantidad;
    //*2 Constructor 
    public Vector(int n){ //inicializar los Atributos de la clase
                          //Crea una instancia de la clase
        V=new int[n];
        cantidad=0;
    }
    
    
    
    
    
    
    //*3 set(insertar)(procedimiento)
    public void setElemento(int elemento){
        V[cantidad]=elemento;
        cantidad++;
    }
    
    
    
     //*4 get(obtener)(funciones)
    public int getElemento(int pos){
        return V[pos];
    }
    
    
    //*5 toString(mostrar) 
  
    @Override
    public String toString(){
       String S="[";
        for (int i = 0; i < this.cantidad; i++) {
            S=S+getElemento(i)+"|";
        }
        S=S.substring(0, S.length()-1);
        return S+"]";
    }
    
    public static void main(String[] args) {
        
        ///Instanciamos la clase
        Vector vectorPrueba=new Vector(6);
        //llamada de un procedimento
        vectorPrueba.setElemento(23);
        vectorPrueba.setElemento(22);
        vectorPrueba.setElemento(10);
        vectorPrueba.setElemento(12);
        vectorPrueba.setElemento(5);
        vectorPrueba.setElemento(12);
        
        //llamda de una funcion
        System.out.println("Mostrar \n"+vectorPrueba.toString());
    }
    
    
    
    
    
}
