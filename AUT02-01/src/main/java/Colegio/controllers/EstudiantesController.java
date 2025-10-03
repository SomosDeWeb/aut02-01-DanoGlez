package Colegio.controllers;

import java.util.ArrayList;
import java.util.Objects;

import Colegio.models.Estudiante;

import static Colegio.Main.Reproductor;

public class EstudiantesController {

    private static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public static void addEstudiante(){
        String Nombre = Reproductor("¿Cuál es el nombre del Estudiante? ");
        int Edad = Integer.parseInt(Reproductor("¿Qué edad tiene el Estudiante? "));
        double Nota = Double.parseDouble(Reproductor("Nota media del Estudiante: "));
        Estudiante estudiante = new Estudiante(Nombre, Edad, Nota);

        listaEstudiantes.add(estudiante);
    }

    public static void mostrarEstudiantes(){
        System.out.println("Lista de Estudiantes: ");
        for (Estudiante a : listaEstudiantes){
            System.out.println(a.getNombre() + " con Edad " + a.getEdad() + " tiene " + a.getNota() + " de nota media.");
        }
    }

    public static void buscarEstudiante(){
        String Resultado = "No encontrado";
        String Nombre = Reproductor("¿Cuál es el nombre del Estudiante que busca? ");

        for (Estudiante a : listaEstudiantes){
            if(Objects.equals(a.getNombre(), Nombre)){
                Resultado = (a.getNombre() + " con Edad " + a.getEdad() + " tiene " + a.getNota() + " de nota media.");
                break;
            }
        }

        System.out.println("Resultado de búsqueda: " + Resultado);

    }
}
