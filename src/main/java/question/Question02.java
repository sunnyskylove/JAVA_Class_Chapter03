package question;

public class Question02 {
    public static void main(String[] args) {

        /* 연습. 문자에서 숫자(아스키문자)로 변환*/
        char ch1 = 'a';
        int convertChartoInt = ch1;
        System.out.println("convertChartoInt = " + convertChartoInt);
        System.out.println("a값 구하기= " + ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1<= 'Z')));
        // 나의 답

        char text = 'a';
        System.out.println("문자"+text + "의 unicode:"+ (int)text);

//        //
//        int korean = 80.5;
//        int math = 50.6;
//        int english = 70.8;
//
//        double result1 = korean + math + english;
//        double result2 = result1 / 3;
//        System.out.println("result1 = " + result1);
//        System.out.println("result2 = " + result2);
        // 나의 오답

        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;

        int sum = (int)(korean +math + english);
        int avg = (int)(korean +math + english) /3;

        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + avg);











        

                


    }
}
