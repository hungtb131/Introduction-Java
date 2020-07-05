import java.util.Scanner;

public class convertmoney {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter your money in USD :" );
        USD = sc.nextDouble();
        double convert = USD * 23000;
        System.out.print("Your money in VND" +convert);
        }
    }

