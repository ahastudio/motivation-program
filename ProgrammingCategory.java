package JavaReport;

public class ProgrammingCategory {
    public ProgrammingCategory() {
        System.out.println("1.인물  2.Java  3.JavaScript  4.node.js  5.C  6.C++");
        ViewProgramming LargeProgramming = new ViewProgramming();
        ViewProgramming.ViewDeveloper enjoyDeveloper = LargeProgramming.new ViewDeveloper();
        System.out.println(enjoyDeveloper);
    }
}
