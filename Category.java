package JavaReport;


public class Category {

    /*The reason why I add the 'public' is that other class should access this inner class.
    default access modifier makes it not be accessed by other classes.*/
    public class SportsCategory {
        public SportsCategory() {
            System.out.println("1.농구  2.야구  3.축구  4.미식축구  5.바둑  6.기타");
            ViewSports LargeSports = new ViewSports();
            ViewSports.ViewBasketball enjoyBasketball = LargeSports.new ViewBasketball();
            System.out.println(enjoyBasketball);
        }
    }

    public class BusinessCategory {
        public BusinessCategory() {
            System.out.println("1.인물  2.경영이념  3.마케팅  4.재무회계  5.인사관리  6.기타");
            ViewBusiness LargeBusiness = new ViewBusiness();
            ViewBusiness.ViewEntrepreneur enjoyEntrepreneur = LargeBusiness.new ViewEntrepreneur();
            System.out.println(enjoyEntrepreneur);
        }
    }

    public class ProgrammingCategory {
        public ProgrammingCategory() {
            System.out.println("1.인물  2.Java  3.JavaScript  4.node.js  5.C  6.C++");
            ViewProgramming LargeProgramming = new ViewProgramming();
            ViewProgramming.ViewDeveloper enjoyDeveloper = LargeProgramming.new ViewDeveloper();
            System.out.println(enjoyDeveloper);
        }
    }

    public class LifeCategory {
        public LifeCategory() {
            System.out.println("1.철학");
        }
    }
}
