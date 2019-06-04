package JavaReport;

public class ProgrammingCategory {
    public Category createCategory() {
        System.out.println("1.인물  2.Java  3.JavaScript  4.node.js  5.C  6.C++");
        return new Category("developer");
    }
}
