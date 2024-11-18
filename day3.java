import java.util.*;

// public class day3{
//      public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     int n =  sc.nextInt();

//     if(n<0){
//         System.out.println(n  + "  is a negative  number");

//     } else {
//         System.out.println(n +"  is a postive number");
//     }

//     }
// }

// public class day3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("please enter a number to get the specific day : ");
//         int day = sc.nextInt();

//         switch (day) {
//             case 1:
//                 System.out.println("ohh you mean to say monday !");

//                 break;
//             case 2:
//                 System.out.println("Okk you saying for Tuesday");

//                 break;
//             case 3:
//                 System.out.println("you enterd  for wednesday");

//                 break;
//             case 4:
//                 System.out.println("you entered 4 it means it is  thursday");

//                 break;
//             case 5:
//                 System.out.println("your input says for  friday");

//                 break;
//             case 6:
//                 System.out.println("This is saturday");

//                 break;
//             case 7:
//                 System.out.println("ohh weeakend  is here it is sunday");

//                 break;

//             default:
//                 System.out.println("this is wrong please write  number between 1 to 7");
//             break;
//         }

        // double temp = sc.nextDouble();

        // if(temp > 100 && temp < 105){
        // System.out.println("you have a fever you need to visit doctor first");

        // } else if( temp > 105){
        // System.out.println("ohh ! you have a strong fever leave all works and go
        // first to the doctor .");
        // } else {
        // System.out.println("You are all set you can continue your daily routine");

        // }
//     }

// }


public class day3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year =  sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("this year is a leap year");
                    } else {
                        System.out.println("this year is not a leap year");
                        }
                        } else {
                            System.out.println("this year is a leap year");
                            }
                            } else {
                                System.out.println("this year is not a leap year");
                                }

    }
}