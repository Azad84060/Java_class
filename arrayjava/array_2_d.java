package arrayjava;

public class array_2_d
 {
      public static void main(String[] args) {
            // when we do not have value
            // int nums[][]=new int [3][2];
            // nums[0][0]=6;
            // nums[0][1]=5;
            // nums[1][0]=4;
            // nums[1][1]=3;
            // nums[2][0]=2;
            // nums[2][1]=7;
            
            // when value is given
            // int nums[][]={

            //             {1,2},
            //             {3,4},
            //             {5,6}

            // };

            // for(int i=0; i<=2; i++){
            //       for(int j=0; j<=1; j++){
            //             System.out.print(nums[i][j] + " ");
            //       }
            //       System.out.println();
            // }

            // for jagged type array

            int nums[][]={

                  {1,2,3,4},
                  {5,6},
                  {7,8,9}
            };
            for(int i=0; i<=2; i++){
                  for(int j=0; j<nums[i].length; j++){
                        System.out.print(nums[i][j] + " ");
                  }
                  System.out.println();
            }
      }
}
