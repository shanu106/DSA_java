import java.util.*;

public class six{
    public static void main(String[] args) {

        // int n = 9;

        // int ch = 1;

        // for(int i=0;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();

int n=20;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==n-1 || i==0){
                    System.out.print("*");
                
                } else{
                    System.out.print(" ");
                }
            } 
            System.out.println();
        }
        

    }
