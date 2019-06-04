package JavaReport;

import java.util.Scanner;

public class Motivation {
    private static final String[] SUPER_CATEGORIES =
            new String[]{"sports", "business", "programming", "life"};

    public static void main(String[] args) {
        Motivation app = new Motivation();
        app.run();
    }

    public void run() {
        Menu menu = new Menu();

        System.out.println(menu.getPrompt(""));

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt() - 1;

        if (number < 0 || number >= SUPER_CATEGORIES.length) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        String superCategory = SUPER_CATEGORIES[number];

        System.out.println(menu.getPrompt(superCategory));

        number = scanner.nextInt();

        String category = menu.getCategory(superCategory, number);

        Model model = new Model();
        model.init(category);

        System.out.println(model);
    }
}
