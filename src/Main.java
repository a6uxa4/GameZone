import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру !");
        System.out.println("№ 1: Найди число ( FindNumber )");
        System.out.println("№ 2: Угадаю день рождение ( FindBirthday )");
        System.out.println("№ 3: Математика ( Math )");

        System.out.print("Напишите одно из них: ");
        boolean hasSelectedGame = false;
        Scanner Selected = new Scanner(System.in);

        while (!hasSelectedGame) {
            String UserSelected = Selected.next();
            switch (UserSelected) {
                case "FindNumber" -> {
                    gameOne();
                    hasSelectedGame = true;
                }
                case "FindBirthday" -> {
                    gameTwo();
                    hasSelectedGame = true;
                }
                case "Math" -> {
                    gameThree();
                    hasSelectedGame = true;
                }
                default -> System.out.print("Напишите правильно");
            }
        }
    }
        public static void gameOne() {
            Scanner input = new Scanner(System.in);
            int randomNumber = (int) (Math.random() * 50) + 1;
            boolean hasGuessed = false;
            System.out.println("Я загадал число от 1 до 50. Попробуйте угадать!");
            while (!hasGuessed) {
                System.out.print("Введите ваше предположение: ");
                int guess = input.nextInt();
                if (guess == randomNumber) {
                    hasGuessed = true;
                    System.out.println("Поздравляю! Вы угадали число!");
                } else if (guess < randomNumber) {
                    System.out.println("Загаданное число больше.");
                } else {
                    System.out.println("Загаданное число меньше.");
                }
            }
            input.close();
        }
        public static void gameTwo(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Привет! Ответь на несколько вопросов, чтобы я угадал твой день рождения.");
            System.out.println("Ответь 'да' или 'нет'.");
            int day = 0;
            System.out.println("Это число от 1 до 10?");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("да")) {
                day += 1;
            }
            System.out.println("Это число от 11 до 20?");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("да")) {
                day += 10;
            }
            System.out.println("Это число от 21 до 31?");
            answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("да")) {
                day += 20;
            }
            System.out.println("Твой день рождения " + day + " число!");
            scanner.close();
        }

        public static void gameThree() {
        boolean hasGuessed = false;

        while(!hasGuessed){
            int randomNumberOne = (int) (Math.random() * 10) + 1;
            int randomNumberTwo = (int) (Math.random() * 10) + 1;
            System.out.println("Привет сколько будет " + randomNumberOne + " " + "+" + " " + randomNumberTwo);
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();
            if(guess == randomNumberTwo + randomNumberOne){
                System.out.println("Правильно");
                hasGuessed = true;
            }else {
                System.out.println("Не правильно");
            }
        }
    }
}
