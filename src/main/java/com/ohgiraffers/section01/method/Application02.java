package com.ohgiraffers.section01.method;

public class Application02 {
    public static void main(String[] args) {

        /*수업목표. 다른 흐름의 메소드 호출 흐름에 대해 알 수 있다. */
        /* 목차. 1. methodA(), methodB(), methodC() 를 차례대로 작성.*/
        /* 목차. 2. 작성 후 메소드 호출 확인과 실행 종료 출력 구문을 작성하고 다시 현재 위치로 돌아온다. */
        /* 목차. 3. 메인메소드 시작을 확인하기 위한 출력 구문을 작성한다. */

        System.out.println("main() 시작됩니다...");

        Application02 app2 = new Application02();
        app2.mathodA();   // 시작-끝
        app2.methodC();   // 시작-끝
        app2.methodB();   // 시작-끝
        //아래 중복은 되는데 위 중복은 안되는 이유 확인하기

        System.out.println("main() 종료됩니다...");

    }

    public void mathodA() {

        System.out.println("methodA() 시~작");

        System.out.println("methodA() 끝~~");

    }

    public void methodB() {

        System.out.println("methodB() 시~시~시~작!");

        System.out.println("methodB() 이젠 끝~~");

    }

    public void methodC() {

        System.out.println("methodC() 시~~~작");

        System.out.println("methodC() 끝~~~~~");

    }

}
