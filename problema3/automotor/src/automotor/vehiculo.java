
package automotor;

public class vehiculo {
    private String cdi;
    private String marca;
    private int  anfabri;
    private double valVehiculo;
    private double valMatricula;

    public vehiculo(String ci, String ma, int af, double vv) {
        cdi = ci;
        marca = ma;
        anfabri = af;
        valVehiculo = vv;
    }

    public void establecerCedula(String e) {
        cdi= e;
    }

    public void establecerMarcaVehiculo(String e) {
        marca = e;
    }

    public void establecerAñoFabricacion(int e) {
       anfabri = e;
    }

    public void establecerValorVehiculo(double e) {
        valVehiculo = e;
    }

    public void establecerValorMatricula() {
        valMatricula = ((valVehiculo * 0.002)/100) * (2021 -anfabri);
    }

    public String obtenerCedula() {
        return cdi;
    }

    public String obtenerMarcaVehiculo() {
        return marca;
    }

    public int obtenerAñoFabricacion() {
        return anfabri;
    }

    public double obtenerValorVehiculo() {
        return valVehiculo;
    }

    public double obtenerValorMatricula() {
        return valMatricula;
    }
     @Override
    public String toString() {

        String cadena;
        cadena = String.format("Valor Total de una Matricula Vehicular\n"
                + "cedula del dueño: %s\n"
                + "Marca del Vehiculo: %s\n"
                + "Año de fabricacion: %d\n"
                + "Valor del Vehiculo: %.3f\n"
                + "Valor total de la Matricula: %.2f\n",
                 obtenerCedula(),
                obtenerMarcaVehiculo(),
                obtenerAñoFabricacion(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());

        return cadena;
    }

    
}
