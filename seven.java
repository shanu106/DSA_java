import java.util.*;

public class seven {

    public static void main(String[] args) {
        int n = 29;
 
for(int i =0; i<n/2+1;i++){
    for(int j=0;j<n;j++){
        if(j<n/2-i || j>n-i-1 || j>n/2-i && j<n-i-1 && i>0 && i<n/2){
            System.out.print("  ");
        } else {
            System.out.print("* ");
        }
    }
    System.out.println();
}

// for(int i =0; i<n/2+1;i++){
//     for(int j=0;j<n;j++){
//         if(j<n/2-i || j>n-i-1){
//             System.out.print(" ");
//         } else {
//             System.out.print("* ");
//         }
//     }
//     System.out.println();
// }







// for(int i=0;i<=n/2;i++){
//     for(int j=0;j<n;j++){
//         if(j<=i || j>=n-i-1){
//             System.out.print("*");
//         } else {
//             System.out.print(" ");
//         } 
//     }
//     System.out.println();
// }
// for(int i=n/2-1;i>0;i--){
//     for(int j=0;j<n;j++){
       
//         if(i<=0 || j>=n-i || j<i){
//             System.out.print("*");
//         } else {
//             System.out.print(" ");
//         } 
//     }
//     System.out.println();
// }








// for(int i=0;i<=n/2;i++){
//     for(int j=0;j<n;j++){
//         // if(j<n/2-i && j>n/2-i|| j>n/2+i+1 && j<n/2+i+1){
//         if(j<n/2-i || j>n/2+i || j>n/2-i && j<n/2+i){
//             System.out.print(" ");
//         } else {
//             System.out.print("*");
//         }
//     }
//     System.out.println();
// }
// for(int i=0;i<=n/2;i++){
//     for(int j=0;j<n;j++){
//         if(j<=i || j>i+1 && j<n-i-2 || j>n-i-2){
//             System.out.print(" ");

//          } else {
//             System.out.print("*");
//          }
//     }
//     System.out.println();
// }
// for(int i=0;i<=n/2;i++){
//     for(int j=0;j<n;j++){
//         if(j<n/2-i || j>=n/2+i+1 ){
//             System.out.print(" ");
//         } else {
//             System.out.print("*");
//         }
//     }
//     System.out.println();
// }
// for(int i=0;i<=n/2;i++){
//     for(int j=0;j<n;j++){
//         if(j<=i || j>n-i-2){
//             System.out.print(" ");

//          } else {
//             System.out.print("*");
//          }
//     }
//     System.out.println();
// }
// for(int i=n/2+1;i<n;i++){
//     for(int j=0;j<=n;j++){
//         if(j<n-i-1 || j>i){
//             System.out.print(" ");
//         } else {
//             System.out.print("*");
//         }
//     }
//     System.out.println();
// }
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if(j==i || j==n-i-1){
    //                 System.out.print("*");
    //         } else {
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(j>0 && j<n-1 && i>0 && i<n-1){
        //             System.out.print("  ");
        //         } else {
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }
// int d = 1;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print(d+ " ");
//                 d++;
//             }
//             System.out.println();
//         }
    }
}