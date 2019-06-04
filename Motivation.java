package JavaReport;

import java.util.Scanner;

public class Motivation {
    private static final String[] SUPER_CATEGORIES =
            new String[]{"sports", "business", "programming", "life"};

    public static void main(String[] args) {
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

        Category category = menu.createCategory(superCategory);

        if (category == null) {
            System.out.println("준비 중입니다.");
            return;
        }

        System.out.println(category);
    }
}
