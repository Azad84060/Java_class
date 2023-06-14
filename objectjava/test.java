package objectjava;

public class test {
      int a = 2;
      String name = "Azad";

      public static void main(String[] args) {
           test obj1 =  new test();
           test obj2 =  new test();

           obj1.name="Imtiyaz";
           System.out.println(obj1.name);
           System.out.println(obj1.a);

           System.out.println(obj2.name);
           System.out.println(obj2.a);

      }
}
