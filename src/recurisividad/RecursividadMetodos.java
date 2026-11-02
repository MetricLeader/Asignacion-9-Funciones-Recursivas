package recurisividad;
public class RecursividadMetodos {
    
    public long fibonacci (int n) {
        
        if (n == 1) return 0;
        if (n == 2) return 1;
        
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public int mcd(int a, int b){
        if (b == 0) return a;
        return mcd(b,a%b);
    }
    public int count(Object datos[], int n, Object o){
        if(n == 0) return 0;
        if(datos[n-1].equals(o)) return count(datos,n-1,o)+1;
        return 0+count(datos,n-1,o);
    }
    public void reverse(Object datos[], int inicio, int fin){
        if(inicio >= fin) return;
        
        Object temp = datos[inicio];
        datos[inicio] = datos[fin];
        datos[fin] = temp;
        
        reverse (datos, inicio+1, fin-1);
        
    }
}
