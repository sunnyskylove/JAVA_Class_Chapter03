package question;
/* 연습. 문제1 */
class Question04 {
    public static void main(String[] args){
        Question04.method();
    }
    public static void method(){
        // 여기에 코드를 구현해라. (2조_난수 문제)
//        -35부터 78까지의 난수를 생성하여 출력하는 메소드를 구현해라.
        int random01 = (int)(Math.random()* 114) -35;
        System.out.println("method: " + random01);
        // 따라서 34 나옴_내가 푼 방식

        /*==============연습. 올라온 정답1========================*/
        class Main{
            public static void main(String[] args){
                method();
            }
            public static void method(){
                int x = (int) (Math.random()* (35+1+78))-35;
                System.out.println(x);
            }
        }

        /*연습. 2.
        *   Math API를 사용하여 반지름이 주어졌을때
        *  원의 넓이를 정수형으로 출력하는 메소드를 구현해라.
        *  입력: 123 , 출력: 47529 */

        class Main1{
            public static void main1(String[] args){
                int radius =  123; // 반지름이 123 일때
                method(radius);
            }
            public static void method(int radius){
                // 여기에 코드를 구현해라.

            }
        }


    }


}












