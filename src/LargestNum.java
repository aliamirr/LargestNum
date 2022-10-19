import java.util.Scanner;
public class LargestNum{
    public static void main(String args[]){
        Scanner lr = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = lr.nextInt();
        System.out.println("Enter second number: ");
        int num2 = lr.nextInt();
        if(num1 > num2){
            System.out.println("1st number is larger than 2nd number.");
        } else {
            System.out.println("2nd number is larger than 1st number.");
        }

        }


    }

