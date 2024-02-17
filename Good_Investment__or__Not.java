import java.util.*;
public class Sol{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if(X >= 2*Y){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}