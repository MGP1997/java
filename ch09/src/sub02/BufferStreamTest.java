package sub02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  날짜 : 2025/07/23
 *  이름 : 박민규
 *  내용 : 버퍼 스트림 실습
 */
public class BufferStreamTest {
    public static void main(String[] args) {
        String source = "C:\\Users\\GGG\\Desktop\\Person.tif";
        String target = "C:\\Users\\GGG\\Desktop\\Person2.tif";

        try (
            // 기본 스트림 + 보조 스트림
            FileInputStream fis = new FileInputStream(source);
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream(target);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
        ) {
            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }

            bos.flush(); // 버퍼에 남은 데이터 강제 출력

            System.out.println("파일 복사 완료!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료 ...");
    }
}
