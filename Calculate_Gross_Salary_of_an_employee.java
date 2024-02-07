import java.util.*;
public class Sol{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        float salary=sc.nextFloat();
        float HRA=sc.nextFloat();
        float DA=sc.nextFloat();
        double PF=salary*0.12;
        double GS=salary+HRA+DA+PF;
        System.out.printf("%.2f
%.2f",PF,GS);
    }
}