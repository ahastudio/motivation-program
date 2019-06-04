package JavaReport;

import java.util.Scanner;

public class ViewEntrepreneur {
    private Model model = new Model();

    public ViewEntrepreneur() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            model.initEntrepreneur();
        }
        System.out.println(model);
    }
}
