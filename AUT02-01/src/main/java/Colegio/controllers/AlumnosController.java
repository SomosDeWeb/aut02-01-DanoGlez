package Colegio.controllers;

import Colegio.Main;
import Colegio.models.Alumno;

import static Colegio.Main.Reproductor;

public class AlumnosController {

    public static void addAlumnos(){
        String Nombre = Reproductor("¿Cuál es el nombre del alumno? ");
        int Edad = Integer.parseInt(Reproductor("¿Qué edad tiene el alumno?"));
        double Nota = Double.parseDouble(Reproductor("Nota media del alumno: "));
        Alumno Alumno1 = new Alumno(Nombre, Edad, Nota);
    }
}
