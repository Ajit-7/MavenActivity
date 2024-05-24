package com.accenture.mavenactivity;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    			Set<String> h = new HashSet<>();
        		Scanner sc = new Scanner(System.in);
        		int choice = 0;
        		System.out.println("Enter your Choice:");
        		System.out.println("Enter 1 to Add");
        		System.out.println("Enter 2 to Remove");
        		System.out.println("Enter 3 to Check Player");
        		System.out.println("Enter 4 to Display");
        		System.out.println("Enter 0 to Exit");
        		do {
        			choice = sc.nextInt();

        			switch (choice) {
        			case 0: System.exit(0);
        			case 1:
        				System.out.println("Enter Player Name");
        				String playerName = sc.next();
        				h.add(playerName);
        				System.out.println("Enter Player ID");
        				String palyerID = sc.next();
        				h.add(palyerID);
        				break;
        			case 2:
        				System.out.println("Enter the value to remove");
        				String remove = sc.next();
        				h.remove(remove);
        				break;
        			case 3:
        				System.out.println("Enter Player Name to check");
        				String  playerCheck = sc.next();
        				if(h.contains(playerCheck)) {
        					System.out.println("Player is present in the set");
        				}else {
        					System.out.println("Player is not present in the set");
        				}
        				break;
        			case 4:
        				System.out.println(h);
        				break;
        			default:
        				System.out.println("Invalid Choice");
        				break;
        			}

        		} while (choice != 0);
        	}

    }
