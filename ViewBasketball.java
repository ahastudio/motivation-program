package JavaReport;

import java.util.Scanner;

public class ViewBasketball {
    public ViewBasketball() {
        Scanner chooseSports = new Scanner(System.in);
        int selectedSports = chooseSports.nextInt();
        if (selectedSports == 1) {
            BasketballModule showBasketball = new BasketballModule();
            System.out.println(showBasketball);
        }
    }
}
