import javax.swing.JOptionPane;

public class exerci4 {
    
  
        
    public static int mdc(int dividendo, int divisor, int[] contador) {
        contador[0]++;
        if (dividendo % divisor == 0) {
            return divisor;
        }
        return mdc(divisor, dividendo % divisor, contador);
    }

    public static void main(String[] args) {
        while (true) {
            int n1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite o primeiro número ou -1 para sair do programa."));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite o segundo número ou -1 para sair do programa."));
            if (n1 == -1 || n2 == -1) break;

            int[] contador = {0};
            int resposta = mdc(n1, n2, contador);
            JOptionPane.showMessageDialog(null,
                    "O resultado do MDC é: " + resposta +
                    "\n Ocorreram " + contador[0] + " recursões.");
        }
    }
}
            
    
        
