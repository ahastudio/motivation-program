package JavaReport;

import java.util.Scanner;

public class Motivation {
    public static void main(String[] args) {
        System.out.println("[동기부여 프로그램] 주제별 1.스포츠  2.비즈니스  3,프로그래밍  4.인생");

        Scanner chooseFirst = new Scanner(System.in);
        int selectedFirst = chooseFirst.nextInt();

        // Main flow control logic
        if (selectedFirst == 1) {
            SportsCategory menu = new SportsCategory();
            Category category = menu.createCategory();
            System.out.println(category);
        } else if (selectedFirst == 2) {
            BusinessCategory menu = new BusinessCategory();
            Category category = menu.createCategory();
            System.out.println(category);
        } else if (selectedFirst == 3) {
            ProgrammingCategory menu = new ProgrammingCategory();
            Category category = menu.createCategory();
            System.out.println(category);
        } else if (selectedFirst == 4) {
            LifeCategory menu = new LifeCategory();
            Category category = menu.createCategory();
            System.out.println("준비 중입니다.");
        }
    }
}
