/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nodopuntero;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class SimpleList {
    public Nodo Head;
    Scanner sc = new Scanner(System.in);
    
    public SimpleList(){
        Head = null;
    }
    
    public Nodo Add(int dato){
        Nodo NuevoNodo = new Nodo(dato);
        
        if(Head == null) {
            Head = NuevoNodo;
        } else {
            Nodo Current = Head;
            
            while(Current.Puntero != null) {
                Current = Current.Puntero;
            }
            Current.Puntero = NuevoNodo;
        }
        return NuevoNodo;
    }
    
    public Nodo Search(int valorBuscado){
        Nodo Current = Head;
        
        while(Current != null){
            if(Current.Dato == valorBuscado){
                return Current;
            }
            Current = Current.Puntero;
        }
        return null;
    }
    
    public void Print() {
        Nodo Current = Head;
        System.out.println("\nLa lista tiene estos datos: ");
        while(Current != null) {
            
            System.out.print("["+Current.Dato+"] -> ");
                Current = Current.Puntero;
            
        }
        System.out.print("null");
    }
    
    //da pena todos estos metodos publicos los contructores obvio pero incluso los atributos, ni un private wn
    public void Delet(){
        System.out.println("\nIngrese el dato que quiere eliminar: ");
        int datoEliminar = sc.nextInt();
        Nodo Current = Head;
        Nodo Anterior = null;
        
        if(Current == null){ //valida que no este vacia la lista, aunque en mi main hice imposible que este vacia :/
            System.out.println("\nQue estas tratando? .-.");
            System.out.println("\nLa lista esta vacia :)");
        }else if(datoEliminar == Head.Dato){ // valida que sea el primero y lo hace ahi mismo 
            Head = Head.Puntero;
        }else{ // lo busca y lo realiza
            while(Current != null){
            if(Current.Dato == datoEliminar){
                Anterior.Puntero = Current.Puntero;
                break;
            } else {
                Anterior = Current;
                Current = Current.Puntero;
            }
        }
        }
        
    }
    
    
}
