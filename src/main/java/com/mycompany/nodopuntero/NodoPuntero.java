/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nodopuntero;

import com.mycompany.nodopuntero.SimpleList;
import java.util.Scanner;

/**
 *
 * @author RYZEN
 */
public class NodoPuntero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleList List = new SimpleList();
        System.out.println("Desea añadir elementos a la lista? (s/n): ");
        String ponerLista = sc.next();
        if(ponerLista.equalsIgnoreCase("s")){
            System.out.println("\nIngrese el primer dato: ");
            int primerDato = sc.nextInt();
            Nodo Current = List.Add(primerDato);
            
            while(Current != null){
                System.out.println("\nDesea ingresar otro dato? (s/n): ");
                String respuesta = sc.next();
                if(respuesta.equalsIgnoreCase("n")){
                    break;
            }
            System.out.println("\n Ingrese un dato: ");
            int dato = sc.nextInt();
            Current = List.Add(dato);
        }
        }else{
            
        }
        
        
        List.Print();
        
        System.out.println("\ningrese el dato que desea buscar");
        int datoBuscado = sc.nextInt();
        
        Nodo resultado = List.Search(datoBuscado);
        
        if(resultado == null){
            System.out.println("El dato no se encontro, no existe o la lista esta vacia");
        } else if(resultado.Puntero == null) {
            System.out.println("El dato " + datoBuscado + " se encontro apuntando a " + resultado.Puntero + " osea el final de la lista :)");
        }else {
            System.out.println("\nEl dato " + datoBuscado + " se encontro apuntando a " + resultado.Puntero.Dato);
        }
        
        
        List.Delet();
        
        List.Print();
       
    }
}

