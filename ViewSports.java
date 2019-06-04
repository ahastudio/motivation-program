package JavaReport;

import java.util.Scanner;

public class ViewSports {
    public ViewSports() {
    }

    public class ViewBasketball {
        public ViewBasketball() {
            Scanner chooseSports = new Scanner(System.in);
            int selectedSports = chooseSports.nextInt();
            if (selectedSports == 1) {
                // Reference by ArrayListModule.java
                ArrayListModule LargeModule = new ArrayListModule();
                ArrayListModule.BasketballModule showBasketball = LargeModule.new BasketballModule();
                System.out.println(showBasketball);
            }
        }
    }
}
