public class Profesor {
    private String nombre;
    private int edad;
    private String categoria; // Instructor, Asistente, Auxiliar, Titular

    public Profesor(String nombre, int edad, String categoria) {
        this.nombre = nombre;
        this.edad = edad;
        this.categoria = categoria;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getCategoria() { return categoria; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad + " | Categoría: " + categoria;
    }
}