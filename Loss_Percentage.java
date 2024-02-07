import java.util.*;
public class Loss{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            int CP=sc.nextInt();
            int SP=sc.nextInt();
            float loss=CP-SP;
            double lop=(loss*100)/CP;
            System.out.printf("%.2f",lop);
        }
}