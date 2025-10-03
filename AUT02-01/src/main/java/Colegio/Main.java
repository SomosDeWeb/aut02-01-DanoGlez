package Colegio;
import Colegio.models.Estudiante;

import java.util.List;
import java.util.Scanner;

import static Colegio.controllers.EstudiantesController.*;

public class Main {
    static void main(String[] args) {
        int selector;
        do {
         selector = Menu();

            switch (selector){
                case 1:
                    String Nombre = Reproductor("¿Cuál es el nombre del Estudiante? ");
                    int Edad = Integer.parseInt(Reproductor("¿Qué edad tiene el Estudiante? "));
                    double Nota = Double.parseDouble(Reproductor("Nota media del Estudiante: "));
                    addEstudiante(Nombre, Edad, Nota);
                    break;
                case 2:
                    String Resultado = mostrarEstudiantes();
                    System.out.println(Resultado);
                    break;
                case 3:
                    String NombreBusqueda = Reproductor("¿Cuál es el nombre del Estudiante que busca? ");
                    String ResultadoBusqueda = buscarEstudiante(NombreBusqueda);
                    System.out.println(ResultadoBusqueda);
                    break;
                case 4:
                    System.out.println("La nota media de todos los alumnos es " + notaMedia());
                    break;
                case 5:
                    System.out.println(selector);
                    break;
            }

//            System.out.println("[DEBUG]: " + selector);
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

    public static String Reproductor(String Texto){
        Scanner sc = new Scanner(System.in);
        String Resultado;
//        Imprime en consola
            System.out.print(Texto);
//        Recoge el texto que recibe
            Resultado = sc.nextLine();

        return Resultado;
    }
}
