package Colegio.models;

public class Estudiante {

    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    private String nombre;
    private int edad;
    private double nota;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        if(edad >= 0 && edad < 99) {
            this.edad = edad;
        }
    }


    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10){
            this.nota = nota;
        }
    }
}
