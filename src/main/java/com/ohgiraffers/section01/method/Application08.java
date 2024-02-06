package com.ohgiraffers.section01.method;

public class Application08 {
    public static void main(String[] args) {


        /* 수업목표. static 메소드를 호출할 수 있다.*/
        /* 필기.
        *   static 메소드 호출
        * */

        /* 필기.
        *   static 메소드 호출 방법
        *   - 공식: 클래스명.메소드명();     <- 이런 방식으로 호출한다.
        * */

        System.out.println("10과 20의 합: " + Application08.sumTwoNumbers(10,20));
           // 대입하여 넣는 곳, 미리 공간을 만들어 놓음

        /* 필기. 동일한 클래스 내에 작성된 static 메소드는 클래스명이 생략 가능하다.*/
        System.out.println("20과 30의 합 : " + sumTwoNumbers(20,30));
        // 2번째 작성, 동일한 클래스 내이므로 클래스명 생략

    }

    public static int sumTwoNumbers(int first, int second){

        return first + second;
           //계산을 하는 곳

    }

}
