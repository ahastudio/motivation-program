package JavaReport;
import java.util.*;

public class Motivation {
    public static void main(String[] args)  {
        System.out.println("[동기부여 프로그램] 주제별 1.스포츠  2.비즈니스  3,프로그래밍  4.인생");

        Scanner chooseFirst = new Scanner(System.in);
        int selectedFirst = chooseFirst.nextInt();

        Category LargeCategory = new Category();

        // Main flow control logic
        if(selectedFirst == 1) {
            Category.SportsCategory instanceSports = LargeCategory.new SportsCategory();
            System.out.println(instanceSports);
        } else if(selectedFirst == 2) {
            Category.BusinessCategory instanceBusiness = LargeCategory.new BusinessCategory();
            System.out.println(instanceBusiness);
        } else if(selectedFirst == 3) {
            Category.ProgrammingCategory instanceProgramming = LargeCategory.new ProgrammingCategory();
            System.out.println(instanceProgramming);
        } else if(selectedFirst == 4) {
            Category.LifeCategory instanceLife = LargeCategory.new LifeCategory();
            System.out.println(instanceLife);
        }
    }
}
