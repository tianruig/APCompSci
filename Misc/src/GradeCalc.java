
import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println("Final Grade Calculator:");
        System.out.println("-----------------------");
        System.out.println("This program calculates what you need to score on the final");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your current grade percent (i.e. 96): ");
        double currGrade = input.nextDouble();
        System.out.print("Enter your desired grade (i.e. 99): ");
        double desiredGrade = input.nextDouble();
        System.out.print("Enter weight of finals (i.e. 25): ");
        double fnlPercent = input.nextDouble() / 100;
        double currPercent = 1 - fnlPercent;
        
        // rearranging desiredGrade = fnlGrade * fnlPercent + currGrade * currPercent
        double fnlGrade = (desiredGrade - currGrade * currPercent) / fnlPercent;

        System.out.printf("You need to score a %.2f%% on the final", fnlGrade);
        
        input.close();
    }

}
