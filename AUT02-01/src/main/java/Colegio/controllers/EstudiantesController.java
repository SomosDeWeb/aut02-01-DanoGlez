package Colegio.controllers;

import java.util.ArrayList;
import java.util.Objects;

import Colegio.models.Estudiante;

import static Colegio.Main.Reproductor;

public class EstudiantesController {

    private static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public static void addEstudiante(String Nombre, int Edad, double Nota){
        Estudiante estudiante = new Estudiante(Nombre, Edad, Nota);

        listaEstudiantes.add(estudiante);
    }

    public static String mostrarEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            return "No hay estudiantes registrados.";
        }

        StringBuilder resultado = new StringBuilder();
        for (Estudiante a : listaEstudiantes) {
            resultado.append(a.getNombre() + " con Edad " + a.getEdad() + " tiene " + a.getNota() + " de nota media.\n");
        }

        return resultado.toString();
    }


    public static String buscarEstudiante(String Nombre){
        String Resultado = "No encontrado";

        for (Estudiante a : listaEstudiantes){
            if(Objects.equals(a.getNombre(), Nombre)){
                Resultado = (a.getNombre() + " con Edad " + a.getEdad() + " tiene " + a.getNota() + " de nota media.");
                break;
            }
        }

        return Resultado;
    }

    public static double notaMedia(){
        double notas = 0;
        int pases = 0;
        for (Estudiante a : listaEstudiantes){
            notas += a.getNota();
            pases++;
        }

        return notas / (double)pases;
    }
}
