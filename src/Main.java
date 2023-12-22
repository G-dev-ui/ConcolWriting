//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        String color = "";
        while (!ColorConsole.isValidColor(color)) {
            System.out.println("Выберите цвет (1: RED, 2: GREEN, 3: BLACK, 4: YELLOW, 5: BLUE, 6: PURPLE, 7: CYAN, 8: WHITE):");
            color = scanner.nextLine();
            if (!ColorConsole.isValidColor(color)) {
                System.out.println("Неверный выбор цвета. Пожалуйста, попробуйте еще раз.");
            }
        }
        ColorConsole.printColor(color, text);
    }
}