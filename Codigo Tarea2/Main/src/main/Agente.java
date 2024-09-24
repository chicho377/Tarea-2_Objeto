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
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
