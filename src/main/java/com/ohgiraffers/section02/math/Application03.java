package com.ohgiraffers.section02.math;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. java.util.Random 클래스를 활용하여 사용자 지정 범위의 난수를 발생시킬 수 있다.*/

        /* 필기.
        *   java.util.Random 클래스
        *   nextInt() 메소드를 이용한 난수 발생
        *   nextInt(int bound): 0부터 매개변수로 전달 받은 정수 범위까지의 난수를 발생시켜 정수 형태로 변환
        * */

//        Random random = Random();
//        오류났지만, 위의 package~라인은 import로 변화되어있다.

        /* 필기.
        *   원하는 범위의 난수를 구하는 공식
        *   random.nextInt(구하려는 난수의 개수) + 구하려는 난수의 최소값
        *  */

//        int randomNumber = random.nextInt(bound 10);
//        // ()안 정수인 10을 입력하면 bound 범위가 자동으로 나와야함. 10개 이므로, 0~9까지의 숫자가 나올것임.
//        System.out.println("0부터 9까지의 난수 : " + randomNumber);
        // app2 클래스 식보다 더 깔끔하다.




    }
}
