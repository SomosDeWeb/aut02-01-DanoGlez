package Colegio;
import java.util.Scanner;

import static Colegio.controllers.AlumnosController.*;

public class Main {
    static void main(String[] args) {
        Menu();
    }

    private static void Menu(){
        int selector;
        do {
            System.out.println("-------------------------------------");
            System.out.println("1. Añadir Estudiante");
            System.out.println("2. Listar Estudiantes");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Calcular nota media general");
            System.out.println("5. Mostrar mejor estudiante");
            System.out.println("6. Salir");

            selector = Integer.parseInt(Reproductor("Seleccione opción: "));
            System.out.println("-------------------------------------");

            switch (selector){
                case 1:
                    addAlumnos();
                    break;
                case 2:
                    mostrarAlumnos();
                    break;
                case 3:
                    System.out.println(selector);
                    break;
                case 4:
                    System.out.println(selector);
                    break;
                case 5:
                    System.out.println(selector);
                    break;
            }

//            System.out.println("[DEBUG]: " + selector);
        }while(selector != 6);
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
