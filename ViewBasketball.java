package JavaReport;

import java.util.Scanner;

public class ViewBasketball {
    private Model model = new Model();

    public ViewBasketball(String category) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            model.init(category);
        }
        System.out.println(model);
    }
}
