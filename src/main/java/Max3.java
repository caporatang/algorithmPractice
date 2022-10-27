import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("세 정수의 최댓값을 구합니다");
        System.out.println("a의 값 : "); int a = stdIn.nextInt();
        System.out.println("b의 값 : "); int b  = stdIn.nextInt();
        System.out.println("c의 값 : "); int c  = stdIn.nextInt();
        System.out.println("d의 값 : "); int d = stdIn.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최댓값은" + max + "입니다");

/*-----------------------------------------------------------------------------------*/

        int rsltReturn = max3m(a,  b, c ,d);
        System.out.println("4개의 값중 최대값은" + rsltReturn + "입니다");
   }

   public static int max3m2() {
        int max = 0;
        return max;
   }


        // 연습문제1 --> 입력받은 4가지 값 중 최대값 메서드 구현하기 easy
        public static int max3m(int a2, int b2, int c2, int d2) {
            int max = a2;

            if (max < b2) { max = b2; }
            if(max < c2) { max = c2; }
            if(max < d2) { max = d2; }
            return max;
        }
    }





