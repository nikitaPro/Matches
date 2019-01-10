package matches;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        if (n < 1 || n > 1000000000) {
            System.out.println("Sorry, n must be (1 <= n <= 10^9)");
            System.exit(1);
        }

        MatchesCalc calc = new MatchesCalc();
        int result = calc.minimumNumber(n);
        
        System.out.println("Minimum number of matches = " + result);
    }

}
