import java.util.*;
public class Sol{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        double vol=1.33*3.14*r*r;
        System.out.printf("%.2f",vol);
    }
}