package JavaReport;

import java.util.Scanner;

public class ViewDeveloper {
    private Model model = new Model();

    public ViewDeveloper() {
        Scanner chooseProgramming = new Scanner(System.in);
        int selectedProgramming = chooseProgramming.nextInt();
        if (selectedProgramming == 1) {
            model.initDeveloper();
        }
        System.out.println(model);
    }
}
