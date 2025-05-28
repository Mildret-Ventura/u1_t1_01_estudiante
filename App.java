public class App {
    public static void main(String[] args) throws Exception {
        // Crear 5 estudiantes
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        Estudiante estudiante4 = new Estudiante();
        Estudiante estudiante5 = new Estudiante();

        estudiante1.setNombre("Christian Dominguez");
        estudiante1.setMatricula("20243047");
        estudiante1.setNota(0, 9.5);
        estudiante1.setNota(1, 9.6);
        estudiante1.setNota(2, 10);
        estudiante1.setNota(3, 10);
        estudiante1.setNota(4, 9.9);

        estudiante2.setNombre("Isaak Cabrera");
        estudiante2.setMatricula("20243009");
        estudiante2.setNota(0, 9.2);
        estudiante2.setNota(1, 9.7);
        estudiante2.setNota(2, 9.1);
        estudiante2.setNota(3, 10);
        estudiante2.setNota(4, 9.9);

        
        estudiante3.setNombre("Martha Alanis");
        estudiante3.setMatricula("20243098");
        estudiante3.setNota(0, 8.8);
        estudiante3.setNota(1, 9.0);
        estudiante3.setNota(2, 8.4);
        estudiante3.setNota(3, 8.7);
        estudiante3.setNota(4, 9.0);

        estudiante4.setNombre("Jonathan Lopez");
        estudiante4.setMatricula("20243045");
        estudiante4.setNota(0, 9.0);
        estudiante4.setNota(1, 8.4);
        estudiante4.setNota(2, 8.5);
        estudiante4.setNota(3, 9.0);
        estudiante4.setNota(4, 8.3);


        estudiante5.setNombre("Mauricio Estrada");
        estudiante5.setMatricula("20243555");
        estudiante5.setNota(0, 2.0);
        estudiante5.setNota(1, 9.8);
        estudiante5.setNota(2, 1.1);
        estudiante5.setNota(3, 3.0);
        estudiante5.setNota(4, 4.3);

        System.out.println("Resultados de los estudiantes");
        mostrarResultados(estudiante1);
        mostrarResultados(estudiante2);
        mostrarResultados(estudiante3);
        mostrarResultados(estudiante4);
        mostrarResultados(estudiante5);
    }

    public static void mostrarResultados(Estudiante estudiante) {
        System.out.println("\nEstudiante: " + estudiante.getNombre());
        System.out.println("Matrícula: " + estudiante.getMatricula());
        System.out.println("Notas:");
        for(int i = 0; i < 5; i++) {
            System.out.println("  Nota " + (i+1) + ": " + estudiante.getNota(i));
        }
        System.out.println("Promedio: " + estudiante.calcularPromedio());
        System.out.println("Estado: " + (estudiante.aprobo() ? "Aprobado" : "Reprobado"));
    }
}
