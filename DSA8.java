/*Ques : If cost price and selling price of an item is
input through the keyboard, write a program to
determine whether the seller has made profit or
incurred loss. Also determine how much profit he
made or loss he incurred  sp-cp = profit.*/ 
import java.util.Scanner;
public class DSA8{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter cost price : ");
    int cp = sc.nextInt();
    System.out.println("Enter selling price: ");
    int sp = sc.nextInt();
     if (sp>cp){//profit
        System.out.println("your  profit is ");
        System.out.println(sp-cp);
     }
     if(cp>sp){//loss
        System.out.println(" you have loss :");
        System.out.println(cp-sp);
     }

    }
}