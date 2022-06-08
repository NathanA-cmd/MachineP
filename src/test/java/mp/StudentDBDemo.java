package mp;

import java.util.Scanner;

public class StudentDBDemo {

	// Main driver method
    public static void main(String[] args){
    	 Scanner sc= new Scanner(System.in);
    	 int choice = 0;
    	 StudentList listofStudents = new StudentList();
    	 System.out.println("Welcome to XY School Student Database");
    	 String isContinue="yes";
    	 
    	 do {
    		 System.out.println("----------------------------------");
    		 System.out.println("Please choose from the menu");
    		 System.out.println("1. View All Entries ");
    		 System.out.println("2. Add an entry ");
    		 System.out.println("3. Delete an Entry ");
    		 System.out.println("4. Edit an Entry ");
    		 System.out.println("5. Search");
    		 System.out.println("6. Exit ");
    		 System.out.println("----------------------------------");
    		 choice= sc.nextInt();

    			 switch(choice) {
        		 case 1:
        			 listofStudents.showListOfStudents();
        			 break;
        		 case 2:
        			 Scanner scanner= new Scanner(System.in);
        			 String newStudentName, newStudentAddress;
        			 int newSAISID, newStudentNumber;
        			 System.out.println("Enter new Student data");
        			 
        			 System.out.print("Enter the name:");
        			 newStudentName = scanner.nextLine();
        			 
        			 System.out.print("Enter SAISID:");
        			 newSAISID= scanner.nextInt();
        			 
        			 System.out.print("Enter Student Number:");
        			 newStudentNumber= scanner.nextInt();
        			 
        			System.out.print("Enter Student Address:");
        			newStudentAddress= scanner.next();
        			 StudentData newStudent = new StudentData(newStudentName, newSAISID, newStudentNumber, newStudentAddress);
        			 listofStudents.addNewStudent(newStudent);
        			 System.out.println("-----------------------");
        			 System.out.println("Added Successfully!!");
        			 System.out.println("-----------------------");
        			 break;
        		 case 3:
        			 break;
        		 case 4:
        			 break;
        		 case 5:
        			 break;
        		 case 6:
        			 System.out.println("Exiting.....");
        			 break;
        		default:
        			
        			break;
        		 }
    			 System.out.println("Do you want to continue y/n?"); 
    			 isContinue= sc.next();
    			 
    	 }while(isContinue.equals("y") || isContinue.equals("Y"));
    	 System.out.println("Thank you for using the program!");
    	 sc.close();
	
    }
}
	
