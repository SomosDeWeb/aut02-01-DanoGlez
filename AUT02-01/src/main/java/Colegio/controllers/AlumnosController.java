package Colegio.controllers;

import java.util.ArrayList;

import Colegio.Main;
import Colegio.models.Alumno;

import static Colegio.Main.Reproductor;

public class AlumnosController {

    private static ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public static void addAlumnos(){
        String Nombre = Reproductor("¿Cuál es el nombre del alumno? ");
        int Edad = Integer.parseInt(Reproductor("¿Qué edad tiene el alumno? "));
        double Nota = Double.parseDouble(Reproductor("Nota media del alumno: "));
        Alumno alumno = new Alumno(Nombre, Edad, Nota);

        listaAlumnos.add(alumno);
    }
}
