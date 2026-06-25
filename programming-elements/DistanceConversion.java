import java.util.Scanner;
public class DistanceConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceFeet = sc.nextDouble();
        double yards = distanceFeet / 3;
        double miles = yards / 1760;
        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
    }
}
