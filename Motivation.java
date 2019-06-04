package JavaReport;

import java.util.Scanner;

public class Motivation {
    public static void main(String[] args) {
        System.out.println("[동기부여 프로그램] 주제별 1.스포츠  2.비즈니스  3,프로그래밍  4.인생");

        Scanner chooseFirst = new Scanner(System.in);
        int selectedFirst = chooseFirst.nextInt();

        Menu menu = new Menu();
        String superCategory = "";

        // Main flow control logic
        if (selectedFirst == 1) {
            superCategory = "sports";
        } else if (selectedFirst == 2) {
            superCategory = "business";
        } else if (selectedFirst == 3) {
            superCategory = "programming";
        } else if (selectedFirst == 4) {
            superCategory = "life";
        }

        Category category = menu.createCategory(superCategory);

        if (category == null) {
            System.out.println("준비 중입니다.");
            return;
        }

        System.out.println(category);
    }
}
