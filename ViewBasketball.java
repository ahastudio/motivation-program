package JavaReport;

import java.util.Scanner;

public class ViewBasketball {
    private Model model = new Model();

    public ViewBasketball() {
        Scanner chooseSports = new Scanner(System.in);
        int selectedSports = chooseSports.nextInt();
        if (selectedSports == 1) {
            model.initBasketball();
        }
        System.out.println(model);
    }
}
