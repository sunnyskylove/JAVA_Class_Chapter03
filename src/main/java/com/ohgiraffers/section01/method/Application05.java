package com.ohgiraffers.section01.method;

public class Application05 {
    public static void main(String[] args) {

        /* 수업목표. 메소드 리턴에 대해 이해할 수 있다.*/
        /* 필기.
        *   return 이란?
        *   모든 메소드 내부에는 return; 이 존재한다.
        *   void 메소드의 경우 return; 을 명시적으로 작성하지 않아도 마지막 줄에
        *   컴파일러가 자동으로 추가해준다.
        *   return 은 현재 메소드를 강제 종료하고, 호출한 구문으로 다시 돌아가는 명령이다.
        * */

        System.out.println("main() 메소드 시작됨...");

        Application05 app5 = new Application05();
        app5.testMethod();

        System.out.println("main() 메소드 종료됨...");


    }
    public void testMethod() {
        System.out.println("testMethod()  동작하니?");

        /* 필기.
        *   return; 은 컴파일러에 의해 자동으로 추가 되는 구문이다.
        *   코드블록 가장 마지막에 작성해야 하고, 마지막에 작성되지 않을 경우 컴파일 에러를 발생시킨다.
        * */

        return;

//        System.out.println("test");
        // return;은 가장 마지막에 작성해서 나를 불렀던 쪽으로 돌아간다는 말인데
        // 아래에 다시 새로운 코드를 입력하다면, 도달할 수 없는 코드로 에러가 뜨게 된다.
        // 만약 정상적으로 다시 사용하려면 그냥 return;을 마지막에 입력을 안하면 된다.





    }



}
