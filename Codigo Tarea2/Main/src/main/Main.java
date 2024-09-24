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
            // switch para verificar la opcion del menu
            switch (opcion) {
                case 1:
                    ingresarAgenteManual();
                    break;
                case 2:
                    usarAgentePreestablecido();
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida. Intentelo de nuevo.");
            }
        } while (opcion != 3); // se repite hasta no elegir la opcion de salir 3
    }
    
    // metodo para ingresar el agente manualmente
    public static void ingresarAgenteManual() {
        // variables
        String nombre, rol;
        int habilidadUltimaCarga, puntos;
        // scanner para obtener datos
        Scanner scanner = new Scanner(System.in);

        // obtener datos manualmente
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

        // intentar usar la habilidad definitiva
        agente.usarUltima();

        // pedir puntos a cargar
        System.out.println("Ingrese los puntos a cargar: ");
        puntos = scanner.nextInt();

        // cargar más puntos a la habilidad definitiva
        agente.cargarUltima(puntos);

        // intentar usar la habilidad definitiva nuevamente
        agente.usarUltima();
    }

    // metodo para usar agente preestablecido
    public static void usarAgentePreestablecido() {
        // crear un objeto preestablecido (Jett)
        Agente jett = new Agente("Jett", "Duelista", 4);

        // mostrar detalles del agente preestablecido
        jett.mostrarDetalles();

        // intentar usar la habilidad definitiva
        jett.usarUltima();

        // cargar más puntos y volver a intentar usar la habilidad definitiva
        jett.cargarUltima(2);
        jett.usarUltima();
    }
    
    public static void main(String[] args) {
        // llamar al menu
        menu();
        
        /* Profe para practicar el scanner lo mejore e hice que hay que ingresar los datos
        entonces le voy a dejar la lista de agentes.
        
        Aunque tambien queria dejarlo con los datos preestablecidos como lo hice al principio
        de prubea, entonces agregue un menu y deje las dos opciones, crearlo y el ya pre establecido
    
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
    }
    
}
