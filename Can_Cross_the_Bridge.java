import java.util.*;
public class Sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int Z=sc.nextInt();
        int Aw=Z-Y;
        int Max=Aw/X;
        System.out.println(Max);
    }
    
}