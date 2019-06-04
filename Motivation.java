package JavaReport;

import java.util.Scanner;

public class Motivation {
    private static final String[] SUPER_CATEGORIES =
            new String[]{"sports", "business", "programming", "life"};

    private Menu menu = new Menu();
    private String superCategory = "";
    private String category = "";

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Motivation app = new Motivation();
        app.run();
    }

    public void run() {
        while (superCategory.isEmpty()) {
            inputSuperCategory();
        }

        while (category.isEmpty()) {
            inputCategory();
        }

        printQuotes();
    }

    private void inputSuperCategory() {
        println(menu.getPrompt(""));

        int index = inputNumber() - 1;

        try {
            superCategory = SUPER_CATEGORIES[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            println("잘못된 입력입니다.");
            return;
        }
    }

    private void inputCategory() {
        println(menu.getPrompt(superCategory));

        int index = scanner.nextInt() - 1;

        category = menu.getCategory(superCategory, index);
    }

    private void printQuotes() {
        Model model = new Model();
        model.init(category);

        println(model.toString());
    }

    private void println(String text) {
        System.out.println(text);
    }

    private int inputNumber() {
        return scanner.nextInt();
    }
}
