package Colegio;

import java.util.Scanner;

import static Colegio.controllers.EstudiantesController.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int selector;
        do {
         selector = Menu();

            switch (selector){
                case 1:
                    String nombre = Reproductor("¿Cuál es el nombre del Estudiante? ");
                    int edad = pedirEntero("¿Qué edad tiene el Estudiante? ");
                    double nota = pedirDouble("Nota media del Estudiante: ");
                    addEstudiante(nombre, edad, nota);
                    break;
                case 2:
                    System.out.println(mostrarEstudiantes());
                    break;
                case 3:
                    String NombreBusqueda = Reproductor("¿Cuál es el nombre del Estudiante que busca? ");
                    System.out.println(buscarEstudiante(NombreBusqueda));
                    break;
                case 4:
                    System.out.println("La nota media de todos los alumnos es " + notaMedia());
                    break;
                case 5:
                    System.out.println(mejorNota());
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        }while(selector != 6);

    }

    private static int Menu(){
        int selector;
        System.out.println("-------------------------------------");
        System.out.println("1. Añadir Estudiante");
        System.out.println("2. Listar Estudiantes");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Calcular nota media general");
        System.out.println("5. Mostrar mejor estudiante");
        System.out.println("6. Salir");

        selector = Integer.parseInt(Reproductor("Seleccione opción: "));
        System.out.println("-------------------------------------");
        return selector;
    }

    public static String Reproductor(String texto) {
        System.out.print(texto);
        return sc.nextLine();
    }

    private static int pedirEntero(String mensaje) {
        int numero;
        while (true) {
            try {
                numero = Integer.parseInt(Reproductor(mensaje).trim());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, introduce un número entero.");
            }
        }
    }

    private static double pedirDouble(String mensaje) {
        double numero;
        while (true) {
            try {
                numero = Double.parseDouble(Reproductor(mensaje).trim());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, introduce un número decimal.");
            }
        }
    }
}
