import java.util.*;

public class ten{

public static void pyramnum(int n){
    
    for(int i=0;i<n;i++){
        int num = 1;
        for(int j=0;j<n*2-1;j++){
            if(j<n-i-1 || j>n+i-1){
                System.out.print(" ");
            } else {
                System.out.print(num);
             if(j<n-1) num++;
        else num--;
          }

        }
        System.out.println();
    }

}
public static void pyrup(int n){
    
    for(int i=0;i<n;i++){
        int num = n-1;
        for(int j=0;j<n*2-1;j++){
            if( j<i || j> n*2-i-2)
            System.out.print(" ");
            else {
               
                    
                if(j<n) 
                System.out.print(j+1);
                else {
                    
                    System.out.print(num);
                        num--;
                    }
                
            }
        }
        System.out.println();
    }
}
    public static void main(String[] args){
pyramnum(9);
    }
}