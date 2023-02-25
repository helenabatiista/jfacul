public class exerci3 {
    
        public static void main(String[] args) {
            int num = 12;
            System.out.println("O número " + num + " em binário é: " + decimalToBinary(num));
        }
          
        public static String decimalToBinary(int num) {
            if (num == 0) {
                return "0";
            }
            if (num == 1) {
                return "1";
            }
            return decimalToBinary(num / 2) + decimalToBinary(num % 2);
        }
    
    
    
    
    }

