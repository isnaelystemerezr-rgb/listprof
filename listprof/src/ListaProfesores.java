public class ListaProfesores {
    private Nodo primero;

    public ListaProfesores() {
        this.primero = null;
    }

    // Método para agregar profesores a la lista
    public void agregar(Profesor p) {
        Nodo nuevo = new Nodo(p);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    // a) Profesores próximos a cambiar a Asistente (Instructores con más de 26 años)
    public void proxCambio() {
        System.out.println("--- Profesores próximos a cambiar a Asistente ---");
        Nodo actual = primero;
        boolean hay = false;
        while (actual != null) {
            if (actual.getDato().getCategoria().equalsIgnoreCase("Instructor")
                    && actual.getDato().getEdad() > 26) {
                System.out.println(actual.getDato().getNombre());
                hay = true;
            }
            actual = actual.getSiguiente();
        }
        if (!hay) {
            System.out.println("No hay profesores en esa condición.");
        }
    }

    // b) Mostrar la lista ordenada por edad de mayor a menor
    public void mostrarLista() {
        System.out.println("--- Profesores ordenados por edad (mayor a menor) ---");

        // Contamos cuántos hay
        int cont = 0;
        Nodo actual = primero;
        while (actual != null) {
            cont++;
            actual = actual.getSiguiente();
        }

        if (cont == 0) {
            System.out.println("La lista está vacía.");
            return;
        }

        // Pasamos a un arreglo
        Profesor[] profes = new Profesor[cont];
        actual = primero;
        int i = 0;
        while (actual != null) {
            profes[i] = actual.getDato();
            i++;
            actual = actual.getSiguiente();
        }

        // Ordenamos por edad de mayor a menor (burbuja)
        for (int j = 0; j < cont - 1; j++) {
            for (int k = 0; k < cont - 1 - j; k++) {
                if (profes[k].getEdad() < profes[k + 1].getEdad()) {
                    Profesor temp = profes[k];
                    profes[k] = profes[k + 1];
                    profes[k + 1] = temp;
                }
            }
        }

        // Mostramos
        for (int j = 0; j < cont; j++) {
            System.out.println(profes[j]);
        }
    }

    // c) Cantidad de profesores por categoría docente
    public String cantProfesores() {
        int instructor = 0;
        int asistente = 0;
        int auxiliar = 0;
        int titular = 0;

        Nodo actual = primero;
        while (actual != null) {
            String cat = actual.getDato().getCategoria();
            if (cat.equalsIgnoreCase("Instructor")) {
                instructor++;
            } else if (cat.equalsIgnoreCase("Asistente")) {
                asistente++;
            } else if (cat.equalsIgnoreCase("Auxiliar")) {
                auxiliar++;
            } else if (cat.equalsIgnoreCase("Titular")) {
                titular++;
            }
            actual = actual.getSiguiente();
        }

        String resultado = "Instructor: " + instructor + "\n" +
                "Asistente: " + asistente + "\n" +
                "Auxiliar: " + auxiliar + "\n" +
                "Titular: " + titular;
        return resultado;
    }
}