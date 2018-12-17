package lab4;

import com.sun.org.apache.xpath.internal.operations.Mult;

import java.util.Scanner;

public class Quiz2_Operators {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int x,y;
              System.out.print("Enter integer1:");
        x= SC.nextInt();
        System.out.print("Enter integer2: ");
        y= SC.nextInt();
        //call merhods
        System.out.println("Sum;"+subt(x,y));
        System.out.println("Sub;"+subt(x,y));
        System.out.println("Mul;"+Mult(x,y));
        System.out.println("Div;"+divt(x,y));
    }//main

    private static  int divt(int x, int y){
        return  x / y;
    }//divt
     private static int mult(int x, int y){
        return x * y;
     }//mult
     private static int subt (int x, int y){
        return x - y;
     }//subt
     private static int sumt (int x, int y){
        return x + y;
     }//sumt
}//class
