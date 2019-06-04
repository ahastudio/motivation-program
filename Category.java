package JavaReport;

import java.util.Scanner;

public class Category {
    private Model model = new Model();

    public Category(String category) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            model.init(category);
        }
    }

    public String toString() {
        return model.toString();
    }
}
