import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int X=0, c=0;
        try (Scanner sc = new Scanner(System.in)) {
            X=sc.nextInt();
        }       
        for(int i=1; i<=X;i++){
            if(X%i==0){
                c=c+1;
            }
        }
        if(c==2){
            System.out.println(X+" eh primo ");
        }else{
            System.out.println(X+" não eh primo ");
        }
    } 
    
}
    
