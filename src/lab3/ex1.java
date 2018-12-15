package lab3;

import java.util.Scanner;

public class ex1 {

    public static void main (String[]args){

        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your nickname? : ");
        name = sc.nextLine();
        System.out.println("Hello,"+ name);
        //age
        System.out.println("how old are you? : ");
        int age = sc.nextInt();
        System.out.println("you are"+age+" years old");
        if (age > 30) System.out.println("you are older.");
        else System.out.println("you are your.");










    }//main
}//class
