
import java.util.Scanner;
public class CheckPrime{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int isPrime=1;
    if(n<=1){
        isPrime=0;
    }
    else{
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=0;
            }
        }
    }
    if(isPrime==1){
        System.out.println("Prime");
    }
    else{
        System.out.println("Not Prime");
    }
}
}