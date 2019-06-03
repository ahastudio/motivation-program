package JavaReport;
import java.util.*;


class sportsMember {
    public sportsMember() {
        System.out.println("1.농구  2.야구  3.축구  4.미식축구  5.바둑  6.기타");
        Scanner sc = new Scanner(System.in);
        int choiceThis = sc.nextInt();
        if(choiceThis == 1) {
            ArrayList<String> bsBall = new ArrayList<String>();
            bsBall.add("\n\n(마이클 조던) : 두려움은 환상이다 \n\n");
            bsBall.add("9000번 이상 슛을 놓치고.300번의 게임에서 졌다.\n 나를 믿고 맡겨진 결정골을 놓친것은 26번이다.\n 나는 지금까지 실패하고 또 실패했다.\n 그것이 내가 성공한 이유다.\n\n");
            bsBall.add("WELCOME to NBA \n\n\n");
            bsBall.add("(찰스 바클리) : 누군가는 영웅이 되어야 한다. 어쩌면 그 영웅이 나일지도 모른다 \n\n");
            System.out.println(bsBall);
        }
    }
}

class businessMember {
    public businessMember() {
        System.out.println("1.인물  2.경영이념  3.마케팅  4.재무회계  5.인사관리  6.기타");
    }
}

class programmingMember {
    public programmingMember() {
        System.out.println("1.인물  2.Java  3.JavaScript  4.node.js  5.C  6.C++");
    }
}

class lifeMember {
    public lifeMember() {
        System.out.println("1.철학");
    }
}

public class MotivationProgram {
    public static void main(String[] args)  {
        System.out.println("[동기부여 프로그램] 주제별 1.스포츠  2.비즈니스  3,프로그래밍  4.인생");

        Scanner CN = new Scanner(System.in);
        int choiceNumber = CN.nextInt();

        if(choiceNumber == 1) {
            sportsMember SSM = new sportsMember();
            System.out.println(SSM);
        } else if(choiceNumber == 2) {
            businessMember BSM = new businessMember();
            System.out.println(BSM);
        } else if(choiceNumber == 3) {
            programmingMember PGM = new programmingMember();
            System.out.println(PGM);
        } else if(choiceNumber == 4) {
            lifeMember LFM = new lifeMember();
            System.out.println(LFM);
        }




    }
}

