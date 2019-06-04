package JavaReport;

public class SportsCategory {
    public SportsCategory() {
        System.out.println("1.농구  2.야구  3.축구  4.미식축구  5.바둑  6.기타");
        ViewSports LargeSports = new ViewSports();
        ViewSports.ViewBasketball enjoyBasketball = LargeSports.new ViewBasketball();
        System.out.println(enjoyBasketball);
    }
}
