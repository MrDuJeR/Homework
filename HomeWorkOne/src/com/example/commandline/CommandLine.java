package com.example.commandline;

public class CommandLine {
	public static void main(String[] args) {
		int charcount = 0;
		if (args.length > 0) {
			System.out.print("String in Command Line: ");
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i] + " ");
				charcount += args[i].length();
			}
			System.out.println("\nThe Number of Character in the command line String is: " + charcount);
		}
		else {
			System.out.println("No Command Line Arguments!");
		}
		
	}
}
