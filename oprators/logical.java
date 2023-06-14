package oprators;

public class logical {
      public static void main(String[] args){
          int a = 10;
          int b = 20;
          int c =20;
          System.out.println( a==b && a>b && a<b);
          System.out.println( a==b || a<b || a>b);
          System.out.println( a==c && a<b && a<c);
          System.err.println(!true);
          System.out.println(!false);
      }
}