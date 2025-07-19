import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args){

        // calculate the area of the rectangle

        double width =0;
        double height =0;
        double area =0;

        Scanner scanner =new Scanner(System.in);
        System.out.print("Please enter the first value: ");
        int num1 = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 =scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter the sign(*, /, +, -) ");
        String sign =scanner.nextLine();

        if (sign.equals("+")){
            System.out.println("Result: " +(num1 +num2));
        } else if (sign.equals("-")) {
            System.out.println("Result: " +(num1 - num2));
        } else if (sign.equals("/")) {
            System.out.println("Result: " +(num1 / num2));
        } else if (sign.equals("*")){
            System.out.println("Result: " +(num1 * num2));
        } else {
            System.out.println("Bunaqa belgi topilmadi");
        }


        scanner.close();
    }
}