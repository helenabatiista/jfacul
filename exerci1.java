public class exerci1 {
    
    public static void main(String[] args) {
        

    // método recursivo que receba dois inteiros positivos a e n e calcule an.   
    int a = 2;
    int n = 3;
    int resultado = 0;
    resultado = potencia(a, n);
    System.out.println(resultado);
    

    }
          
    public static int potencia(int a, int n){
        if(n == 0){
            return 1;
        }else{
            return a * potencia(a, n-1);
        }
    }
}