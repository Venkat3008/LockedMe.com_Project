package mypackage;

import java.util.*;

public class Application {
	public static void main(String[] args) {
						// Details of Application and Developer name.
		System.out.println("*******************************************");
		System.out.println("LockedMe.com Application by Venkadathasan D\n");
		System.out.println("*******************************************\n");
		System.out.println("\nEnter the directory path like (D:\\Example\\)\n");
		
		Scanner sc = new Scanner(System.in);
		String mainDir = Methods.userDir();
		
		int opt;
		do {                    //Main menu
			System.out.println("\n***---------------Main Menu---------------***\n");
			System.out.println("1-->List files in the Directory");
			System.out.println("2-->Add or Delete or Search files");
			System.out.println("3-->Close Application\n");
			System.out.println("Enter your option");						
			opt = sc.nextInt();       //Receiving option from user.
						
			LoopA: if (opt == 1) {
				// method for listing files.
				Methods.displayFiles(mainDir);
				break LoopA;
			}
			LoopB: if (opt == 2) {          // Secondary menu inside Option-2.
				System.out.println("1-->Add new file");
				System.out.println("2-->Delete existing file");
				System.out.println("3-->Search file");
				System.out.println("4-->Return to Main menu\n");

				System.out.println("Enter the action to be performed");
				int actions;
				actions = sc.nextInt();      //Receiving input from user.
				Loop1: if (actions == 1) {
					// method for adding file.
					Methods.addFile(mainDir);
					break Loop1;

				}
				Loop2: if (actions == 2) {
					// method for deleting file.
					Methods.deleteFile(mainDir);
					break Loop2;

				}
				Loop3: if (actions == 3) {
					// method for searching for a file.
					Methods.searchFile(mainDir);
					break Loop3;

				}
				Loop4: if (actions == 4) {
					break Loop4;     // Returned to Main menu.
				}
			}
			LoopC: if (opt == 3) {   //Closing Application.
				System.out.println("Thank you, Application closed successfully.");
				break;
			}
		} while (true);
	}
}
