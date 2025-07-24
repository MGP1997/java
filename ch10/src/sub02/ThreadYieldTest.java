package sub02;

/*
 *  날짜 : 202/07/24
 *  이름 : 박민규
 *  내용 : 자바 스레드 상태 실습하기 
 */

class Sub01Thread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Sub01Thread - " + i);
            Thread.yield(); // 스레드 양보
        }
    }
}

class Sub02Thread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Sub02Thread - " + i);
        }
    }
}

public class ThreadYieldTest {
    public static void main(String[] args) {
        Sub01Thread s1 = new Sub01Thread();
        Sub02Thread s2 = new Sub02Thread();

        s1.start();
        s2.start();

        try {
            s1.join();
            s2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료 ...");
    }
}
