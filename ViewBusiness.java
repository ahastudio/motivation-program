package JavaReport;
import java.util.*;


public class ViewBusiness {
        public ViewBusiness() {

        }
        public class Entrepreneur {
            public Entrepreneur() {
                Scanner chooseBusiness = new Scanner(System.in);
                int selectedBusiness = chooseBusiness.nextInt();
                if (selectedBusiness == 1) {
                    // Reference by ArrayListModule.java
                   ArrayListModule LargeModule = new ArrayListModule();
                   ArrayListModule.EntrepreneurModule showEntrepeneur= LargeModule.new EntrepreneurModule();
                   System.out.println(showEntrepeneur);
                }
            }
        }
}
