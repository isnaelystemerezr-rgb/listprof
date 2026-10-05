public class Main {
    public static void main(String[] args) {
        ListaProfesores lista = new ListaProfesores();

        // Agregamos profesores de prueba
        lista.agregar(new Profesor("Ana Pérez", 25, "Instructor"));
        lista.agregar(new Profesor("Luis Gómez", 30, "Instructor"));
        lista.agregar(new Profesor("Carlos Ruiz", 28, "Instructor"));
        lista.agregar(new Profesor("Marta López", 40, "Asistente"));
        lista.agregar(new Profesor("Pedro Sosa", 50, "Auxiliar"));
        lista.agregar(new Profesor("Juana Díaz", 55, "Titular"));
        lista.agregar(new Profesor("Raúl Martín", 27, "Instructor"));

        // a) Probar ProxCambio
        System.out.println("===== PRUEBA A =====");
        lista.proxCambio();
        System.out.println();

        // b) Probar MostrarLista
        System.out.println("===== PRUEBA B =====");
        lista.mostrarLista();
        System.out.println();

        // c) Probar CantProfesores
        System.out.println("===== PRUEBA C =====");
        System.out.println("Cantidad de profesores por categoría:");
        System.out.println(lista.cantProfesores());
    }
}