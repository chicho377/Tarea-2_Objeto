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
    public static void menu(){
          Scanner scanner = new Scanner(System.in);
          int opcion;
          
          // bucle para repetir el menu que se seleccione una opcion valida o salir
          do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Ingresar agente manualmente");
            System.out.println("2. Usar agente preestablecido (Jett)");
            System.out.println("3. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    //ingresarAgenteManual(scanner);
                    break;
                case 2:
                    //usarAgentePreestablecido();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 3);
    }
    
    public static void main(String[] args) {
        /* Profe para practicar el scanner lo hice que hay que ingresar los datos
        entonces le voy a dejar la lista de agentes.
    Listado de agentes y sus roles en Valorant:

    rol = Duelistas (Ataque agresivo): (6 puntos requeridos para la definitiva)
    1. Jett 
    2. Phoenix
    3. Reyna
    4. Raze
    5. Yoru
    6. Neon

    rol = Iniciadores (Abren espacios y apoyan al equipo): (7 puntos requeridos para la definitiva)
    1. Breach
    2. Sova
    3. Skye
    4. KAY/O
    5. Fade
    6. Gekko

    rol = Centinelas (Defienden y protegen al equipo): (8 puntos requeridos para la definitiva)
    1. Sage
    2. Cypher
    3. Killjoy
    4. Chamber

    rol = Controladores (Controlan el mapa y bloquean visión): (7 puntos requeridos para la definitiva)
    1. Brimstone
    2. Viper
    3. Omen
    4. Astra
    5. Harbor
*/
        
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
        System.out.println("Ingrese los puntos actuales que posee de la habilidad definitiva: ");
        habilidadUltimaCarga = scanner.nextInt();
        
        // crear objeto del agente
        Agente agente = new Agente(nombre, rol, habilidadUltimaCarga);
        
        // objeto sin scanner
        Agente jett = new Agente("Jett", "Duelista", 4);
        
        // mostrar detalles del agente
        agente.mostrarDetalles();
        jett.mostrarDetalles();
        
        // intentar usar habilidad definitiva
        agente.usarUltima();
        jett.usarUltima();
        
        // pedir puntos a cargar
        System.out.println("Ingrese los puntos a cargar: ");
        puntos = scanner.nextInt();
        
        
        // cargar mas puntos a la habilidad definitiva
        agente.cargarUltima(puntos);
        jett.cargarUltima(2);
        
        // intentar usar la habilidad definitiva nuevamente
        agente.usarUltima();
        jett.usarUltima();
    }
    
}
