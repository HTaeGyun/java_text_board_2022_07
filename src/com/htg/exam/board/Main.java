package com.htg.exam.board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("게시판 v 0.1");

    System.out.println("=== 프로그램 시작 ===");

    // 명령

    while (true) {
      System.out.print("입력) ");
      String cmd = sc.nextLine();
      System.out.printf("명령) %s\n", cmd);


      if (cmd.equals("exit")){
        System.out.println("=== 프로그램 종료 ===");
        break;
      }


    }
    sc.close();

  }
}
