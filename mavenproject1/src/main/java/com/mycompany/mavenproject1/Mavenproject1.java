package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        int i = 0;
        while (i <= 0) {
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.println("5) Quit Program");
        System.out.println("Please select an option:");
        Scanner choice1 = new Scanner(System.in);
        int choice = choice1.nextInt();
        switch(choice)
        {
            case 1:
            Scanner firstAdd = new Scanner(System.in);
            System.out.println("Enter First Number: ");
            int answer1 = firstAdd.nextInt();
            Scanner secondAdd = new Scanner(System.in);
            System.out.println("Enter Second Number: ");
            int answer2 = secondAdd.nextInt();
            int addResult = answer1 + answer2;
            System.out.println(answer1 + " + " + answer2 + " = " + addResult);
            break;
            
            case 2:
            Scanner firstSubtract = new Scanner(System.in);
            System.out.println("Enter First Number: ");
            int answer3 = firstSubtract.nextInt();
            Scanner secondSubtract = new Scanner(System.in);
            System.out.println("Enter Second Number: ");
            int answer4 = secondSubtract.nextInt();
            int subResult = answer3 - answer4;
            System.out.println(answer3 + " - " + answer4 + " = " + subResult); 
            break;
            
            case 3:
            Scanner firstMultiply = new Scanner(System.in);
            System.out.println("Enter First Number: ");
            int answer5 = firstMultiply.nextInt();
            Scanner secondMultiply = new Scanner(System.in);
            System.out.println("Enter Second Number: ");
            int answer6 = secondMultiply.nextInt();
            int multiResult = answer5 * answer6;
            System.out.println(answer5 + " x " + answer6 + " = " + multiResult);
            break;
            
            case 4:
            Scanner firstDiv = new Scanner(System.in);
            System.out.println("Enter First Number: ");
            int answer7 = firstDiv.nextInt();
            Scanner secondDiv = new Scanner(System.in);
            System.out.println("Enter Second Number: ");
            int answer8 = secondDiv.nextInt();
            float divResult = answer7 / answer8;
            System.out.println(answer7 + " / " + answer8 + " = " + divResult);
            break;
            
            case 5:
                System.out.println("Exiting Program...");
                i++;
                break;
                
            default:
                System.out.println("Please Enter a valid option.");
          
            }     
        }                      
    }
}
