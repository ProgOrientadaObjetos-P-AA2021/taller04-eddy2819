package profesoress;

public class Sueldos {

    private String nombre;
    private String apellido;
    private String ci;
    private double sueldoB;
    private double sueldoT;

    public Sueldos(String nom, String ap, String c, double suel1) {
        nombre = nom;
        apellido = ap;
        ci = c;
        sueldoB = suel1;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String n) {
        apellido = n;
    }

    public void establecerCedula(String n) {
        ci = n;
    }

    public void establecerSueldoBasico(double n) {
        sueldoB = n;
    }

    public void establecerSueldoTotal() {
        sueldoT = sueldoB + ((sueldoB * 20) / 100);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return ci;
    }

    public double obtenerSueldoBasico() {
        return sueldoB;
    }

    public double obtenerSueldoTotal() {
        return sueldoT;
    }

    @Override
    public String toString() {

        String cadena;
        cadena = String.format("Sueldo Total de un Profesor :\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Cedula: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Suedo Total: %.2f\n",
                 obtenerNombre(),
                obtenerApellido(),
                obtenerCedula(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal());

        return cadena;
    }

}
