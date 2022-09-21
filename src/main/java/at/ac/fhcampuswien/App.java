package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        String robot = "         __\n" +
                " _(\\    |@@|\n" +
                "(__/\\__ \\--/ __\n" +
                "   \\___|----|  |   __\n" +
                "       \\ }{ /\\ )_ / _\\\n" +
                "       /\\__/\\ \\__O (__\n" +
                "      (--/\\--)    \\__/\n" +
                "      _)(  )(_\n" +
                "     `---''---`";
        System.out.println("0123456789012345678901");
        System.out.println(robot);
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        // ’Z’, 0xface, 012, 80L, 44e-1f, 5.5f, 8.88e1, 99.9
        char z = 'Z';
        int hex = 0xface;
        int oct = 012;
        long l = 80L;
        float f = 44e-1f;
        float f2 = 5.5f;
        double d1 = 8.88e1;
        double d2 = 99.9;
        int sum = z + hex + oct + (int) l + (int)f + (int)f2 + (int)d1 + (int)d2;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(x+y);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        int x;
        int y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        x = scan.nextInt();
        System.out.print("y: ");
        y = scan.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        int x, y;
        Scanner scan = new Scanner(System.in);
        System.out.print("n1: ");
        x = scan.nextInt();
        System.out.print("n2: ");
        y = scan.nextInt();
        if (x>y) {
            System.out.println("n1 > n2");
        }
        else if (x==y) {
            System.out.println("n1 == n2");
        }
        else {
            System.out.println("n2 > n1");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        int annualRevenue;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        annualRevenue = scan.nextInt();
        if ((annualRevenue < 0) || (annualRevenue >= 100000)) {
            System.out.println("Invalid Revenue");
        }
        else {
            if (annualRevenue < 20000){
                System.out.println("Poor Sales Revenue");
            }
            if ((annualRevenue >= 20000) && (annualRevenue < 50000)){
                System.out.println("Average Sales Revenue");
            }
            if ((annualRevenue >= 50000) && (annualRevenue < 80000)){
                System.out.println("Good Sales Revenue");
            }
            if (annualRevenue >= 80000) {
                System.out.println("Excellent Sales Revenue");
            }
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        double commissionRate;
        int commissionClass;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        commissionClass = scan.nextInt();

        switch (commissionClass) {
            case 1:
                commissionRate = 0.01;
                break;
            case 2:
                commissionRate = 0.02;
                break;
            case 3:
                commissionRate = 0.03;
                break;
            case 4:
                commissionRate = 0.04;
                break;
            default:
                commissionRate = 0;
                break;
        }
        System.out.println("Your Commission Rate was set to " + commissionRate);
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scan.nextInt();
        if(((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 ==0)){
            System.out.println("Leapyear");
        }
        else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        int input, a, b, c, result;
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        input = scan.nextInt();

        a = input / 100;
        b = (input % 100) / 10;
        c = input % 10;

        result = c * 100 + b * 10 + a;
        System.out.println(result);
    }



    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}
