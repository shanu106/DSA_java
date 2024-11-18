 import java.util.*;

public class nine {

public static void butterfly(int n){
    for(int i=0;i<n/2;i++){
        for(int j=0;j<n;j++){
            if(j>i && j<n-i-1 ){
                System.out.print(" ");
            } else { 
                System.out.print("*");
            }
        }
        System.out.println();
    }
    for(int i=0;i<n/2 ; i++){
        for(int j=0;j<n;j++){
if(j>n/2-i-1 && j<n/2+i ){
    System.out.print(" ");
} else {
    System.out.print("*");
}
        }
        System.out.println();
    }
}
   public static void ztoOne(int n){
    for(int i =0; i< n ;i++){
        for(int j=0;j<i;j++){
            if((j+i)%2 == 0 ){
            System.out.print(0 + " ");
        } else {
            System.out.print(1+ " ");
        }
    }
    System.out.println();
    }
   } 
    public static void floidP(int n){
        int a = 1;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(a+ " ");
                a++;
            }
            System.out.println();
        }
    }
public static void HalfN(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(n-i);
        }
        System.out.println();
    }
}
public static void HoloXpattern(int n){
    for(int i=0;i<n;i++){

for(int j=0;j<n;j++){
    if(j==0 || j==n-1 || j==i || j==n-i-1 || i==0 || i== n-1){
        System.out.print("*");
    } else {
        System.out.print(" ");
    }
}
System.out.println();
    }
}

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int  a = sc.nextInt();
butterfly(a);
    }
}
