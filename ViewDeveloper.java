package JavaReport;

import java.util.Scanner;

public class ViewDeveloper {
    public ViewDeveloper() {
        Scanner chooseProgramming = new Scanner(System.in);
        int selectedProgramming = chooseProgramming.nextInt();
        if (selectedProgramming == 1) {
            // Reference by ArrayListModule.java
            ArrayListModule LargeModule = new ArrayListModule();
            ArrayListModule.DeveloperModule showDeveloper = LargeModule.new DeveloperModule();
            System.out.println(showDeveloper);
        }
    }
}
