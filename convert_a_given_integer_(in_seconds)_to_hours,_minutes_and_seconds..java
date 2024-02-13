import java.util.*;
public class Sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s = sc.nextInt();
        int h = s/3600;
        int rs = s%3600;
        int m = rs/60;
        int rsf = rs%60;
        System.out.printf("H:M:S-%d:%d:%d",h,m,rsf);
        }
    
}