package Paquete1;

public class Ejecutor {
    public static void main(String[] args) {
        Cheque ch = new Cheque("Juan Perez","Banco Pichincha",1500);
        Cheque ch2 = new Cheque("Jorgue Ulloa","Banco De Loja",3600);
        ch.establecerComisionBanco();
        ch2.establecerComisionBanco();
        System.out.printf("%s\n", ch);
        System.out.printf("%s\n", ch2);
    }
    
}

