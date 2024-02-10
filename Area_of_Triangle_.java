import java.util.*;
public class Sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float A=sc.nextInt();
        float B=sc.nextInt();
        float C=sc.nextInt();
        
        float s=(A+B+C)/2;
        double area=Math.sqrt(s*(s-A)*(s-B)*(s-C));
        System.out.printf("%.2f",area);
    }
}