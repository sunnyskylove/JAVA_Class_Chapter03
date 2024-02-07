package com.ohgiraffers.test;

import com.ohgiraffers.section01.method.Application02;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 메소드의 호출 흐름을 연습해보자 */
        System.out.println("main 프로그램이 시작됩니다.");

        Application01 app1 = new Application01();
        app1.testMethod1();   // testMethod1이다~~!


        System.out.println("main 프로그램이 모든 작업을 종료합니다.");

    }


    public void testMethod1(){
        System.out.println("안녕 나는 testMethod1이야 불렀니?");

        testMethod2();    //위에 작성하려면, app1.testMethod2(); 했지만 내부면 생략가능


        System.out.println(testMethod3());
        // 값 자체를 출력문에 넣어서 출력을 한 상태 _String의 Method3이다~
        String hi = testMethod3();
        System.out.println("hi: " + hi);  // 값을 변수 공간에 담아서 출력을 한 상태
        // String hi = "안녕~ 불렀어?"_String의 Method3이다~



        System.out.println("나는 내 용무를 마쳤으니 돌아가볼게");
    }

    public void testMethod2(){
        System.out.println(" 안녕~나는 testMethod2이야. 불렀니?");
        System.out.println(" 나는 용무를 마쳤으니 돌아가볼께~뿅");

        // void 로 받을시 출력만(내부에 가진 것만 출력하고 돌아가겠다.)

    }

    public String testMethod3(){
        return "안녕~ 불렀어?";

        // 자료형으로 받을땐, return 필요
    }

 }
