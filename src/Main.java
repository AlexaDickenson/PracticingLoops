import java.util.Scanner;

class TakeABreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "";

        while (!answer.equals("yes")) {
            System.out.print("Do you want to take a break? ");
            answer = input.nextLine().toLowerCase();
        }

        System.out.println("Great! Take a break.");
    }
}
class StopAtFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        while (number != 5) {
            System.out.print("Enter a number: ");
            number = input.nextInt();
        }

        System.out.println("You entered the number 5.");
    }
}

class PositiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;

        while (number != 0) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number < 0) {
                System.out.println("Number must be positive.");
            } else if (number > 0) {
                System.out.println("You entered: " + number);
            }
        }

        System.out.println("Exiting program.");
    }
}

class CountToEleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number less than 11: ");
            number = input.nextInt();
        } while (number >= 11);

        System.out.println("Counting from " + number + " to 11:");
        for (int i = number; i <= 11; i++) {
            System.out.println(i);
        }
    }
}
class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
