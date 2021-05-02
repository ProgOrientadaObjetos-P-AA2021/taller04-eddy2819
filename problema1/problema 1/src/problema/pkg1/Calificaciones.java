
package problema.pkg1;


public class Calificaciones {

   private String nombreEstu;
   private double materia1;
   private double materia2;
   private double materia3;
   private double promedioT;
   public Calificaciones(String no, double m1,double m2, double m3){
       nombreEstu = no;
       materia1 = m1;
       materia2 = m2;
       materia3 = m3;
   }
   public void establecerNombreEstudiante(String l){
       nombreEstu = l;
   }
   public void establecerCalifMateria1(double l){
       materia1 = l;
   }
   public void establecerCalifMateria2(double l){
       materia2 =l;
   }
   public void establecerCalifMateria3(double l){
       materia3= l;
   }
   public void establecerPromedioCalif(){
       promedioT = (materia1 + materia2 + materia3)/3;
   }
   
   public String obtenerNombreEstudiante(){
       return nombreEstu;
   }
   public double obtenerCalifMareia1(){
       return materia1;
   }
   public double obtenerCalifMateria2(){
       return materia2;
   }
   public double obtenerCalifMateria3(){
       return materia3;
   }
   public double obtenerPromedioCalif(){
       return promedioT;
   }
   
   @Override
   public String toString(){
      
        String cadena;
       cadena = String.format("Promedio Total de Calificaciones de:\n"
               + "Nombre del Estudiante: %s\n"
               + "Nota Materia 1: %.2f\n"
               + "Nota Materia 2: %.2f\n"
               + "Nota Materia 3: %.2f\n"
               + "Promedio Total: %.2f\n",obtenerNombreEstudiante(),
               obtenerCalifMareia1(),
               obtenerCalifMateria2(),
               obtenerCalifMateria3(),
               obtenerPromedioCalif());
                
        return cadena;
   }
   
    
    
        
        
        
        
        
        
        
        
        
    
    
}
