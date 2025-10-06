package Colegio.models;

public class Estudiante {

    public Estudiante(String nombre, int edad, double nota, boolean matriculado) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
        this.matriculado = matriculado;
    }

    private String nombre;
    private int edad;
    private double nota;
    private boolean matriculado;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length() > 1){
            this.nombre = nombre;
        }
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

    public boolean getMatriculado() { return this.matriculado;}

    public void setMatriculado(boolean matriculado){
        this.matriculado = matriculado;
    }
}
