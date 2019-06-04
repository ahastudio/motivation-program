package JavaReport;

import java.util.Map;

public class Menu {
    public class IncorrectIndexException extends RuntimeException {
    }

    private static final String[] SUPER_CATEGORIES =
            new String[]{"sports", "business", "programming", "life"};

    private static final Map<String, String> SUPER_CATEGORY_PROMPTS = Map.of(
            "", "[동기부여 프로그램] 주제별 1.스포츠  2.비즈니스  3.프로그래밍  4.인생",
            "sports", "1.농구  2.야구  3.축구  4.미식축구  5.바둑  6.기타",
            "business", "1.인물  2.경영이념  3.마케팅  4.재무회계  5.인사관리  6.기타",
            "programming", "1.인물  2.Java  3.JavaScript  4.node.js  5.C  6.C++",
            "life", "1.철학"
    );

    private static final Map<String, String[]> SUPER_CATEGORY_CATEGORIES =
            Map.of(
                    "sports", new String[]{"basketball"},
                    "business", new String[]{"entrepreneur"},
                    "programming", new String[]{"developer"},
                    "life", new String[]{"philosophy"}
            );

    public String getPrompt(String superCategory) {
        return SUPER_CATEGORY_PROMPTS.get(superCategory);
    }

    public String getSuperCategory(int index) {
        try {
            return SUPER_CATEGORIES[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IncorrectIndexException();
        }
    }

    public String getCategory(String superCategory, int index) {
        String[] categories = SUPER_CATEGORY_CATEGORIES.get(superCategory);

        try {
            return categories[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IncorrectIndexException();
        }
    }
}
