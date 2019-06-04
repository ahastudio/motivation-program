package JavaReport;

public class ProgrammingCategory {
    Category category;

    public ProgrammingCategory() {
        System.out.println("1.인물  2.Java  3.JavaScript  4.node.js  5.C  6.C++");
        category = new Category("developer");
    }

    public String toString() {
        return category.toString();
    }
}
