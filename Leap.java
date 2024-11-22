import java.util.*;
public class Leap {
    public void leapyear(int n){
        if(n%400==0){
            System.out.println("this year is leapyear:");
        }
       else if(n%4==0 && n%100!=0){
            System.out.println("this year is leapyear:");
        }else{
            System.out.println("this year is not a leapyear");
    }
    }

    public static void main(String1[]a){
        Leap ob=new Leap();
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("enter year for check it is leapyear or not:");
        number=sc.nextInt();
        ob.leapyear(number);
    }
}
