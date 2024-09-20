package LABORATORIO_02.EJERCICIO_1;
import java.util.Scanner;
public class GuiaTelefonica {
    // ATRIBUTOS
    private Persona[] lista;
    private Scanner entrada;
    
    // CONSTRUCTOR
    public GuiaTelefonica(){
        lista = new Persona[0];
        entrada = new Scanner (System.in);
    }

    // METODO PARA LEER UNA PERSONA
    public Persona LeerPersona(){
        String nombre, direccion;
        int telefono;
        System.out.print("Ingresar nombre: ");
        nombre=entrada.nextLine();
        System.out.print("Ingresar direccion: ");
        direccion= entrada.nextLine();
        System.out.print("Ingresar telefono: ");
        telefono=entrada.nextInt();
        entrada.nextLine();
        return new Persona(nombre,direccion,telefono);
    }

    // METODO PARA AÑADIR LA PERSONA CREADA EN LA ULTIMA POSICION
    // DE LA GUIA TELEFONICA
    public void AñadirPersona(){
        PrimeraRedimension();
        Persona x=LeerPersona();
        lista[lista.length-1]=x;
    }

    // METODO PARA AÑADIR UNA PERSONA CREADA EN UNA POSICION
    // ESPECIFICA DE LA GUIA TELEFONICA
    public void AñadirEnUnaPosicion(Persona x, int a){
        PrimeraRedimension();
        int n=lista.length-1;
        if(a >=0 && a<lista.length){
            while(n>a){
                lista[n] = lista[n-1];
                n = n-1;
            }
            lista[a] = x;
        }
        else{
            System.out.println("Posicion fuera de Rango");
        }
    }

    // METODO PARA ELIMINAR UNA PERSONA DE UNA POSICION DE LA GUIA TELEFONICA
    public void EliminarPersonaPosicion(int a){
        if(a >=0 && a<=lista.length){
            for (int i = a; i < lista.length - 1; i++) {
                lista[i] = lista[i + 1];
            }
            SegundaRedimension();
        }
        else{
            System.out.println("Posicion fuera de Rango");
        }
    }

    // METODO PARA ELIMINAR UNA PERSONA DE LA GUIA TELEFONICA A TRAVÉS DE SU NOMBRE
    public void EliminarPersonaNombre(){
        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.nextLine();
        int a=0;
        while(a<lista.length && !lista[a].getNombre().equals(nombre)){
            a++;
        }
        if(a==lista.length){
            System.out.println(nombre+" no está en la guía telefonica");
        }
        else{
            for (int i = a; i < lista.length - 1; i++) {
                lista[i] = lista[i + 1];
            }
            SegundaRedimension();
        }
    }

    // METODO PARA BUSCAR UNA PERSONA EN LA GUIA TELEFONICA SEGÚN SU NOMBRE
    public void BuscarPersona(){
        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.nextLine();
        int i=0;
        while(i<lista.length && !lista[i].getNombre().equals(nombre)){
            i++;
        }
        if(i==lista.length){
            System.out.println(nombre+" no está en la guía telefonica");
        }
        else{
            System.out.println(nombre+" si está en la guía telefonica en la POSICION "+i+
            " como PERSONA "+(i+1));
        }
    }

    // METODO PARA IMPRIMIR UNA PERSONA DE UNA POSICION DE LA GUIA TELEFONICA
    public void MostrarPersona(int a){
        if(a >=0 && a<=lista.length){
            System.out.println("POSICION: "+a+" - PERSONA: "+(a+1));
            System.out.println(lista[a]);
        }
        else{
            System.out.println("Posicion fuera de Rango");
        }
    }

    // METODO PARA INCREMENTAR EN UNO EL TAMAÑO DE LA GUIA TELEFONICA
    public void PrimeraRedimension(){
        Persona[] x=new Persona[lista.length+1];
        for(int i=0;i<lista.length;i++){
            x[i]=lista[i];
        }
        lista=x;
    }

    // METODO PARA DECREMENTAR EN UNO EL TAMAÑO DE LA GUIA TELEFONICA
    public void SegundaRedimension(){
        Persona[] x=new Persona[lista.length-1];
        for(int i=0;i<lista.length-1;i++){
            x[i]=lista[i];
        }
        lista=x;
    }

    // METODO PARA IMPRIMIR LA LISTA DE LA GUIA TELEFONICA
    public void MostrarGuiaTelefonica(){
        if(lista.length > 0){
            for(int i=0;i<lista.length;i++){
                System.out.println("PERSONA "+(i+1));
                System.out.println(lista[i]);
            }
        }
        else{
            System.out.println("La Guia Telefonica está vacía.");
        }
    }

    // METODO PARA CERRAR EL SCANNER
    public void CerrarScanner() {
        entrada.close(); 
    }
}