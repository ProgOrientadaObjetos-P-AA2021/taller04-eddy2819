
package automotor;

public class Ejecutor {
    public static void main(String [] args){
        vehiculo vm = new vehiculo("11457898310","Chevrolet",2019,28.945);
        vehiculo vm2 = new vehiculo("1123698209","Ferrari",2015, 98.876);
        vm.establecerValorMatricula();
        vm2.establecerValorMatricula();
        System.out.printf("%s\n",vm);
        System.out.printf("%s\n",vm2);
    }
    
}
