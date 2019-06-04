package JavaReport;

public class Menu {
    public String getPrompt(String superCategory) {
        switch (superCategory) {
            case "sports":
                return "1.농구  2.야구  3.축구  4.미식축구  5.바둑  6.기타";

            case "business":
                return "1.인물  2.경영이념  3.마케팅  4.재무회계  5.인사관리  6.기타";

            case "programming":
                return "1.인물  2.Java  3.JavaScript  4.node.js  5.C  6.C++";

            case "life":
                return "1.철학";
        }

        return "[동기부여 프로그램] 주제별 1.스포츠  2.비즈니스  3.프로그래밍  4.인생";
    }

    public String getCategory(String superCategory, int number) {
        switch (superCategory) {
            case "sports":
                return "basketball";

            case "business":
                return "entrepreneur";

            case "programming":
                return "developer";

            case "life":
                return "philosophy";
        }

        return "";
    }
}
