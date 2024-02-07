package question;

public class Question03 {
    public static void main(String[] args) {
//    깃허브_강사님의 실습문제
        int x =2;
        int y= 5;
        char c = 'A';

        char ch1 = 'A';
        int convertChartoInt = ch1;   // 'A' = 65
        System.out.println("A의 값은 :" + convertChartoInt);

        System.out.println(y >=5 || x <0 && x> 2);
        // true_||앞이 true 므로 뒤 수식 무시
        System.out.println(y += 10 - x++);
        // 13_10+3(=2+1)
        System.out.println(x+=2);
        //5,
        System.out.println( ! ('A' <= c && c <= 'Z'));
        // false,
        System.out.println('C'-c);
        //2,C값 구하고, c 뺌
        char ch2 = 'C';
        int convertChartoInt1 = ch2;
        System.out.println("C의 값은: " + convertChartoInt1);  //'C'=67

        System.out.println('5'-'0');
        //
        System.out.println(c+1);
        //66, c==A므로, 65+1
        System.out.println(++c);
        //66, 'A'= 65므로 +1하여서
        System.out.println(c++);
        //
        System.out.println(c);
        //
        System.out.println("==================================");

        int apple = 92;
        int bucket= 10;















    }
}
