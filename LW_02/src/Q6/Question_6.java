package Q6;
import java.util.*;
import java.time.Year;

public class Question_6 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a year:- ");
        int Byear=scanner.nextInt();

        int currentyear=Year.now().getValue();

        System.out.println("You were Born in " + Byear + " and will be "+ (currentyear-Byear) +  " This year");
    }
}
