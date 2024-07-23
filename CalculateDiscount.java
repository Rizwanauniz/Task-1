import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        
        double discount = 0.0;
        if (purchaseAmount < 500) {
            discount = 0.0;
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            discount = 0.1;
        } else if (purchaseAmount > 1000) {
            discount = 0.2;
        }
        
        double payableAmount = purchaseAmount * (1 - discount);
        
        System.out.println("Final payable amount after discount: " + payableAmount);
        
        scanner.close();
    }
}
