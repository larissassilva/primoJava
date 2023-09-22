import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    /*public static void main(String[] args) throws IOException {
        int A=0, B=0, C=0, area=0;
        area=A*B;
        C=(area/100)*20;
        System.out.println(A+" não eh primo ");
    } */
    public static void main(String[] args) throws IOException {
        int X=0, c=0, N=0;
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
                   
        for(int j=0;j<N;j++){
           c=0;
            X=sc.nextInt();
                   
            for(int i=1; i<=X;i++){
                if(X%i==0){
                    c=c+1;
                }
            }
            if(c==2){
                System.out.println(X+" eh primo");
            }else{
                System.out.println(X+" nao eh primo");
            }
        } 
    }
    
}
  
