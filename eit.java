import java.util.*;

public class eit{
    public static int factorial(int a){
        int f = 1;
        for(int i =1;i<=a;i++){
            f = f*i;
        }
        return f;
    //    int temp = a;
    //    a = b;
    //    b =temp;
    //    System.out.println("a is : "+ a);
    //    System.out.println("b is : "+ b);
    }
    // public static int binom (int n, int r){
    //     int nf = factorial(n);
    //     int rf = factorial(r);
    //     int rmf =  factorial(n-r);
    //     int result = nf/(rf*rmf);
    //     return result;
    // }
    public static boolean isPrime(int a){
        if(a==2) return true;
        for(int i=2;i<=a/2;i++){
            if(a%i==0) return false;

        }
        return true;
    }
    public static void primeInRange(int n){
        System.out.println("Prime Numbers from 1 to " + n + " : ");
        for(int i=2;i<n;i++){
           if(isPrime((i))) System.out.println(i);
        }
    }
    public static void binToDec(int binNum){

        int num = binNum;
        int pow = 0;
        int dec = 0;
        while(num>0){
            int rem = num%10;
            num/=10;
            dec = dec + rem * (int)Math.pow(2,pow);
            pow++;
        }
        System.out.println("Decimal of " + binNum + " : " + dec);
    }
   public static void decTobin(int decNum){
    int num = decNum;
    int bin =0;
    int place = 1;
    while(num > 0){
        int rem = num%2;
        bin = bin+rem*place;
        num/=2;
        place*=10;
    }
    System.out.println("binary of " + decNum + "is : " + bin);
   }
   public static int Avg(int a, int b , int c){
    return (a+b+c)/3;
   }
public static boolean isEven(int n){
    if(n%2==0) return true;
    return false;
}   
public static boolean isPalindrome(int n){
    int newN = 0;
    int a = n;
    int num = n;
    int count = 0;
    while (a>0) {
        a/=10;
        count++;
        
    }
    int pow = count-1;
    while(n>0){
        int rem = n%10;
newN = newN+ rem*((int)Math.pow(10, pow));
n/=10;
pow--;
    }
    if(num == newN) return true;
    return false;

} 
public static int sumOfDigit(int n){
    int sum = 0;
    while(n > 0){
        sum = sum + n%10;
        n/=10;
    }
    return sum;
}
public static void main(String[] args){

    // System.out.println(sumOfDigit(12345));
    // System.out.print(Math.max(99, 55));
    // System.out.print(Math.min(99, 55));
    // System.out.println(Math.sqrt(81));
    // System.out.println(Math.avg(12,14,12,23));
// System.out.println(Math.abs(-12));
System.out.println((int)(Math.random()*3));
// System.out.print(Avg(12, 9, 6));
// System.out.println(isEven(99));
// if(isPalindrome(1221)){
//     System.out.println("palindrome");
// } else {
//     System.out.println("not palindrome");
// }

        // binToDec(a);
        // int n = 12;
        // int r = 4;
        // if(!isPrime((n))){
        //     System.out.println(n + "is a not prime number");
        // } else {
        //     System.out.println(n + "is a prime number");

        // }
        
        // primeInRange(99);
        // System.out.println(isPrime(n));
        // System.out.println(binom(n,r));
       
    //   System.out.println(factorial(a));
    //   System.out.println("a is : " + a);
    //   System.out.println("b is : " + b);
        // Scanner sc = new Scanner(System.in);1
        // int a = sc.nextInt();
        //  for(int i=0;i<a;i++){
        //     for(int j=0;j<a*2;j++){
        //         if(j==a-i-1 || j==a){
        //             System.out.print(" ");
        //         } else {
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        //  }
    }
}