package JavaReport;
import java.util.*;


public class ViewBusiness {
        public ViewBusiness() {

        }
        public class Entrepreneur {
            public Entrepreneur() {
                Scanner chooseBusiness = new Scanner(System.in);
                int selectedBusiness = chooseBusiness.nextInt();
                if (selectedBusiness == 1) {
                    ArrayList<String> ArrayListBusiness = new ArrayList<String>();
                    ArrayListBusiness.add("(NBA 댈러스 매버릭스 구단주 마크 큐반) : 에스프레소 머신?  장난하나? \n에스프레소 머신에 돈을 쓰기 전에 당신 혀부터 깨물어라. \n커피는 고객을 위한 것이다. \n점심시간에 사무실이 아닌 장소에서 이야기를 나누며 커피를 마셔도 충분하다 \n\n");
                    ArrayListBusiness.add("야구에서 4할을 치는 타자는 명예에 전당에 오른다. 하지만 사업에서는 딱 한 번만 옳으면 된다.\n\n");
                    ArrayListBusiness.add("날마다 저 밖에 있는 누군가는 반드시 당신의 사업을 박살내겠다는 일념 하나로 24시간 일하고있다. 정말 쿨하지 않나!\n\n");
                    ArrayListBusiness.add("열정을 따르라는 조언은 정말 엿 같은 거다. \n 폼나는 물건은 절대로, 절대로 사지마라.\n 회사 외부의 누군가가 밖을 돌아다닐 때 당신 회사의 인터넷 주소가 박힌 \n 티셔츠를 입을 거라고 당신이 정말로 생각한다면,\n 그건 당신의 착각이고 당신은 돈을 벌 방법을 전혀 모르고 있는 거다.  \n\n");
                    System.out.println(ArrayListBusiness);
                }
            }
        }
}
