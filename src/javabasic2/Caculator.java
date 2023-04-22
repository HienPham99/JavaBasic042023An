package javabasic2;

public class Caculator {
    public static int sumInt(int a, int b) {
         return a+b;
       // System.out.println("Tổng của 2 số nguyên là: "+ sum);
       // return a + b;
    }
    public static float tichFloat(float c, float d) {
          return c*d;
       // System.out.println("Tích 2 số thực là: " + tich);
    }

    public static void main(String[] args) {
        System.out.println("Tổng 2 số nguyên: " + sumInt(15,35));
        System.out.println("Tích 2 số thực: " + tichFloat(12.5f, 8.0f));
    }

   }
