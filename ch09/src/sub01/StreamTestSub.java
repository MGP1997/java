package sub01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  날짜 : 2025/07/23
 *  이름 : 박민규
 *  내용 : 자바 파일 입출력 스트림 실습
 */
public class StreamTestSub {

    public static void main(String[] args) {

        String source = "C:\\Users\\GGG\\Desktop\\Sample01.txt";
        String target = "C:\\Users\\GGG\\Desktop\\Sample01_copy.txt";

        try (
            // 문자 스트림
            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(target);
        ) {
            int text;

            while ((text = fr.read()) != -1) {
                // 문자 출력 (디버깅용)
                // System.out.print((char) text);
                fw.write(text);
            }

            System.out.println("파일 복사 완료!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료 ...");
    }
}