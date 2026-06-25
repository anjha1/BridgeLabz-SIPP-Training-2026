import java.util.Scanner;

class KingdomTaxSystem {
    // Method to compute tax based on income
    static double computeTax(double income) {
        if (income < 10000) {
            return income * 0.05; // 5%
        } else if (income <= 50000) {
            return income * 0.15; // 15%
        } else {
            return income * 0.30; // 30%
        }
    }

    // Method to determine tax bracket
    static String getBracket(double income) {
        if (income < 10000) return "5% bracket";
        else if (income <= 50000) return "15% bracket";
        else return "30% bracket";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Single citizen
        System.out.print("Enter income of citizen: ");
        double income = sc.nextDouble();
        double tax = computeTax(income);
        System.out.println("Tax Bracket: " + getBracket(income));
        System.out.println("Tax Amount: " + tax);

        // Extend: 10 citizens
        double[] citizens = new double[10];
        double totalTax = 0;

        System.out.println("\nEnter incomes of 10 citizens:");
        for (int i = 0; i < 10; i++) {
            citizens[i] = sc.nextDouble();
            double t = computeTax(citizens[i]);
            totalTax += t;
            System.out.println("Citizen " + (i+1) + ": Income = " + citizens[i] +
                               ", Bracket = " + getBracket(citizens[i]) +
                               ", Tax = " + t);
        }

        System.out.println("\nTotal Tax Collected = " + totalTax);
    }
}
