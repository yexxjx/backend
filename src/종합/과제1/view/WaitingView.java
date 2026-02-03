package 종합.과제1.view;

import 종합.과제1.controller.WaitingController;
import 종합.과제1.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {
    private WaitingView() {
    }

    private static final WaitingView instance = new WaitingView();

    public static WaitingView getInstance() {
        return instance;
    }

    private WaitingController wc = WaitingController.getInstance();
    private Scanner scan = new Scanner(System.in);

    public void writeView() {
        scan.nextLine();
        System.out.println("전화번호: ");
        String phone = scan.nextLine();
        System.out.println("인원수: ");
        int people = scan.nextInt();
        boolean result = wc.doPost(phone, people);
        if (result) {
            System.out.println("[안내] 대기 등록 완료");
        } else {
            System.out.println("[안내] 대기 등록 실패");
        }
    }

    public void printView() {
        ArrayList<WaitingDto> waitings = wc.doGet();
        for (WaitingDto waiting : waitings) {
            System.out.printf("번호: %d, 전화번호:%s, 인원수:%d \n",
                    waiting.getNo(), waiting.getPhone(), waiting.getPeople());
        }
    }

    public void indexView() {
        for ( ; ; ) {

            System.out.println("======맛집 대기 시스템======");
            System.out.println("1. 대기등록ㅣ2.대기현황");
            System.out.println("==========================");
            System.out.println("선택>");
            int ch = scan.nextInt();
            if (ch == 1) {
                writeView();
            } else if (ch == 2) {
                printView();
            }
        }
    }
}