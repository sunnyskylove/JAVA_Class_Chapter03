package question;

/* 중요!! 복습_테스트 만들어 보기 풀고, 마지막거 다시~!!*/
public class Question5_ {
    public static void main(String[] args) {

        System.out.println("main 이다.");


        Question5_ app0 = new Question5_();
        app0.test01(0.1);

        test02(50);
        int result = test02(50);
        System.out.println(app0.test02(+50));
        System.out.println("result = " + result);

        String result1 = (app0.test03("메롱"));  //ch 변수를 임의로 만들어 준다.
        System.out.println("result1: " + result1);

        int result2 = (app0.test04(1));
        System.out.println("result2:"  + result2);

        char result3 = (app0.test05('바'));
        System.out.println("result3: " + result3);

        /*=============================================================*/

        app0.test06("푸바오", 10, '여');



        int result5 = (app0.test07(100));
        System.out.println("result5 : " + result5);



        System.out.println("main 끝.");




    }

    public void test01(double num) {
        System.out.println("num = " + num);

    }

    public static int test02(int num) {
        return num;

    }

    public String test03(String ch) {
        return ch;

    }

    public int test04(int bibi){
        return bibi;

    }

    public char test05(char 푸){
        return 푸;

    }
/*===========================================================================*/
    public void test06(String name,int first,char gender){
        System.out.println("이름은" + name +"이고, 나이는 " + first + "이고, 성별은" + gender+ "이다." );
    }

    // 자료형은 같은 자료형끼리밖에 안된다. 다른 자료형이라면, void로만 가능
    // 다른 자료형으로는 안됨(return 값은 1개밖에 안됨), 같은자료형으로 맞춰서 할 수 있음.
    // 관련하여 다음에 배울예정

    public int test07(int di){
        return di;

}


}


