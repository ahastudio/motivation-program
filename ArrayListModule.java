package JavaReport;

import java.util.ArrayList;

public class ArrayListModule {
    public class SportsMoudule {
    }

    public class BusinessModule {
    }

    public class ProgrammingModule {
    }

    public class BasketballModule extends SportsMoudule {
        ArrayList<String> ArrayListBasketball = new ArrayList<String>();

        public BasketballModule() {
            ArrayListBasketball.add("(마이클 조던) : 두려움은 환상이다 \n\n");
            ArrayListBasketball.add("9000번 이상 슛을 놓치고.300번의 게임에서 졌다.\n 나를 믿고 맡겨진 결정골을 놓친것은 26번이다.\n 나는 지금까지 실패하고 또 실패했다.\n 그것이 내가 성공한 이유다.\n\n");
            ArrayListBasketball.add("WELCOME to NBA \n\n\n");
            ArrayListBasketball.add("(찰스 바클리) : 누군가는 영웅이 되어야 한다. 어쩌면 그 영웅이 나일지도 모른다 \n\n");
            System.out.println(ArrayListBasketball);
        }
    }

    public class EntrepreneurModule extends BusinessModule {
        ArrayList<String> ArrayListBusiness = new ArrayList<String>();

        public EntrepreneurModule() {
            ArrayListBusiness.add("(NBA 댈러스 매버릭스 구단주 마크 큐반) : 에스프레소 머신?  장난하나? \n에스프레소 머신에 돈을 쓰기 전에 당신 혀부터 깨물어라. \n커피는 고객을 위한 것이다. \n점심시간에 사무실이 아닌 장소에서 이야기를 나누며 커피를 마셔도 충분하다 \n\n");
            ArrayListBusiness.add("야구에서 4할을 치는 타자는 명예에 전당에 오른다. 하지만 사업에서는 딱 한 번만 옳으면 된다.\n\n");
            ArrayListBusiness.add("날마다 저 밖에 있는 누군가는 반드시 당신의 사업을 박살내겠다는 일념 하나로 24시간 일하고있다. 정말 쿨하지 않나!\n\n");
            ArrayListBusiness.add("열정을 따르라는 조언은 정말 엿 같은 거다. \n 폼나는 물건은 절대로, 절대로 사지마라.\n 회사 외부의 누군가가 밖을 돌아다닐 때 당신 회사의 인터넷 주소가 박힌 \n 티셔츠를 입을 거라고 당신이 정말로 생각한다면,\n 그건 당신의 착각이고 당신은 돈을 벌 방법을 전혀 모르고 있는 거다.  \n\n");
            System.out.println(ArrayListBusiness);
        }
    }

    public class DeveloperModule extends ProgrammingModule {
        ArrayList<String> ArrayListProgramming = new ArrayList<String>();

        public DeveloperModule() {
            ArrayListProgramming.add("(코딩의 신 아샬) : 안녕하세요, 코딩의 신 아샬입니다. \n\n");
            ArrayListProgramming.add("안될 때마다 속으로 외치세요. \n뭔가 잘못했겠지. 뭔가 잘못했겠지. \n\n");
            ArrayListProgramming.add("갑자기 산에 틀어 박혀서 \n난 프로그래밍의 극의에 다다른 자 으아! \n이러고 내려와서 실전에 가보면\n발릴 걸요? \n그냥 발릴 걸요?\n쪽도 못 쓸 걸요?\n이건 중 2병이죠.\n\n");
            ArrayListProgramming.add("피아노는 이렇게 손바닥을 펴고 때리는 거야! 이렇게! 도레미파솔!    \n\n");
            ArrayListProgramming.add("Managed 언어, Unmanaged 언어 이런 게 중요한 게 아니라\n컴퓨터를 알아야 돼요 컴퓨터를!  \n\n");
            ArrayListProgramming.add("으아아 개XX들아! 난 나간다 으아아! \n\n");
            ArrayListProgramming.add("그럼 다들 안녕히 주무세요. 바이~ \n\n");
            System.out.println(ArrayListProgramming);
        }
    }
}
