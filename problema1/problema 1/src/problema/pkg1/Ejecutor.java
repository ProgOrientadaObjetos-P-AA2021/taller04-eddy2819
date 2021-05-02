
package problema.pkg1;

public class Ejecutor {
    public static void main(String [] args){
        Calificaciones ct = new Calificaciones("Pedro Menendez", 10, 9, 9);
        Calificaciones ct2 = new Calificaciones("Andres Moreira", 9, 8, 7);
        ct.establecerPromedioCalif();
        ct2.establecerPromedioCalif();
        System.out.printf("%s\n",ct);
        System.out.printf("%s\n",ct2);
    }
    
    
    
}
