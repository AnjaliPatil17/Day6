package day6;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input= sc.nextInt();
        if(input>=1){
            int num1=0;
            int num2=1;
            int temp=0;
            for(int i=0;i<=input;i++){
                temp=num1+num2;
                System.out.println(num1);
                num1=num2;
                num2=temp;
            }
        }else {
            System.out.println("Invalid input.");
        }sc.close();
    }
}
