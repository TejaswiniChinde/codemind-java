import java.util.*;
public class Sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int t=X*4;
        if(t <= 1000){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}