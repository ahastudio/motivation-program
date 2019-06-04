package JavaReport;

public class BusinessCategory {
    public BusinessCategory() {
        System.out.println("1.인물  2.경영이념  3.마케팅  4.재무회계  5.인사관리  6.기타");
        Category category = new Category("entrepreneur");
        System.out.println(category);
    }
}
