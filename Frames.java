import java.util.*;
public class Sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int Z=sc.nextInt();
        int W=(2*X + 2*Y)*Z;
        System.out.print(W);
    }
}