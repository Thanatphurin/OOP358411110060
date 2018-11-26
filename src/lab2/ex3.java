package lab2;

public class ex3 {

    public static  void  main(String[] atgd){
    //if-else-if
    //simp Grade Calculator
    //F=0-49, D=50-59, C=60-69, B=70-79, A=80-100
    int score = 75;
    if (score >=0 && score <=50)
        System.out.println("Grade F.");
    else if (score >=50 && score <=60 )
        System.out.println("Grade D.");
    else if (score >=60 && score <=70)
        System.out.println("Grade C.");
    else if (score >=70 && score <=80)
        System.out.println("Grade B.");
    else if (score >=80 && score <=90)
        System.out.println("Grade A.");
    else
        System.out.println("Invalid Score.");








    }//main

}//class
