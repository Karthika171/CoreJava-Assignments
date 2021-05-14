package test;

import java.util.Scanner;

public class CUI {


	public static void main(String[] args) {
        int count = 0;
        String username, password;
        while(count < 3)
        {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter username:");
        username = s.nextLine();
        
        System.out.print("Enter password:");
        password = s.nextLine();
        if(username.equals("user") && password.equals("user"))
        {
            System.out.println("welcome : " +username);
            break;
        }
        else
        {
            System.out.println("Authentication Failed");

        } 
        count++;
        
        }
    }}
