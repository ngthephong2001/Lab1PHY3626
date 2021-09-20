/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1PHY3626;
/**
 *
 * @author Nguyen The Phong
 */
public class Exercise1 {
    public static void main(String[] args) {
           String str1 = "Hello World";
           String str2 = " I am HUS student";
           String str3 = str1.concat(str2);// nối chuỗi bằng hàm concat
           System.out.println(str3);
           System.out.println(str1 + str2);// nối chuỗi bằng toán tử '+'
          
           // check max and min value double
           double maxDouble = Double.MAX_VALUE;
           double minDouble = Double.MIN_VALUE;
           System.out.println("Maximum value of Double: " + maxDouble);
           System.out.println("Minimum value of Double: " + minDouble);
           
           double myRadius = 2;
           double Area = Math.PI*myRadius*myRadius;
           System.out.println("Area = " + Area);
           
           String firstname = "Nguyen";
           String lastname = "Phong";
           int age = 20;
           System.out.println("Information: " + firstname + " " + lastname + " - " + age);
           
           // Tinh tong 0->100
//           int sum = 0;
//           for (int i = 0; i < 100; i++) {
//              sum += i;
//           }
//           System.out.println("Sum = " + sum);
//           
//           // Kiem tra SNT
//           int n;
//           Scanner s = new Scanner(System.in);
//           do {              
//                System.out.print("Nhap n: ");
//                n = s.nextInt();
//          } while (n <= 0);
//           boolean check = true;
//           for (int i = 2; i <= Math.sqrt(n); i++) {
//               if (n % i == 0) {
//                   check = false;
//                   break;
//               }
//           }
//           if (check) {
//               System.out.println(n + " la SNT!");
//           }else{
//               System.out.println(n + " khong la SNT!");
//           }
    }
}
