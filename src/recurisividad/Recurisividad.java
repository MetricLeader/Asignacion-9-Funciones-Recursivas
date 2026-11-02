package recurisividad;
public class Recurisividad {
    public static void main(String[] args) {
        System.out.println("Hola mundo xd");

        RecursividadMetodos Metodo = new RecursividadMetodos();
        
        System.out.println(Metodo.fibonacci(5));
        System.out.println(Metodo.fibonacci(40));
        
        System.out.println(Metodo.mcd(45, 75));
        System.out.println(Metodo.mcd(47, 91));
        
        Object[] Arreglo = {1,2,3,3,2,3,1};
        System.out.println(Metodo.count(Arreglo,7,3));
        
        System.out.println(Metodo.count(Arreglo,7,1));
        
        Object[] Arreglo2 = {'A','B','C','B','A','B','D'};
        
        System.out.println(Metodo.count(Arreglo2,7,'C'));
        
        System.out.println(Metodo.count(Arreglo2,7,'E'));
     
        Object[] Arreglo3 = {1,2,3,4,5};
        Metodo.reverse(Arreglo3,0,4);
        System.out.println(java.util.Arrays.toString(Arreglo3));
        
        Object[] Arreglo4 = {'A','B','C','D'};
        Metodo.reverse(Arreglo4, 0, 3);
        System.out.println(java.util.Arrays.toString(Arreglo4));
    }
}