package com.ohgiraffers.test;

public class Application02 {
    public static void main(String[] args) {

        /* 중요!! 전달인자와 매개변수에 대해 복습 */

        System.out.println("main 메소드 동작 실행함...");

        Application02 app2 = new Application02();   // 값을 꺼낼 준비를 한다. 자료만들기 시작~
        app2.testMethod1(100); // 1. 전달인자(호출: 100)
        app2.testMethod2(200);

        int result = app2.testMethod2(200);    // Method2, return 넣었을시
        System.out.println("result = " + result);

        app2.testMethod3("조평훈", 20, '남');   // Method3_전달인자 여러개일때 확인




        System.out.println("main 메소드 동작 종료함...");

    }

    public void testMethod1(int num){   // 2. 매개변수(담을공간 만들기: int num) = 100나옴

        System.out.println(++num);   // 매개변수 새로 해봄 =101나옴 (마지막것인 얘만 나옴)

    }

    public int testMethod2(int num){

        return num;  // return, int 위에 2줄(200)

    }

    /* 위의 전달인자 2개 이상시 */
    public void testMethod3(String name, int age, char gender){

        System.out.println("내 이름은 " + name +"이고, 나이는 " + age + "살이며, 성별은 " + gender + "이야");

    }



}
