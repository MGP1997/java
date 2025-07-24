package sub02;


class SubThread extends Thread {

    @Override
    public void run() {
        int i = 1;
        while (true) {
            try {
                System.out.println("SubThread - : " + i);
                i++;
                Thread.sleep(1000);  // 1초 일시정지
            } catch (InterruptedException e) {
                System.out.println("작업 스레드 인터럽트 발생!");
                break;  // 무한루프 종료
            }
        }
        System.out.println("작업 스레드 종료!");
    }
}

public class ThreadInterruptTest {
    public static void main(String[] args) {
        SubThread sub = new SubThread();

        // 작업 스레드 실행
        sub.start();

        try {
            Thread.sleep(1000 * 5);  // 5초 대기
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 작업 스레드 인터럽트 발생
        sub.interrupt();

        System.out.println("프로그램 종료 ...");
    }
}
