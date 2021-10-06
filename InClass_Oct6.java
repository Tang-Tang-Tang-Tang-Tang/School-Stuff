import java.util.Scanner;

public class InClass_Oct6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of baskets: ");
        int count = kb.nextInt();
        double weight = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter the weight (lbs) of baskets: ");
            weight = weight + kb.nextDouble();
        }

        kb.close();
        System.out.print("Result: " + count + " baskets with a combined weight of ");
        System.out.printf("%.2f", weight);
        System.out.print(" pounds.");
    }
}