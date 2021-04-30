package Paquete1;

public class Cheque {

    private String nombreDeCliente;
    private String nombreDeEntidad;
    private double valorCheque;
    private double comisionBanco;

    public Cheque(String n, String banco, double valor) {
        nombreDeCliente = n;
        nombreDeEntidad = banco;
        valorCheque = valor;
    }

    public void establecerNombreDeCliente(String n) {
        nombreDeCliente = n;
    }

    public void establecerNombreDeEntidad(String n) {
        nombreDeEntidad = n;
    }

    public void establecerValorCheque(double n) {
        valorCheque = n;
    }

    public void establecerComisionBanco() {
        comisionBanco = (valorCheque * 0.003);
    }

    public String obtenerNombreDeCliente() {
        return nombreDeCliente;
    }

    public String obtenerNombreDeEntidad() {
        return nombreDeEntidad;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComisionBanco() {
        return comisionBanco;
    }

    @Override
    public String toString() {
        String cadena = String.format("Los datos del cheque son\n"
                + "Nombre del cliente: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comision del Banco: %.2f\n",
                obtenerNombreDeCliente(), obtenerNombreDeEntidad(),
                obtenerValorCheque(), obtenerComisionBanco());
        return cadena;
    }

}
