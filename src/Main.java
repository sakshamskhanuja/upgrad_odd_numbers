public class Main {
    public static void main(String[] args) {
        int number = 25;

        // Checks whether number is greater than or equal to 1.
        while (number >= 1) {
            // Checks if the number is odd.
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
            number--;
        }
    }
}