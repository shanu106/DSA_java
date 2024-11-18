import java.lang.reflect.Array;
import java.util.*;
public class day4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        
System.out.println("Enter count : ");
int n = sc.nextInt();
int rev =0;
int rem = 0;
for(int i = 0; n!=0;i++){
rem = n%10;
n/=10;
rev = (rev*10)+ rem;
}
System.out.println("reverse of given number is : "+  rev);








// int a;
// int even=0;
// int odd=0;

// for(int i=0;i<n;i++){
//     a = sc.nextInt();
// if(a%2==0)
// even += a;
// else odd += a;

// }
// System.out.println("sum of even numbers is : " + even);
// System.out.println("sum of odd numbers is : " +odd);

// get factorial of given number
// int fact = 1;
// for(int i = 1 ; i<=n; i++){
//     fact *= i;
// }
// System.out.println("factorial is " + fact);

// multiplication table of n numbers

// for(int i =1; i<=10; i++){
//     System.out.println(i + " X " +n + " = " + i*n );
// }
      







        
    }


}