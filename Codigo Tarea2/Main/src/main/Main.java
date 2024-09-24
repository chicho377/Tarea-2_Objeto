/*
 Tarea #2
 Progra II
    Forme una clase separada del "main" y cree cualquier objeto cualquiera
    con minimo 3 atributos y dos metodos.
 */
package main;
/**
 * @author Fabricio Mora Gomez
 */
public class Main {
    public static void main(String[] args) {
        // crear objeto del agente
        Agente agente = new Agente("Jett", "Duelista", 5);
        
        agente.mostrarDetalles();
    }
    
}
