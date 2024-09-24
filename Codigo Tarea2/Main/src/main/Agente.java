package main;
public class Agente {
    // atributos
    String nombre;
    String rol;
    int habilidadUltimaCarga;
    
    // constructor parametrizado | para inicializar los atributos
    public Agente(String nombre, String rol, int habilidadUltimaCarga){
        this.nombre = nombre;
        this.rol = rol;
        this.habilidadUltimaCarga = habilidadUltimaCarga;
    }
    
    // metodo para mostrar los detalles del agente
    public void mostrarDetalles(){
        System.out.println("Nombre del agente: " + nombre);
        System.out.println("Rol: " + rol);
        System.out.println("Carga de habilidad ultima: " + habilidadUltimaCarga + "/7");
    }
    
    // metodo para usar la habilidad definitiva
    public void usarUltima(){
        // verificacion de que los puntos que se tienen son los que se ocupan
        if (habilidadUltimaCarga == 7) {
            System.out.println(nombre + " ha utilizado la habilidad definitiva.");
            habilidadUltimaCarga = 0; // resetea la carga despues de que se usa
        }else{
            System.out.println("Habilidad definitiva aun no esta cargada. Faltan " + (7 - habilidadUltimaCarga)+ " puntos.");
        }
    }
    
    // metodo para cargar puntos de la habilidad ultima
    public void cargarUltima(int puntos){
        // verificacion de que se tengan los puntos maximos de la definitiva
        if (habilidadUltimaCarga + puntos >= 7) {
            habilidadUltimaCarga = 7;
            System.out.println("Habilidad definitiva completamente cargada.");
        }else{
            habilidadUltimaCarga += puntos;
            System.out.println("Se han cargador " + puntos + " puntos. Carga actual: " + habilidadUltimaCarga + "/7.");
        }
    }
}
