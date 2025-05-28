import java.util.Scanner;
&nbsp;
&nbsp;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[5];
&nbsp;
&nbsp;

        // Crear 5 estudiantes
        for (int i = 0; i < 5; i++) {
            estudiantes[i] = new Estudiante();
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i].setNombre(scanner.nextLine());
            System.out.print("Ingrese la matrícula del estudiante " + (i + 1) + ": ");
            estudiantes[i].setMatricula(scanner.nextLine());
&nbsp;
&nbsp;

            // Asignar notas
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese la nota " + (j + 1) + " del estudiante " + (i + 1) + ": ");
                estudiantes[i].setNota(j, scanner.nextDouble());
            }
            scanner.nextLine(); // Limpiar el buffer
        }
&nbsp;
&nbsp;

        // Mostrar resultados
        System.out.println("\nResultados:");
        for (Estudiante estudiante : estudiantes) {
            double promedio = estudiante.calcularPromedio();
            System.out.println("Nombre: " + estudiante.getNombre() + ", Promedio: " + promedio + ", Aprobado: " + estudiante.aprobado());
        }
&nbsp;
&nbsp;

        scanner.close();
    }
}