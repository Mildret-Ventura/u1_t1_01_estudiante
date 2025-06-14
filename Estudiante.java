public class Estudiante {
    private String nombre;
    private String matricula;
    private double[] notas = new double[5];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota(int posicion) {
        return notas[posicion];
    }

    public void setNota(int posicion, double nota) {
        notas[posicion] = nota;
    }


    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    public boolean aprobo() {
        return calcularPromedio() >= 7.0;
    }
}