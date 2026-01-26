package 종합.예제2;

import java.util.Scanner;

public class Boardservice2 {
    public static void main(String[] args) {
        String[] contents = new String[100];
        String[] writers = new String[100];

        for ( ; ; ) {
            System.out.println("============= My Community =============");
            System.out.println("1. 게시물쓰기 2. 게시물출력");
            System.out.println("========================================");
            System.out.println("선택>");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            if (ch == 1) {
                scan.nextLine();
                System.out.println("내용: ");
                String content = scan.nextLine();
                System.out.println("작성자: ");
                String writer = scan.nextLine();
                boolean save = false; // 저장했다 true, 저장 못 했다 false
                for (int index = 0; index <= contents.length - 1; index++) {
                    if (contents[index] == null && writers[index] == null) { // index번째 요소값이 비어있으면
                        contents[index] = content;
                        writers[index] = writer; // 입력받은 값들을 index번째 대입
                        save = true;
                        break; // 저장 성공시 save에 true 대입 후 반복문 종료
                    }
                }
                if (save == true) {
                    System.out.println("[안내] 글쓰기 성공");
                } else {
                    System.out.println("[경고] 게시물을 등록할 공간이 부족합니다.");
                }
            } else if (ch == 2) {
                for (int index = 0; index <= contents.length - 1; index++) {
                    if (contents[index] != null && writers[index] != null) {
                        System.out.printf("작성자 : %s, 내용 : %s \n", contents[index], writers[index]);
                    }

                }
            }
        }

    }
}
