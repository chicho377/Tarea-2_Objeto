/*
 Tarea #2
 Progra II
    Forme una clase separada del "main" y cree cualquier objeto cualquiera
    con minimo 3 atributos y dos metodos.
 */
package main;

import java.util.Scanner;

/**
 * @author Fabricio Mora Gomez
 */
public class Main {
    public static void main(String[] args) {
        // variables
        String nombre;
        String rol;
        int habilidadUltimaCarga;
        int puntos;
        
        // scanner para obtener datos
        Scanner scanner = new Scanner(System.in);
        
        // obtener datos
        System.out.println("Ingrese el nombre del agente seleccionado: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese el rol del agente seleccionado: ");
        rol = scanner.nextLine();
        System.out.println("Ingrese los puntos actuales de la habilidad definitiva: ");
        habilidadUltimaCarga = scanner.nextInt();
        
        // crear objeto del agente
        Agente agente = new Agente(nombre, rol, habilidadUltimaCarga);
        
        // mostrar detalles del agente
        agente.mostrarDetalles();
        
        // intentar usar habilidad definitiva
        agente.usarUltima();
        
        
        // pedir puntos a cargar
        System.out.println("Ingrese los puntos a cargar: ");
        puntos = scanner.nextInt();
        
        
        // cargar mas puntos a la habilidad definitiva
        agente.cargarUltima(puntos);
        
        // intentar usar la habilidad definitiva nuevamente
        agente.usarUltima();
    }
    
}
