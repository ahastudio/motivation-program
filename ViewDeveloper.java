package JavaReport;

import java.util.Scanner;

public class ViewDeveloper {
    private Model model = new Model();

    public ViewDeveloper(String category) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            model.init(category);
        }
        System.out.println(model);
    }
}
