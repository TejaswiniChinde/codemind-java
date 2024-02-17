import java.util.*;
public class sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int totalDays = sc.nextInt();
        int weeks = (totalDays%365)/7;
        int years = totalDays/365;
       
        System.out.println(years);
        System.out.println(weeks);
        
    
    }
}