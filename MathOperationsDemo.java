class MathOperations {
   
    public int subtract(int a, int b) {
        return a - b;
    }

    
    public double subtract(double a, double b) {
        return a - b;
    }

   
    public int subtract(int a, int b, int c) {
        return a - b - c;
    }
}

public class MathOperationsDemo {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

      
        int result1 = mathOps.subtract(10, 5);
        System.out.println("Result 1: " + result1);

    
        double result2 = mathOps.subtract(8.5, 3.2);
        System.out.println("Result 2: " + result2);

      
        int result3 = mathOps.subtract(20, 5, 3);
        System.out.println("Result 3: " + result3);
    }
}