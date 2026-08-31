public class app { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 

        System.out.println("addition is: " + (a + b)); 
        System.out.println("difference is: " + (a - b)); 
        System.out.println("product is: " + (a * b)); 
        
        // Check to prevent ArithmeticException (division by zero)
        if (b != 0) {
            // Casting 'a' to double ensures the result includes decimal places
            System.out.println("division is: " + ((double) a / b)); 
        } else {
            System.out.println("division is: Undefined (cannot divide by zero)");
        }
    } 
}
