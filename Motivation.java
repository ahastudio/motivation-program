package JavaReport;

import java.util.Scanner;

public class Motivation {
    public static void main(String[] args) {
        System.out.println("[동기부여 프로그램] 주제별 1.스포츠  2.비즈니스  3,프로그래밍  4.인생");

        Scanner chooseFirst = new Scanner(System.in);
        int selectedFirst = chooseFirst.nextInt();

        // Main flow control logic
        if (selectedFirst == 1) {
            SportsCategory instanceSports = new SportsCategory();
            System.out.println(instanceSports);
        } else if (selectedFirst == 2) {
            BusinessCategory instanceBusiness = new BusinessCategory();
            System.out.println(instanceBusiness);
        } else if (selectedFirst == 3) {
            ProgrammingCategory instanceProgramming = new ProgrammingCategory();
            System.out.println(instanceProgramming);
        } else if (selectedFirst == 4) {
            LifeCategory instanceLife = new LifeCategory();
            System.out.println(instanceLife);
        }
    }
}
