package com.ohgiraffers.section01.method;

public class Calculator {


    /* 필기. 두 수를 전달 받아 작은 수를 반환 */
    public int minNumberOf(int first, int second) {      // 최소값 반환식, 하기의 return에서 참/거짓으로 값찾기

        return (first > second) ? second : first;

    }

    /* 필기. 두 수를 전달 받아 큰 수를 반환 */
    public static int maxNumberOf(int first, int second){    //최대값 반환식

        return (first > second) ? first : second;

    }
}
