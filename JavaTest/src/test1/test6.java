package test1;

import java.util.Scanner;

/*
 * 날짜 : 2025/07/09
 * 이름 : 박민규
 * 내용 : 자바 삼항연산자 완성하기
 */
public class test6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = sc.nextInt();
		
		System.out.print("y값 입력 : ");
		int y = sc.nextInt();
		
		String result = x > y ? "x가 더 큽니다." : "y가 더 큽니다.";
		// :에서 앞쪽이 참일경우 끝 거짓이면 다음으로 넘어감
		System.out.println(result);
	}

}
