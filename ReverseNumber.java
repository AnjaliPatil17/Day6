package day6;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int input=sc.nextInt();
        int remainder=0 ,reverse=0;
        while(input !=0){
            remainder=input%10;
            reverse=(reverse*10)+remainder;
            input=input/10;
        }
        System.out.println(reverse);
    }
}
