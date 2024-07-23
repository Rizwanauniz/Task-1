public class PrintNumbers {
    public static void main(String[] args) {
        // Using for loop
        System.out.println("Numbers from 10 to 50 (using for loop):");
        for (int i = 10; i <= 50; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Using while loop
        System.out.println("Numbers from 10 to 50 (using while loop):");
        int j = 10;
        while (j <= 50) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();
    }
}
