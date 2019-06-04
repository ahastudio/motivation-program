package JavaReport;

import java.util.Scanner;

public class Motivation {
    private static final String[] SUPER_CATEGORIES =
            new String[]{"sports", "business", "programming", "life"};

    public static void main(String[] args) {
        System.out.println("[동기부여 프로그램] 주제별 1.스포츠  2.비즈니스  3,프로그래밍  4.인생");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt() - 1;

        if (number < 0 || number >= SUPER_CATEGORIES.length) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        Menu menu = new Menu();
        String superCategory = SUPER_CATEGORIES[number];
        Category category = menu.createCategory(superCategory);

        if (category == null) {
            System.out.println("준비 중입니다.");
            return;
        }

        System.out.println(category);
    }
}
