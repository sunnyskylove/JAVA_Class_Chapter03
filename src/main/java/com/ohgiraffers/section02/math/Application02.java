package com.ohgiraffers.section02.math;

import java.util.Random;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 사용자 지정 범위의 난수를 발생시킬 수 있다. */
        /* 필기.
        *   난수의 활용
        *   Math.random()을 이용해 발생한 난수는 0부터 1전까지의 실수 범위의 난수를 반환한다.(0초과 1미만)
        *   필요에 따라 정수 형태의 값을 원하는 범위 만큼 발생시켜야 하는 경우들이 존재한다.
        * */

        /* 필기.
        *   원하는 범위의 난수를 구하는 공식
        *   공식: (int) (Math.random()* 구하려는 난수의 개수)+ 구하려는 난수의 최소값
        * */

        /* 목차. 1. 0~9까지의 난수 발생 */
        int random1 = (int)(Math.random() * 10 + 0);
//   큰 실수값으로 나와야하는데 작은 정수값으로 받아야해서  int 명시해서 강제형변환해준다. (공식 대입해서 식 만들기!)
        System.out.println("random1 = " + random1);

        /*목차. 2. 1 ~ 10까지의 난수 발생*/
        int random2 = (int)(Math.random() * 10 + 1);
        System.out.println("random2 = " + random2);

        /*목차. 3. 10 ~ 15까지의 난수 발생*/
        int random3 = (int)(Math.random() * 6 + 10);
        System.out.println("random3 = " + random3);

        /*목차. 4. -128 ~ 127까지의 난수 발생*/
        double random4 = (double)(Math.random() * 256 - 128);
        System.out.println("random4 = " + random4);




    }
}