package JavaReport;

public class Menu {
    public Category createCategory(String superCategory) {
        switch (superCategory) {
            case "sports":
                return createSportsCategory();

            case "business":
                return createBusinessCategory();

            case "programming":
                return createProgrammingCategory();

            case "life":
                return createLifeCategory();
        }

        return null;
    }

    public Category createSportsCategory() {
        System.out.println("1.농구  2.야구  3.축구  4.미식축구  5.바둑  6.기타");
        return new Category("basketball");
    }

    public Category createBusinessCategory() {
        System.out.println("1.인물  2.경영이념  3.마케팅  4.재무회계  5.인사관리  6.기타");
        return new Category("entrepreneur");
    }

    public Category createProgrammingCategory() {
        System.out.println("1.인물  2.Java  3.JavaScript  4.node.js  5.C  6.C++");
        return new Category("developer");
    }

    public Category createLifeCategory() {
        System.out.println("1.철학");
        return null;
    }
}
