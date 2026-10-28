import java.util.Scanner;

void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size: ");
    int n = sc.nextInt();

    System.out.println("1. Right Triangle");
    System.out.println("2. Inverted Triangle");
    System.out.println("3. Pyramid");
    System.out.println("4. Inverted Pyramid");
    System.out.println("5. Square");

    System.out.print("Choose pattern: ");
    int choice = sc.nextInt();

    if (n <= 0) {
        System.out.println("Invalid size");
    } else {
        printPattern(n, choice);
    }
}

void printPattern(int n, int choice) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {

            if (choice == 1 && j <= i)
                System.out.print("* ");

            else if (choice == 2 && j <= n - i + 1)
                System.out.print("* ");

            else if (choice == 3 && j >= n - i + 1)
                System.out.print("* ");

            else if (choice == 4 && j >= i)
                System.out.print("* ");

            else if (choice == 5)
                System.out.print("* ");

            else
                System.out.print("  ");
        }
        System.out.println();
    }
}