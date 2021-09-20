/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1PHY3626;

public class MyFirstApp {
       public static void main(String[] args) {
           /*
           System.out.println("Hello K65 Physics - HUS!");
           System.out.println("This is my first app with Netbeans 12.4");
           int myInteger = 2001;
           System.out.println("My Integer: " + myInteger);

           int maxInteger = Integer.MAX_VALUE;
           int minInteger = Integer.MIN_VALUE;
           System.out.println("Maximum value of Integer: " + maxInteger);
           System.out.println("Minimum value of Integer: " + minInteger);
           
           float maxFloat = Float.MAX_VALUE;
           float minFloat = Float.MIN_VALUE;
           System.out.println("Maximum value of Float: " + maxFloat);
           System.out.println("Minimum value of Float: " + minFloat);
           
           float myFloat = 2.5f;
           System.out.println(myFloat);
           double myDouble = 2.5d;
           System.out.println(myDouble);
           
           char myChar = 'D';
           System.out.println(myChar);
           
           // check max and min value double
          
           
           
           String str1 = "Hello World";
           String str2 = " I am HUS student";
           String str3 = str1.concat(str2);
           System.out.println(str3);
           System.out.println(str3.length());
           System.out.println((str1 + str2).toUpperCase());
           System.out.println((str1 + str2).toLowerCase());
           
           // using math
           System.out.println(Math.sqrt(64));
           System.out.println(Math.log(64));
           System.out.println(Math.pow(5, 2));
           System.out.println(Math.random());
           
           int x = 20;
           int y = 21;
           System.out.println(x > y);
           
           x = 30;
           y = 21;
           if (x < y) {
               System.out.println("x less than y");
           }else {
               System.out.println("x greater than y");
           }
           int age = 15;
           String canDrink = (age > 20) ? "Yes" : "No";
           System.out.println("Can drink: " + canDrink);
           
           
           int day = 6;           
           switch(day){
               case 1:
                   System.out.println("Monday");
                   break;
                   
               case 2:
                   System.out.println("Tuesday");
                   break;
                   
               case 3:
                   System.out.println("Wednesday");
                   break;
                   
               case 4:
                   System.out.println("Thirstday");
                   break;
                   
               case 5:
                   System.out.println("Friday");
                   break;
                   
               case 6:
                   System.out.println("Saturday");
                   break;
                default:
                   System.out.println("Sunday");
                   break;
           }
           */
           // Loop
           // While loop
           int i = 0;
        while (i < 6) {
            System.out.println("HUS-VNU");
            i++;
        }

        // For loop
        for (int j = 0; j < 6; j++) {
            System.out.println("Nguyen The Phong");
        }

        // do while
        int k = 0;
        int sum = 0;
        do {
            sum += k;
            k++;
        } while (k <= 10);
        System.out.println("Sum = " + sum);

        // break, continue
        int a = 1;
        while (a < 10) {
            System.out.print(a + " ");
            a++;
            if (a == 5) {
                break;
            }
        }
        System.out.println();
        for (int b = 0; b < 10; b++) {
            if (b % 2 == 0) {
                continue;
            }
            System.out.print(b + " ");
        }
    }
}
