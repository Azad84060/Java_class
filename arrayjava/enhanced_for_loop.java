package arrayjava;

public class enhanced_for_loop {
      public static void main(String[] args) {
            // 1-d array
            // int nums[]={1,2,3,4,5};
            // for(int n :nums){
            //       System.out.println(n);
            // }

            // for jagged array

            int nums[][]={
                  {1,2,3,4},
                  {4,5,6},
                  {7,8,9,1}
            };
            for(int a[]:nums){
                  for(int b:a){
                        System.out.print(b + " ");
                  }
                  System.out.println();
            }
      }
}
