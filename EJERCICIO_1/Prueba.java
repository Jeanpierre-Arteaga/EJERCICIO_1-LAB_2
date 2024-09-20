package LABORATORIO_02.EJERCICIO_1;
import java.util.Scanner;
public class Prueba {
    public static void main(String[] args) {  
        Scanner entrada = new Scanner(System.in);
        GuiaTelefonica Guia = new GuiaTelefonica();
        int opc,a,pos;
        do{
            System.out.println("\nGUIA TELEFONICA:");
            System.out.println("1. Añadir una Persona");
            System.out.println("2. Eliminar una Persona");
            System.out.println("3. Buscar una Persona");
            System.out.println("4. Mostrar la Guia Telefonica");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1: System.out.println("\n1. Al final de la guia");
                        System.out.println("2. En una posición de la guia");
                        do{
                            System.out.print("Ingrese una opción: ");
                            a = entrada.nextInt();
                        }while(a<1||a>2);
                        switch(a){
                            case 1: Guia.AñadirPersona();
                                    break;
                            case 2: System.out.print("Ingrese la posición: ");
                                    pos = entrada.nextInt();
                                    Guia.AñadirEnUnaPosicion(Guia.LeerPersona(),pos);
                                    break;
                        }
                        break;
                case 2: System.out.println("\n1. Por posición");
                        System.out.println("2. Por nombre");
                        do{
                            System.out.print("Ingrese una opción: ");
                            a = entrada.nextInt();
                        }while(a<1||a>2);
                        switch(a){
                            case 1: System.out.print("Ingrese la posición: ");
                                    pos = entrada.nextInt();
                                    Guia.EliminarPersonaPosicion(pos);
                                    break;
                            case 2: Guia.EliminarPersonaNombre();
                                    break;
                        }
                        break;
                case 3: System.out.println("\n1. Por nombre");
                        System.out.println("2. Por posición");
                        do{
                            System.out.print("Ingrese una opción: ");
                            a = entrada.nextInt();
                        }while(a<1||a>2);
                        switch(a){
                            case 1: Guia.BuscarPersona();
                                    break;
                            case 2: System.out.print("Ingrese la posición: ");
                                    pos = entrada.nextInt();
                                    Guia.MostrarPersona(pos);
                                    break;
                        }
                        break;
                case 4: System.out.println("PRESENTACION DE LA GUIA TELEFONICA");
                        Guia.MostrarGuiaTelefonica(); break;
                case 5: break;
                default: System.out.println("Ingrese una opción correcta.");
            }
        }while(opc!=5);
        Guia.CerrarScanner();
        entrada.close();
    }
}
