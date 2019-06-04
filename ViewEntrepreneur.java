package JavaReport;

import java.util.Scanner;

public class ViewEntrepreneur {
    public ViewEntrepreneur() {
        Scanner chooseBusiness = new Scanner(System.in);
        int selectedBusiness = chooseBusiness.nextInt();
        if (selectedBusiness == 1) {
            EntrepreneurModule showEntrepeneur = new EntrepreneurModule();
            System.out.println(showEntrepeneur);
        }
    }
}
