import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в простую игру!");

        int randomNumber = (int) (Math.random() * 50) + 1;
        boolean hasGuessed = false;

        System.out.println("Я загадал число от 1 до 50. Попробуйте угадать!");

        while (!hasGuessed) {
            System.out.print("Введите ваше предположение: ");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                hasGuessed = true;
                System.out.println("Поздравляю! Вы угадали число!");
            } else if (guess < randomNumber) {
                System.out.println("Загаданное число больше.");
            } else {
                System.out.println("Загаданное число меньше.");
            }
        }

        scanner.close();
    }
}
