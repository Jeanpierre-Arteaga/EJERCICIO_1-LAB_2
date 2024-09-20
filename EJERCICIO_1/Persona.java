package LABORATORIO_02.EJERCICIO_1;

public class Persona {
    // ATRIBUTOS
    private String nombre;
    private String direccion;
    private int telefono;
    // CONSTRUCTORES
    public Persona(){
    }
    public Persona(String nombre,String direccion,int telefono){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    // SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    // GETTERS
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public int getTelefono(){
        return telefono;
    }
    public String toString(){
        return "Nombre: "+nombre+
                " - Direccion: "+direccion+
                " - Telefono: "+telefono;
    }
}
