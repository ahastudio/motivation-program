package JavaReport;

public class SportsCategory {
    public SportsCategory() {
        System.out.println("1.농구  2.야구  3.축구  4.미식축구  5.바둑  6.기타");
        ViewBasketball enjoyBasketball = new ViewBasketball("basketball");
        System.out.println(enjoyBasketball);
    }
}
