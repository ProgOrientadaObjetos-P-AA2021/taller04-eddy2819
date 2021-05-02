
package profesoress;


public class Ejecutor {
    public static void main(String [] args){
        Sueldos sp = new Sueldos("Maria","Perez","1102365489", 900);
         Sueldos sp2 = new Sueldos("Raul","Arteaga","1104867392", 1200);
        sp.establecerSueldoTotal();
        sp2.establecerSueldoTotal();
        System.out.printf("%s\n",sp);
        System.out.printf("%s\n",sp2);
    }
    
}
