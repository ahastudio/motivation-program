# motivation-program


--------------------------------------------------------


<h3>1.이 프로그램을 사용하는 상황과 사용자를 정합니다</h3> <br>

사용 상황 : 

           세상에는 수많은 명언이 있다.

           하지만 일반적으로 알려진 명언들과 달리 
           
           Nba 구단주의 명언, 바둑기사의 명언, 미식축구 선수의 명언 등 
           
           한국 내에서 지금 세대가 쉽게 접할 수 없는 명언들도 부지기수다.
           
           따라서 흔히 접할 수 없는 명언들을 집대성하여 한 프로그램에 담음으로써
           
           지속적으로 추가하여 스노우볼링 효과를 이끌어내는 것이 
           
           이 프로그램을 사용하는 가장 큰 강점이라 생각한다.
           
           

사용자 : 

          제작자 본인 또는 제작자가 지속적으로 모은 명언집을 원하는 수요자
    
-------------------------------------------------------------------


<h3>2.이 프로그램에 무엇을 입력했을 때 어떤 결과가 나올지 여러가지로 탐구합니다</h3> <br>

콘솔 프로그램으로써 <br>
콘솔 상에서 단순히 숫자만을 입력도구로 편리하게 카테고리별로 선택하여 볼 수 有. <br>

ex)

1 첫 화면 : [동기부여 프로그램] 주제별 1.스포츠  2.비즈니스  3,프로그래밍  4.인생  <br>

2 스포츠 선택 (키보드 1 입력) <br>

3 두 번째 화면 : 1.농구  2.야구  3.축구  4.미식축구  5.바둑  6.기타 <br>

4 농구 선택 (키보드 1 입력) <br>

5 [

(마이클 조던) : 두려움은 환상이다 

, 9000번 이상 슛을 놓치고.300번의 게임에서 졌다.
 나를 믿고 맡겨진 결정골을 놓친것은 26번이다.
 나는 지금까지 실패하고 또 실패했다.
 그것이 내가 성공한 이유다.

, WELCOME to NBA 


, (찰스 바클리) : 누군가는 영웅이 되어야 한다. 어쩌면 그 영웅이 나일지도 모른다 

]


-----------------------------------------------------------------------

<h3>3.이 프로그램이 제대로 되었다는 사실을 확인할 수 있는 방법을 정합니다</h3> <br>

IDE Intelli j에서 콘솔창으로 확인 또는 <br>

Windows cmd를 통해 확인 <br>






지속적인 수정 방향) 

           1. 고객이 이 프로그램 상에서 실시간으로 바로 새로운 내용을 입력하여 저장이 되도록 구현 (X)

           2. 원래 처음에는 배열을 사용하였으나 1번을 충족시키기 어렵다고 판단하여 HashMap을 사용. 
              하지만 HashMap의 경우, 콘솔창에 출력되는 모양이 예쁘지 않고 지저분하여 결국 ArrayList 사용. 
              ArrayList를 통해 고객이 얼마든지 내용을 추가할 수 있도록 구현 (O)
           
           3. 내용이 비슷하게 중복되는 클래스들을 Interface나 오버라이딩 등을 사용하여 좀 더 편하게 수정하고 
              동료들이 읽기 쉽게 리팩토링 (X)
              
           4. 객체지향 프로그램을 추구하기 위해 클래스와 로직을 잘게 분리하여 여러 개의 파일을 생성 (O)
                 
           5. 코드를 10년 후에 다시 볼 때도 쉽게 이해할 수 있도록 변수명의 가시성 향상 (O)   
           
           6. Windows cmd 콘솔창에서 error가 발생.
              첫 해결 시도 : [참고 사이트](https://extrememanual.net/12502)
                            chcp 949 -> chcp 65001로 수정
              첫 시도 결과 : 한글로 조금씩 알아볼 수 있게 에러 표시가 나타남
              
              두 번째 시도 : javac MotivationProgram.java 코드 뒤에  -encoding UTF-8 을 추가
              두 번째 결과 : 디렉토리를 확인해 보니 java파일 내 모든 class들이 컴파일 됨
              
              세 번째 시도 : 컴파일 후, java MotivationProgram 입력 
              
              세 번째 결과 : C:\Users\KyuMinLee\IdeaProjects\java-dalLab-1\src\JavaReport>java MotivationProgram
                            Error: Could not find or load main class MotivationProgram
                            Caused by: java.lang.ClassNotFoundException: MotivationProgram
                            
              네 번째 시도 : [참고 사이트](https://superblo.tistory.com/entry/%EC%BB%A4%EB%A7%A8%EB%93%9Ccmd%EC%97%90%EC%84%9C-%EC%9E%90%EB%B0%94-%EC%BB%B4%ED%8C%8C%EC%9D%BC%ED%95%98%EA%B8%B0-%EB%B0%8F-%EC%8B%A4%ED%96%89-%EB%B0%A9%EB%B2%952?category=667828)
              
                             

C:\Users\KyuMinLee\IdeaProjects\java-dalLab-1\src\JavaReport>
              

-------------------------------------------------------------------------

<h3>4.프로그램을 구현합니다</h1> <br>

<img src="https://github.com/gyumeen/motivation-program/blob/master/images/%EA%B5%AC%ED%98%84%201.png?raw=true">

<img src="https://github.com/gyumeen/motivation-program/blob/master/images/cmd%20%EC%BB%B4%ED%8C%8C%EC%9D%BC%20%EC%97%90%EB%9F%AC.png?raw=true">

이건 뭐지..



--------------------------------------------------------------------------

<h3>5.프로그램을 공유합니다</h1> <br>
달랩 멘토링 커뮤니티에 게시. <br>
<br>

-----------------------------------------------------------------------------
