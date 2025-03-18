package Q3;

import java.util.*;

public class Question_3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Temperature in degrees celsius:-");
        double celsius=scanner.nextDouble();

        double Fahrenheit=(1.8*celsius)+32;

        System.out.println(celsius +"to Farenheit is:- " + Fahrenheit);
    }
}
