package JavaReport;

public class SportsCategory {
    Category category;

    public SportsCategory() {
        System.out.println("1.농구  2.야구  3.축구  4.미식축구  5.바둑  6.기타");
        category = new Category("basketball");
    }

    public String toString() {
        return category.toString();
    }
}
