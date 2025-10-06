package Colegio.controllers;

import java.util.ArrayList;
import java.util.Objects;

import Colegio.models.Estudiante;

public class EstudiantesController {

    private static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public static void addEstudiante(String Nombre, int Edad, double Nota, boolean Matriculado) {
        try {
            // Validar nombre
            if (Nombre == null || Nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacío.");
            }
            if (Nombre.trim().length() < 2) {
                throw new IllegalArgumentException("El nombre debe tener al menos 2 caracteres.");
            }

            // Validar edad
            if (Edad <= 0 || Edad > 120) {
                throw new IllegalArgumentException("La edad debe ser un valor positivo y razonable.");
            }

            // Validar nota
            if (Nota < 0.0 || Nota > 10.0) {
                throw new IllegalArgumentException("La nota debe estar entre 0 y 10.");
            }

            // Crear objeto
            Estudiante estudiante = new Estudiante(Nombre.trim(), Edad, Nota, Matriculado);

            listaEstudiantes.add(estudiante);

        } catch (IllegalArgumentException e) {
            System.err.println("❌ Error al añadir estudiante: " + e.getMessage());
        }
    }

    public static String mostrarEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            return "No hay estudiantes registrados.";
        }

        StringBuilder resultado = new StringBuilder();
        for (Estudiante a : listaEstudiantes) {
            resultado.append(a.getNombre() + " con " + a.getEdad() + " años tiene " + a.getNota() + " de nota media.\n");
        }

        return resultado.toString();
    }


    public static String buscarEstudiante(String Nombre) {
        if (Nombre == null || Nombre.trim().isEmpty()) {
            return "Búsqueda inválida: nombre vacío.";
        }

        String busqueda = Nombre.trim().toLowerCase();
        StringBuilder resultado = new StringBuilder();

        for (Estudiante a : listaEstudiantes) {
            if (a.getNombre().toLowerCase().contains(busqueda)) {
                resultado.append(a.getNombre()).append(" con ").append(a.getEdad()).append(" años tiene ").append(a.getNota()).append(" de nota media.\n");
            }
        }

        if (resultado.length() == 0) {
            return "No encontrado";
        } else {
            return resultado.toString().trim();
        }
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

    public static String mejorNota(){
        String Resultado = "";
        Double NotaMayor = 0.0;
        for (Estudiante a : listaEstudiantes){
            if(a.getNota() > NotaMayor){
                Resultado = a.getNombre() + " con " + a.getEdad() + " años tiene " + a.getNota() + " de nota media.";
                NotaMayor = a.getNota();
            }
        }
        return Resultado;
    }
}
