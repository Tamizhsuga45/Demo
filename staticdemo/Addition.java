package staticdemo;

public class Addition {
 // Static block
    static {
        System.out.println("static block executing");
    }

    // Constructor 
    public Addition() {
    	System.out.println("calling constructor");
    }

    // Static method for addition
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
            
        int sum = add(40, 5);
        Addition a1=new Addition();
        System.out.println("Sum: " + sum);
        
        
    }
}