package JavaReport;

import java.util.Scanner;

public class ViewDeveloper {
    private Model model = new Model();

    public ViewDeveloper() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            model.initDeveloper();
        }
        System.out.println(model);
    }
}
