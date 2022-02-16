import java.util.Scanner;
public class Ladder_If_Else1
{
    public static void main(String[] args) {
        int noOfCalls;
        double bill;
        Scanner obj = new Scanner(System.in);
        noOfCalls = obj.nextInt();
        if(noOfCalls<=100)
        bill=noOfCalls*.30;
        else if(noOfCalls>100&&noOfCalls<=300)
        bill=30+(noOfCalls-100)*.6;
        else 
        bill = 150+(noOfCalls-300)*1.2;
        System.out.println(bill);    
    }
}