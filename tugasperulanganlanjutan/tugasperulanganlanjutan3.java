public class tugasperulanganlanjutan3 {
    public static void main(String[] args) {
        int a = 0, b = 1;  
        System.out.print("Deret Fibonacci: " + a + " " + b + " ");
    
        while (true) {
            int next = a + b;  
            if (next >= 200) {
                break;
            }
            System.out.print(next + " "); 
            a = b;
            b = next;
        }
        
        System.out.println(); 
    }
}
