import java.util.*;
public class CalculateDistance{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double kilometers = input.nextDouble();
        double miles = kilometers*1.6;
        System.out.println("The total miles is "+ miles+"miles for the given "+kilometers+ "km");
    }
}