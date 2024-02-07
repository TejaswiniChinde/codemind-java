import java.util.*;
public class Profit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            int CP=sc.nextInt();
            int SP=sc.nextInt();
            float pro=SP-CP;
            double pp=(pro/CP)*100;
            System.out.printf("%.2f",pp);
        }
}