package JavaReport;

public class BusinessCategory {
    Category category;

    public BusinessCategory() {
        System.out.println("1.인물  2.경영이념  3.마케팅  4.재무회계  5.인사관리  6.기타");
        category = new Category("entrepreneur");
    }

    public String toString() {
        return category.toString();
    }
}
