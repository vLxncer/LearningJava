import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        /* System.out.println("Hello World");
        System.out.println("This is a test.");

        // The above prints to console.

        /*  int x; declaration
            x = 123; //assignment

        int x = 123; //initialization
        float y = 3.14f; //max 6DP
        double z = 3.14; //max 15DP
        boolean a = true; //only uses true or false
        char symbol = '@'; //can output a single character
        String name = "Test"; //can output a string of text */

        /* System.out.println("My Number is: "+x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(symbol);
        System.out.println(name); */

        /*
        //Ensure this has been imported
        Scanner scanner = new Scanner(System.in);



        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine(); //without this line the code will not work after the int.
        System.out.println("What is your favourite food?");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old.");
        System.out.println("You like "+food);
        */

        /*
        int friends = 10;

        friends = friends + 1;

        System.out.println(friends);

        //by adding (double) before the variable the int will be converted to a double
        */


        /*
        String name = JOptionPane.showInputDialog("Enter Name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
        */

        /*
        double x = 3.14;
        double y = 10;

        double z = Math.max(x, y);

        //Math.max; Identifies bigger of two values
        //Math.min; Identifies smaller of two values
        //Math.abs; Turns negative value to positive
        //Math.sqrt; Square root of value
        //Math.round; Rounds value to nearest full number
        //Math.ceil; Rounds value up
        //Math.floor; Rounds value down

        //Below is using the above math to calc the hypotinus of a triangle

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a");
        a = scanner.nextDouble();
        System.out.println("Enter side b");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("Side C = "+c);

        scanner.close();
        */

    }
}
