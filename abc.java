import java.util.*;

public class  abc{

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

 // *****
 // ****  
 // ***
//  **
 // * 

    //     for(int i=0;i<n;i++){
    //  for(int j=0;j<n-i;j++){                                
    //                                                         
    //        System.err.print("*");                           
    //     }                                                    
    //   System.out.print("\n");                               
    //     }

    // *
    // **
    // ***
    // ****
    // *****
   
    // for(int i=0; i<=n; i++){
    //     for(int j=0;j<i;j++){                               
    //         System.out.print("*");         
    //     }
    //     System.out.println();
    // }



    //     *
    //    **
    //   ***
    //  ****
    // *****

// for(int  i=1; i<=n; i++){
//     for(int j=0;j<n;j++){
//         if(j>n-i-1){
//             System.out.print("*");
//         } else 
//         System.out.print(" ");
//     }
//     System.out.println();
// }


 // *****
 //  ****  
 //   ***
//     **
 //     *

// for(int i=0;i<=n;i++){
//     for(int j=0;j<n;j++){
//         if(j>i-1){
//             System.out.print("*");
//         } else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }

 //     **           
//     ****
//    ****** 
//   ********
//  **********
 //  ********  
 //   ******
//     ****
 //     **
// for(int i=0;i<n;i++){
//     for(int k=1;k<=n;k++){
//         if(k>n-i){
//             System.out.print("*");
//         } else{
//             System.out.print(" ");
//         }
//     }
//     for(int j=0;j<i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// for(int i=0;i<n;i++){
//     for(int k=0;k<n;k++){
//       if(k<i){
//         System.out.print(" ");
//       } else {
//         System.out.print("*");
//       }
//     }
//     for(int j=0;j<n-i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }


// fibonacci number


// int first = 0, second =1;
// int third=0;
// for(int i=2; i<n;i++){
//     third =  first + second;
//     first =  second;
//     second = third;


// }
// System.out.println(third);



// arm strong number 
// int get = n;
// // armstrong check 
// int arm =0;
// for(int i=0;i<3;i++){
// int rem = n%10;
// n/=10;
// arm += rem*rem*rem;
// }
// if(arm ==get){
//     System.out.println(get + "is  an armstrong number");

// } else {
//     System.out.println(get + "is not a armstrong number");
// }

}
}