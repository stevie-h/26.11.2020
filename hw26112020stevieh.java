/* HW instructions

1. Create a String variable called "id" with your id
2. Create a String variable called "full_name" with your full name
3. Create a String variable called "address" with your address
4. create a String variable called "details" with id + full_name + address + details 
5. print details to string
6. add spaces between id and full_name and address and details ...
7. *etgar: 
   create String fname variable and read from the keyboard the first name of the user
   create String lname variable and read from the keyboard the last name of the user
   then print the user first name and last name in one line...
   
 */
   
package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       String id = "987654321";
       String full_name = "Stevie H";
       String address = "111 Tagore St, Tel Aviv";
       String details = "Details: " + id + "   " + full_name + "   " + address;
       System.out.println(details);
      
       java.util.Scanner pr = new Scanner(System.in);
       System.out.print("Please enter your first name: ");
       String fname = pr.nextLine();
       System.out.print("Please enter your last name: ");
       String lname = pr.nextLine();
       System.out.println("Your full name is " + fname + " " + lname); 
       
    }
}
