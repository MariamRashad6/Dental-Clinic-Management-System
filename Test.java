
package dentalclinic;


import java.util.Scanner;


public class Test {

    
    public static void main(String[] args) {
     Clinic test = new Clinic();
     while(true){
        test.displayMainMenu();
        System.out.println("===========================================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Choice: ");
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                test.chooseFromAdminMenu();
                break;
                
            case 2:
                if(test.numberOfDoctors > 0){
                System.out.println("condition true");
                test.chooseFromDoctorMenu();
                }
                else{
                    System.out.println("Add doctors first");
                }
                
                break;
                
            case 3:
                test.chooseFromReceptionistMenu();
                break;
                
            case 4:
                System.out.println("case 4");
                
            case 5:
                System.out.println("End of the program");
                System.exit(0);
                break; 
                
            default:
                System.out.println("Invalid Input");
        
    
    
}
}
    }
}