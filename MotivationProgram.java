package JavaReport;
import java.util.*;


class SportsCategory {
    public SportsCategory() {
        System.out.println("1.농구  2.야구  3.축구  4.미식축구  5.바둑  6.기타");
        Scanner chooseSports = new Scanner(System.in);
        int selectedSportsNumber = chooseSports.nextInt();
        if(selectedSportsNumber == 1) {
            ArrayList<String> basketBall = new ArrayList<String>();
            basketBall.add("(마이클 조던) : 두려움은 환상이다 \n\n");
            basketBall.add("9000번 이상 슛을 놓치고.300번의 게임에서 졌다.\n 나를 믿고 맡겨진 결정골을 놓친것은 26번이다.\n 나는 지금까지 실패하고 또 실패했다.\n 그것이 내가 성공한 이유다.\n\n");
            basketBall.add("WELCOME to NBA \n\n\n");
            basketBall.add("(찰스 바클리) : 누군가는 영웅이 되어야 한다. 어쩌면 그 영웅이 나일지도 모른다 \n\n");
            System.out.println(basketBall);
        }
    }
}

class BusinessCategory {
    public BusinessCategory() { System.out.println("1.인물  2.경영이념  3.마케팅  4.재무회계  5.인사관리  6.기타");
    }
}

class ProgrammingCategory {
    public ProgrammingCategory() {
        System.out.println("1.인물  2.Java  3.JavaScript  4.node.js  5.C  6.C++");
    }
}

class LifeCategory {
    public LifeCategory() {
        System.out.println("1.철학");
    }
}

public class MotivationProgram {
    public static void main(String[] args)  {
        System.out.println("[동기부여 프로그램] 주제별 1.스포츠  2.비즈니스  3,프로그래밍  4.인생");

        Scanner chooseFirstNumber = new Scanner(System.in);
        int selectedFirstNumber = chooseFirstNumber.nextInt();

        if(selectedFirstNumber == 1) {
            SportsCategory InstanceOfSports = new SportsCategory();
            System.out.println(InstanceOfSports);
        } else if(selectedFirstNumber == 2) {
            BusinessCategory InstanceOfBusiness = new BusinessCategory();
            System.out.println(InstanceOfBusiness);
        } else if(selectedFirstNumber == 3) {
            ProgrammingCategory InstanceOfProgramming = new ProgrammingCategory();
            System.out.println(InstanceOfProgramming);
        } else if(selectedFirstNumber == 4) {
            LifeCategory InstanceOfLife = new LifeCategory();
            System.out.println(InstanceOfLife);
        }




    }
}

