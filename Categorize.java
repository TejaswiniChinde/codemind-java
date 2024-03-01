import java.util.*;
public class Sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float Height=sc.nextFloat();
        if(Height<150){
            System.out.println("Person is Dwarf.");
        }
        else if(Height>150 && Height<=165){
            System.out.println("Person is average heighted.");
        }
        else if(Height>165 && Height<=195){
            System.out.println("Person is taller.");
        }
        else{
            System.out.println("Abnormal height.");
        }
    }
}