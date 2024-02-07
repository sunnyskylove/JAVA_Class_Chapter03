package question;

import java.util.Scanner;

public class Question06_ {
    public static void main(String[] args) {

        //연습. Scanner 객체생성

        Scanner sc = new Scanner(System.in);     //  자료 만들고

        System.out.print("연습 놀이 : ");
        String practice = sc. nextLine();       // 공백포함 : "연습 놀이"
        System.out.println(practice);

        System.out.println(("연습 놀이 :"));
        String practice2 = sc. next();        //공백포함안함 : "연습 "
        System.out.println(practice2);



    }

}
