package JavaReport;

import java.util.Scanner;

public class ViewDeveloper {
    public ViewDeveloper() {
        Scanner chooseProgramming = new Scanner(System.in);
        int selectedProgramming = chooseProgramming.nextInt();
        if (selectedProgramming == 1) {
            DeveloperModule showDeveloper = new DeveloperModule();
            System.out.println(showDeveloper);
        }
    }
}
