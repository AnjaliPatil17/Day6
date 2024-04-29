package day6;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int input=sc.nextInt();
        int sum=0;
        for(int i=1;i<input;i++){
            if(input % i==0){
                sum=sum+i;
            }
        }
        if(input == sum){
            System.out.print(input+" is a perfect number.");
        }else{
            System.out.print(input+" is not perfect number.");
        }sc.close();
    }
}
