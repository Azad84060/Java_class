package oprators;

public class ternary {
      public static void main(String[]args){
          int a = 10;
          int b = 20;
          int c = 30;
          //int result=(a<b)? a:b;
          //System.out.println(result);
          String result1=(a<b)?"a is less than b" :"a is greater";
          System.out.println(result1);
          int num= (a<b)? (a<c? a: b): (b<c? b: c);
          System.out.println(num);
  
      }
  }
