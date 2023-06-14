package oprators;
public class conditional1 {
      public static void main(String[]args){
          int age =18;
          if(age>=18 && age <=60){
              if(age >20 && age <30){
                  System.out.println("you are in 30's ");
              }
              else if( age >30 && age <40){
                  System.out.println(" you are in 40's ");
              }
              else{
                  System.out.println("you are still a teen");
              }
          }
          else if(age >=18 && age <=60){
              System.out.println("you are an adult");
          }
          else if (age>60){
              System.out.println("you are an old man");
          }
          else{
              System.out.println("you are a kid");
          }
      }
  }
  