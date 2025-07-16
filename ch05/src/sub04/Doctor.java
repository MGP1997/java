package sub04;

public class Doctor extends Person {

    private String specialty;

    // 생성자: specialty도 받을 수 있게 수정
    public Doctor(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    // 작업 수행 메서드
    public void work() {
        System.out.println("Doctor is working");
    }

    // 자기소개 메서드
    public void introduce() {
        System.out.println("제 이름은 " + name() + "이고 나이는 " + age() + "세이며 전문분야는 " + specialty + "입니다.");
    }
}