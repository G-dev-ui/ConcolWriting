public class ColorConsole {
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    public static boolean isValidColor(String color) {
        return color.matches("[1-8]");
    }

    public static void printColor(String color, String text) {
        switch (color) {
            case "1":
                System.out.println(RED + text + RESET);
                break;
            case "2":
                System.out.println(GREEN + text + RESET);
                break;
            case "3":
                System.out.println(BLACK + text + RESET);
                break;
            case "4":
                System.out.println(YELLOW + text + RESET);
                break;
            case "5":
                System.out.println(BLUE + text + RESET);
                break;
            case "6":
                System.out.println(PURPLE + text + RESET);
                break;
            case "7":
                System.out.println(CYAN + text + RESET);
                break;
            case "8":
                System.out.println(WHITE + text + RESET);
                break;
            default:
                System.out.println("Неизвестный цвет. Печать стандартным цветом.");
                System.out.println(text);
        }
    }
}