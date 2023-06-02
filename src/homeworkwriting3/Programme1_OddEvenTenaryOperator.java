package homeworkwriting3;

import java.util.Scanner;

/**
 * 1.Write a java programe that tells us that Input number is odd or even?
 * Hint:use ternary operator(? :)
 */
public class Programme1_OddEvenTenaryOperator {
    public static void main(String[] args) {
        //Scannaer declaration for reading input form console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number =scanner.nextInt();
        isItOddOrEvenNumber(number);
        //closing the scanner object
        scanner.close();
    }
    //Checing the number is even or odd
    public static void isItOddOrEvenNumber(int number){
        //ternary operator is used
        String evenOrodd=(number %2==0)?"Even" : "odd";
        System.out.println("The"+number+"is"+evenOrodd+"number");

    }
}
