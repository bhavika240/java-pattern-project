import java.util.Scanner;

class patterns{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Pattern Project Menu ===");
            System.out.println("1. Square Pattern");
            System.out.println("2. Right Triangle");
            System.out.println("3. Inverted Triangle");
            System.out.println("4. Pyramid");
            System.out.println("5. Inverted Pyramid");
            System.out.println("6. Diamond");
            System.out.println("7. Number Triangle");
            System.out.println("8. Floyd's Triangle");
            System.out.println("9. Pascal's Triangle");
            System.out.println("10. Hollow Square");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: squarePattern(); break;
                case 2: rightTriangle(); break;
                case 3: invertedTriangle(); break;
                case 4: pyramid(); break;
                case 5: invertedPyramid(); break;
                case 6: diamond(); break;
                case 7: numberTriangle(); break;
                case 8: floydsTriangle(); break;
                case 9: pascalTriangle(); break;
                case 10: hollowSquare(); break;
                case 0: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
    }

    static void squarePattern() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void rightTriangle() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void invertedTriangle() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pyramid() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void invertedPyramid() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void diamond() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void numberTriangle() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void floydsTriangle() {
        int n = 5, num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    static void pascalTriangle() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(num + " ");
                num = num * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }

    static void hollowSquare() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}