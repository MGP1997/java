package sub02;

public class ENcapsuleTest {

    public static void main(String[] args) {
        //객체생성
        Car sonata = new Car("소나타", "흰색", 0);//생성자 호출

        //초기화 - 은닉된 속성(멤버변수)은 생성자(Constructor)로 초기화
        //sonata.name = "소나타";
        //sonata.color = "흰색";
        //sonata.speed = 0;

        sonata.speedUp(80);
        sonata.speedDown(20);
        sonata.show();

        //객체 생성과 초기화
        Car avante = new Car("아반테", "검정색", 0);
        avante.speedUp(60);
        avante.speedDown(20);

        //개별 속성이 은닉되어 있기 때문에 속성 수정 불가, Setter로 수정
        avante.setColor("남색");

        avante.show();

        //Account 객체 생성과 초기화(국민은행, 101-11-1001, 김유신, 10000)
        Account kb = new Account("국민은행", "101-11-1001", "김유신", 10000);

        kb.deposit(50000);
        kb.withdraw(30000);
        kb.show();
        kb.setName("김유진");
        kb.show();

        //Account 객체 생성과 초기화(우리은행, 101-21-2001, 김춘추, 30000)
        Account wr = new Account("우리은행", "101-21-2001", "김춘추", 30000);

        wr.deposit(30000);
        wr.withdraw(10000);
        wr.show();
        wr.setBank("너희은행");
        wr.show();



    }

}
