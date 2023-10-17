import java.util.Scanner;

class InputIntDoubleStringDemo {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Enter Name :");  // Generating output over console - Enter Name :
        String name = myObj.nextLine();      // String input
       
        System.out.print("Enter Age :");    // Generating output over console - Enter Age :
        int age = myObj.nextInt();            // Numerical (Integer) input
      
        System.out.print("Enter Salary :"); // Generating output over console - Enter Salary :
        double salary = myObj.nextDouble();   // Numerical (float/double) input
        
        // Genrate output as per the input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        
        
    }
}
