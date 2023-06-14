package oprators;
public class conditional {
      public static void main(String[] args){
          //int age = 17;
          //if( age ==18){
         //     System.out.println( "you are an adult");
          //}
         // else{
          //    System.out.println(" you are a kid");
          //}
          int age = 19;
          if(age<=17){
              System.out.println("you are a kid");
          }
          else if(age>=60 || age>=18){
              System.out.println("you are an adult");
          }
          else{
              System.out.println("you are an old");
          }
      }
  }