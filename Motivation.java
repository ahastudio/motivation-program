package JavaReport;

import java.util.Scanner;

public class Motivation {
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
        try {
            println(menu.getPrompt(""));
            int index = inputNumber() - 1;
            superCategory = menu.getSuperCategory(index);
        } catch (Menu.IncorrectIndexException e) {
            println("잘못된 입력입니다.");
        }
    }

    private void inputCategory() {
        try {
            println(menu.getPrompt(superCategory));
            int index = inputNumber() - 1;
            category = menu.getCategory(superCategory, index);
        } catch (Menu.IncorrectIndexException e) {
            println("잘못된 입력입니다.");
        }
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
