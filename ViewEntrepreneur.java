package JavaReport;

import java.util.Scanner;

public class ViewEntrepreneur {
    private Model model = new Model();

    public ViewEntrepreneur() {
        Scanner chooseBusiness = new Scanner(System.in);
        int selectedBusiness = chooseBusiness.nextInt();
        if (selectedBusiness == 1) {
            model.initEntrepreneur();
        }
        System.out.println(model);
    }
}
