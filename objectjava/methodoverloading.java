package objectjava;
class calc{
      public int add(int n1,int n2){
            int result = n1+n2;
            return result;
      }
      public int add(int n1,int n2,int n3){
            int result = n1+n2+n3;
            return result;
      }
      public double add(double n1,double n2){
            double result = n1+n2;
            return result;
      }
}

public class methodoverloading {
      public static void main(String[] args) {
            calc obj = new calc();
            int result = obj.add(2, 4);
            int res1 = obj.add(3,4,5);
            double res2 = obj.add(4.5, 6.5);
            System.out.println(res2);
            System.out.println(res1);
            System.out.println(result);
      }
      
}
