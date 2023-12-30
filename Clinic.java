
package dentalclinic;

import java.util.ArrayList;
import java.util.Scanner;


public class Clinic implements Items {
    //arraylists
    private ArrayList<Appointments> appointments = new ArrayList<>();
    private ArrayList<Doctors> doctors = new ArrayList<>();
    private ArrayList<Receptionist> receptionists = new ArrayList<>();
    private ArrayList<Patients> patients = new ArrayList<>();
    private ArrayList<Nurses> nurses = new ArrayList<>();
    private ArrayList<String> medicalTools = new ArrayList<>();
    public static int  numberOfDoctors = 0;
    private static int  numberOfPatients = 0;
    private static int  numberOfAppointments = 0;
    private static int  numberOfNurses = 0;
    private static int  numberOfReceptionists = 0;
    Scanner scan = new Scanner(System.in);
    
    //Display methods for the user's menu
    public void displayMainMenu(){
        System.out.println("======Main Menu========");
        System.out.println("1.Admin");
        System.out.println("2.Doctor");
        System.out.println("3.Receptionist");
        System.out.println("4.Exist");
    }
    
    //Admin
    public void displayAdminMenu(){
        System.out.println("======Admin Menu========");
        System.out.println("1.Doctor Information");
        System.out.println("2.Patient Information");
        System.out.println("3.Nurse Information");
        System.out.println("4.Receptionist Information");
        System.out.println("5.Clinic Information");
        System.out.println("7.Main Menu");
        System.out.println("8.Exist");
        
    }
    
    //what an admin can access/do
    public void displayDoctorInformationMenu(){
        System.out.println("======Doctor Information========");
        System.out.println("1.Add Doctor");
        System.out.println("2.Update Doctor");
        System.out.println("3.Delete Doctor");
        System.out.println("4.Search Doctor");
        System.out.println("5.View Doctors");
        System.out.println("6.GO Back");
        System.out.println("7.Main Menu");
        System.out.println("8.Exist");     
    }
    
    public void displayPatientInformationMenu(){
        System.out.println("======Patient Information========");
        System.out.println("1.Add Patient");
        System.out.println("2.Update Patient");
        System.out.println("3.Delete Patient");
        System.out.println("4.Search Patient");
        System.out.println("5.View Patients");
        System.out.println("6.GO Back");
        System.out.println("7.Main Menu");
        System.out.println("8.Exist");     
    }
     public void displayNurseInformationMenu(){
        System.out.println("======Nurse Information========");
        System.out.println("1.Add Nurse");
        System.out.println("2.Update Nurse");
        System.out.println("3.Delete Nurse");
        System.out.println("4.Search Nurse");
        System.out.println("5.View Nurses");
        System.out.println("6.GO Back");
        System.out.println("7.Main Menu");
        System.out.println("8.Exist");     
    }
    
     public void displayReceptionistInformationMenu(){
        System.out.println("=======Receptionist Information========");
        System.out.println("1.Add Receptionist");
        System.out.println("2.Update Receptionist");
        System.out.println("3.Delete Receptionist");
        System.out.println("4.Search Receptionist");
        System.out.println("5.View Receptionist");
        System.out.println("6.GO Back");
        System.out.println("7.Main Menu");
        System.out.println("8.Exist");     
    }
    
     //Doctor 
     public void displayDoctorMenu(){
        System.out.println("======Doctor Menu========");
        System.out.println("1.Check Schedule");
        System.out.println("2.Main Menu");
        System.out.println("3.Exist");
        
    }
    
     //Receptionist
    public void displayReceptionistMenu(){
        System.out.println("=======Menu========");
        System.out.println("1.Add Appointment");
        System.out.println("2.Cancel Appointments");
        System.out.println("3.Check schedule");
        System.out.println("4.Main Menu");
        System.out.println("5.Exist");
        
    }
    //Clinic
    public void displayClinicMenu(){
       System.out.println("==============Dental Clinic Menu==============");
       System.out.println("1.Check clinic schedule");
       System.out.println("2.Check avaliable medical tools");
       System.out.println("3.Number of rooms");
       System.out.println("4.Check number of employees");
       System.out.println("5.MainMenu");
       System.out.println("6.exit");
       
    }
    public void chooseFromClinicMenu(){
        while(true){
                displayClinicMenu();
                int y = scan.nextInt();
                switch(y){
                    //displaying clinic schedule
                    case 1:
                        System.out.println("========Schedule========");
                        doctors.forEach(Doctors ->{
                        System.out.println("Name: "+ Doctors.getFirstName() +" "+Doctors.getLastName()+ "\nID: "+Doctors.getID());
                        System.out.println("Working Hours: ");
                        System.out.println("From: "+ Doctors.getStartHour()+" : "+Doctors.getStartMinute());
                        System.out.println("To: "+ Doctors.getEndHour()+" : "+Doctors.getEndMinute());
                        });
                        System.out.println("===========================================");
                        break;
                    
                    case 2:
                        setMedicalTool();
                        medicalTools();
                        
                        break;
                    //displaying number of rooms
                    case 3:
                        System.out.println("Number of rooms: "+Items.NUMBEROfROOMS);
                        break;
                    //displaying number of employees
                    case 4:
                        System.out.println("Number of doctors: "+numberOfDoctors);
                        System.out.println("Number of nurses: "+numberOfNurses);
                        System.out.println("Number of receptionists: "+numberOfReceptionists);
                        break;
                    case 5:
                         mainMenu();
                    case 6:
                        System.out.println("End of program");
                        System.exit(0);
                    default:
                        System.out.println("Invalid Input");
                        break;
    }
        }
    }
    public void medicalTools(){
   
     while(true){
                System.out.println("1.Add tool");
                System.out.println("2.Display avaliable tools");
                System.out.println("3.Go back");
                System.out.println("4.Main Menu");
                System.out.println("5.Exit");
                int y = scan.nextInt();
                switch(y){
                    //adding a tool
                    case 1:
                        addTool();
                        System.out.println("===========================================");
                        break;
                    //displaying all tools
                    case 2:
                        medicalTools.forEach((i)->System.out.println(i));
                        
                        break;
                    
                    //go back
                    case 3:
                        chooseFromClinicMenu();
                        break;
                    case 4:
                        mainMenu();
                        break;
                    case 5:
                        System.out.println("End program");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
    }
        }
    
}
    
    
    
    
    
    
    //Method to allow admin choose from different options to manipulate doctor's information
    public void doctorInformation(){
                while(true){
                displayDoctorInformationMenu();
                int y = scan.nextInt();
                switch(y){
                    //adding a new doctor
                    case 1:
                        System.out.println("Doctor's first name: ");
                        String firstName = scan.next();
                        System.out.println("Doctor's last name: ");
                        String lastName = scan.next();
                        Doctors d = new Doctors(firstName ,lastName);
                        System.out.println("Salary per hour: ");
                        double salaryPerHour = scan.nextDouble(); //int salaryPerHour = scan.nextInt();
                        d.setSalaryPerHour(salaryPerHour);
                        System.out.println("Doctor's working Hours: ");
                        double setWorkingHours = scan.nextDouble();
                        d.setWorkingHours(setWorkingHours);
                        System.out.println("From: ");
                        System.out.println("Hour: ");
                        d.setStartHour(scan.nextInt());
                        System.out.println("Minute: ");
                        d.setStartMinute(scan.nextInt());
                        doctors.add(d);
                        numberOfDoctors++;
                        System.out.println("===========================================");
                        break;
                    //updating an existing doctor's information
                    case 2:
                        if(numberOfDoctors>0){
                        boolean found=false;
                        System.out.println("Enter Doctors's first name: ");
                        String firstNameOfDoctor = scan.next();
                        System.out.println("Enter Doctor last name: ");
                        String lastNameOfDoctor = scan.next();
                        for(int i=0 ; i< doctors.size() ; i++){
                            if (doctors.get(i).getFirstName().equals(firstNameOfDoctor) && doctors.get(i).getLastName().equals(lastNameOfDoctor)){
                                System.out.println("Enter number working hours to be updated");
                                doctors.get(i).setWorkingHours(scan.nextInt());
                                System.out.println("From: ");
                                System.out.println("Hour: ");
                                doctors.get(i).setStartHour(scan.nextInt());
                                System.out.println("Minute: ");
                                doctors.get(i).setStartMinute(scan.nextInt());
                                System.out.println("Enter salary per hour to be updated");
                                doctors.get(i).setSalaryPerHour(scan.nextDouble());
                                found = true;
                            }
                        }
                        if(found == false){
                                System.out.println("Doctor not found");
                                }
                        }
                        else{
                            System.out.println("Please add doctors first");
                        }
                        System.out.println("===========================================");
                        break;
                    //deleting a doctor
                    case 3:
                        if(numberOfDoctors>0){
                        boolean found=false;
                        System.out.println("Enter Doctors's first name: ");
                        String firstNameOfDoctor = scan.next();
                        System.out.println("Enter Doctor last name: ");
                        String lastNameOfDoctor = scan.next();
                        for(int i=0 ; i< doctors.size() ; i++){
                            if (doctors.get(i).getFirstName().equals(firstNameOfDoctor) && doctors.get(i).getLastName().equals(lastNameOfDoctor)){
                                doctors.remove(i);
                                found = true;
                                numberOfDoctors--;
                            }
                        }
                        if(found == false){
                                System.out.println("Doctor not found");
                                }
                        }
                        else{
                            System.out.println("Please add doctors first");
                        }
                        System.out.println("===========================================");
                        break;
                    //searching for a doctor and displaying his/her information    
                    case 4:
                        if(numberOfDoctors>0){
                        boolean isFound=false;
                        System.out.println("Enter Doctors's first name: ");
                        String firstNameToSearch = scan.next();
                        System.out.println("Enter Doctors's last name: ");
                        String lastNameToSearch = scan.next();
                        for(int i=0 ; i< doctors.size() ; i++){
                            if (doctors.get(i).getFirstName().equals(firstNameToSearch) && doctors.get(i).getLastName().equals(lastNameToSearch)){
                               System.out.println("Name: "+ doctors.get(i).getFirstName()+" "+doctors.get(i).getLastName());
                               System.out.println("ID: "+ doctors.get(i).getID());
                               System.out.println("Salary per shift: "+ doctors.get(i).calculateSalary());
                               System.out.println("Working Hours: ");
                               System.out.println("From: "+ doctors.get(i).getStartHour()+" : "+doctors.get(i).getStartMinute());
                               System.out.println("To: "+ doctors.get(i).getEndHour()+" : "+doctors.get(i).getEndMinute());
                               isFound = true;
                            }
                        }
                        if(isFound == false){
                            System.out.println("Doesn't exist");
                        }
                        }
                        else{
                            System.out.println("Please add doctors first");
                        }
                        System.out.println("===========================================");
                        break;
                    //Displayng all doctors' information    
                    case 5:
                        if(numberOfDoctors>0){
                        doctors.forEach(Doctors ->{
                        System.out.println("Name: "+ Doctors.getFirstName() +" "+Doctors.getLastName()+ "\nID: " + Doctors.getID() + "\nSalary per shift: " + Doctors.calculateSalary());
                        System.out.println("Working Hours: ");
                        System.out.println("From: "+ Doctors.getStartHour()+" : "+Doctors.getStartMinute());
                        System.out.println("To: "+ Doctors.getEndHour()+" : "+Doctors.getEndMinute());
                        });
                        }
                        else{
                            System.out.println("Please add doctors first");
                        }
                        System.out.println("===========================================");
                        break;
                    //go back
                    case 6:
                        chooseFromAdminMenu();
                        break;
                    //go to main menu    
                    case 7:
                        mainMenu();
                        break;
                    //exit program    
                    case 8:
                        System.out.println("End of the program");
                        System.exit(0);
                    default:
                        System.out.println("Invalid Input");
                        break;
                   
                        }
                }       
                }
    //Method that allows the admin choose from the different options in the menu to manipulate the patient's information
    public void patientInformation(){
        
                while(true){
                displayPatientInformationMenu();
                int y = scan.nextInt();
                switch(y){
                    //adding a new patient
                    case 1:
                        
                        System.out.println("Patient's first name: ");
                        String firstName = scan.next();
                        System.out.println("Patient's last name: ");
                        String lastName = scan.next();
                        System.out.println("Patient's age: ");
                        int age  = scan.nextInt();
                        System.out.println("Patients's mobile number: ");
                        int mobileNumber = scan.nextInt();
                        Patients p = new Patients(firstName ,lastName ,mobileNumber ,age);
                        patients.add(p);
                        numberOfPatients++;
                        System.out.println("===========================================");
                        break;
                    //updaing an existing patient information    
                    case 2:
                        if(numberOfPatients>0){
                        boolean found=false;
                        System.out.println("Enter Patient's first name: ");
                        String firstNameOfPatient = scan.next();
                        System.out.println("Enter Patient last name: ");
                        String lastNameOfPatient = scan.next();
                        for(int i=0 ; i< patients.size() ; i++){
                            if (patients.get(i).getFirstName().equals(firstNameOfPatient) && patients.get(i).getLastName().equals(lastNameOfPatient)){
                                System.out.println("Enter mobile number to be updated");
                                patients.get(i).setMobileNumber(scan.nextInt());
                                found = true;
                            }
                        }
                        if(found == false){
                                System.out.println("Doctor not found");
                                }
                        }
                        else{
                            System.out.println("Please add doctors first");
                        }
                        System.out.println("===========================================");
                        break;
                    //removing an existing patient
                    case 3:
                        if(numberOfPatients>0){
                        boolean found=false;
                        System.out.println("Enter Patient's first name: ");
                        String firstNameOfPatient = scan.next();
                        System.out.println("Enter Patient's last name: ");
                        String lastNameOfPatient = scan.next();
                        for(int i=0 ; i< patients.size() ; i++){
                            if (patients.get(i).getFirstName().equals(firstNameOfPatient) && patients.get(i).getLastName().equals(lastNameOfPatient)){
                                patients.remove(i);
                                found = true;
                                numberOfPatients--;
                            }
                        }
                        if(found == false){
                                System.out.println("Patient not found");
                                }
                        }
                        else{
                            System.out.println("Please add patients first");
                        }
                        System.out.println("===========================================");
                        break;
                       
                    //search for a patient and display his/her information   
                    case 4:
                        if(numberOfPatients>0){
                        boolean isFound=false;
                        System.out.println("Enter Patient's first name: ");
                        String firstNameToSearch = scan.next();
                        System.out.println("Enter Patient's last name: ");
                        String lastNameToSearch = scan.next();
                        for(int i=0 ; i< patients.size() ; i++){
                            if (patients.get(i).getFirstName().equals(firstNameToSearch) && patients.get(i).getLastName().equals(lastNameToSearch)){
                               System.out.println("Name: "+ patients.get(i).getFirstName() + " "+patients.get(i).getLastName());
                               System.out.println("Age: "+ patients.get(i).getAge());
                               System.out.println("Mobile Number: "+ patients.get(i).getMobileNumber());
                               isFound=true;
                            }
                        }
                        if(isFound == false){
                            System.out.println("Doesn't exist");
                        }
                        }
                        else{
                            System.out.println("Please add patients first");
                        }
                         System.out.println("===========================================");
                        break;
                        
                    //Displaying all patients' infromation    
                    case 5:
                        if(numberOfPatients>0){
                        patients.forEach(Patients ->{
                        System.out.println("Name: "+ Patients.getFirstName()+ " " +Patients.getLastName() + "\nID: " + Patients.getId() + "\nAge: " + Patients.getAge()+"\nMobile Number: "+Patients.getMobileNumber());
                       });
                        }
                        else{
                            System.out.println("Please add patients first");
                        }
                        System.out.println("===========================================");
                        break;
                    //go back
                    case 6:
                        chooseFromAdminMenu();
                        break;
                    //return to main menu    
                    case 7:
                        mainMenu();
                        break;
                    //exit program    
                    case 8:
                        System.out.println("End of the program");
                        System.exit(0);
                    default:
                        System.out.println("Invalid Input");
                        break;
                   
                        }
                }
    }
    //Method to allow admin choose from different options to manipulate nurse's information
    public void nurseInformation(){
                while(true){
                displayNurseInformationMenu();
                int y = scan.nextInt();
                switch(y){
                    //adding a new nurse
                    case 1:
                        System.out.println("Nurse first name: ");
                        String firstName = scan.next();
                        System.out.println("Nurse last name: ");
                        String lastName = scan.next();
                        Nurses n = new Nurses(firstName ,lastName);
                        System.out.println("Salary per hour: ");
                        double salaryPerHour = scan.nextDouble();
                        n.setSalaryPerHour(salaryPerHour);
                        System.out.println("Nurse's working Hours: ");
                        double setWorkingHours = scan.nextDouble();
                        n.setWorkingHours(setWorkingHours);
                        System.out.println("From: ");
                        System.out.println("Hour: ");
                        n.setStartHour(scan.nextInt());
                        System.out.println("Minute: ");
                        n.setStartMinute(scan.nextInt());
                        nurses.add(n);
                        numberOfNurses++;
                        System.out.println("===========================================");
                        break;
                    //updating an existing nurses's information
                    case 2:
                        if(numberOfNurses>0){
                        boolean found=false;
                        System.out.println("Enter Nurse's first name: ");
                        String firstNameOfNurse = scan.next();
                        System.out.println("Enter Nurse last name: ");
                        String lastNameOfNurse = scan.next();
                        for(int i=0 ; i< nurses.size() ; i++){
                            if (nurses.get(i).getFirstName().equals(firstNameOfNurse) && nurses.get(i).getLastName().equals(lastNameOfNurse)){
                                System.out.println("Enter number working hours to be updated");
                                nurses.get(i).setWorkingHours(scan.nextInt());
                                System.out.println("From: ");
                                System.out.println("Hour: ");
                                nurses.get(i).setStartHour(scan.nextInt());
                                System.out.println("Minute: ");
                                nurses.get(i).setStartMinute(scan.nextInt());
                                System.out.println("Enter salary per hour to be updated");
                                nurses.get(i).setSalaryPerHour(scan.nextDouble());
                                found = true;
                            }
                        }
                        if(found == false){
                                System.out.println("Nurse not found");
                                }
                        }
                        else{
                            System.out.println("Please add nurses first");
                        }
                        System.out.println("===========================================");
                        break;
                       
                    //deleting a nurse
                    case 3:
                        if(numberOfNurses>0){
                        boolean found=false;
                        System.out.println("Enter Nurse's first name: ");
                        String firstNameOfNurse = scan.next();
                        System.out.println("Enter Nurse last name: ");
                        String lastNameOfNurse = scan.next();
                        for(int i=0 ; i< nurses.size() ; i++){
                            if (nurses.get(i).getFirstName().equals(firstNameOfNurse) && nurses.get(i).getLastName().equals(lastNameOfNurse)){
                                nurses.remove(i);
                                found = true;
                                numberOfNurses--;
                            }
                        }
                        if(found == false){
                                System.out.println("Nurse not found");
                                }
                        }
                        else{
                            System.out.println("Please add nurses first");
                        }
                        System.out.println("===========================================");
                        break;
                    //searching for a nurse and displaying his/her information    
                    case 4:
                        if(numberOfNurses>0){
                        boolean isFound=false;
                        System.out.println("Enter Nurse first name: ");
                        String firstNameToSearch = scan.next();
                        System.out.println("Enter Nurse last name: ");
                        String lastNameToSearch = scan.next();
                        for(int i=0 ; i< nurses.size() ; i++){
                            if (nurses.get(i).getFirstName().equals(firstNameToSearch) && nurses.get(i).getLastName().equals(lastNameToSearch)){
                               System.out.println("Name: "+ nurses.get(i).getFirstName()+" "+nurses.get(i).getLastName());
                               System.out.println("ID: "+ nurses.get(i).getID());
                               System.out.println("Salary per shift: "+ nurses.get(i).calculateSalary());
                               System.out.println("Working Hours: ");
                               System.out.println("From: "+ nurses.get(i).getStartHour()+" : "+nurses.get(i).getStartMinute());
                               System.out.println("To: "+ nurses.get(i).getEndHour()+" : "+nurses.get(i).getEndMinute());
                               isFound = true;
                            }
                        }
                        if(isFound == false){
                            System.out.println("Doesn't exist");
                        }
                        }
                        else{
                            System.out.println("Please add nurse first");
                        }
                        System.out.println("===========================================");
                        break;
                    //Displayng all nurses' information    
                    case 5:
                        if(numberOfNurses>0){
                        nurses.forEach(Nurses ->{
                        System.out.println("Name: "+ Nurses.getFirstName() +" "+Nurses.getLastName()+ "\nID: " + Nurses.getID() + "\nSalary per shift: " + Nurses.calculateSalary());
                        System.out.println("Working Hours: ");
                        System.out.println("From: "+ Nurses.getStartHour()+" : "+Nurses.getStartMinute());
                        System.out.println("To: "+ Nurses.getEndHour()+" : "+Nurses.getEndMinute());
                        });
                        }
                        else{
                            System.out.println("Please add nurses first");
                        }
                        System.out.println("===========================================");
                        break;
                    //go back
                    case 6:
                        chooseFromAdminMenu();
                        break;
                    //go to main menu    
                    case 7:
                        mainMenu();
                        break;
                    //exit program    
                    case 8:
                        System.out.println("End of the program");
                        System.exit(0);
                    default:
                        System.out.println("Invalid Input");
                        break;
                   
                        }
                }       
                }
    
    //Method that allows the admin choose from the different options in the menu to manipulate the receptionist's information
    public void receptionistInformation(){
                while(true){
                displayReceptionistInformationMenu();
                int y = scan.nextInt();
                switch(y){
                    //add receptionist information
                    case 1:
                        System.out.println("Receptionist's first name: ");
                        String firstName = scan.next();
                        System.out.println("Receptionist's last name: ");
                        String lastName = scan.next();
                        Receptionist r = new Receptionist(firstName , lastName);
                        System.out.println("Salary per hour: ");
                        double salaryPerHour = scan.nextDouble();
                        r.setSalaryPerHour(salaryPerHour);
                        System.out.println("Receptionist's working Hours: ");
                        double setWorkingHours = scan.nextDouble();
                        r.setWorkingHours(setWorkingHours);
                        System.out.println("From: ");
                        System.out.println("Hour: ");
                        r.setStartHour(scan.nextInt());
                        System.out.println("Minute: ");
                        r.setStartMinute(scan.nextInt());
                        receptionists.add(r);
                        numberOfReceptionists++;
                        System.out.println("===========================================");
                        break;
                    //update an existing receptionist information
                    case 2:
                        if(numberOfReceptionists>0){
                        boolean found=false;
                        System.out.println("Enter Receptionist's first name: ");
                        String firstNameOfReceptionist = scan.next();
                        System.out.println("Enter Receptionist last name: ");
                        String lastNameOfReceptionist = scan.next();
                        for(int i=0 ; i< receptionists.size() ; i++){
                            if (receptionists.get(i).getFirstName().equals(firstNameOfReceptionist) && receptionists.get(i).getLastName().equals(lastNameOfReceptionist)){
                                System.out.println("Enter number working hours to be updated");
                                receptionists.get(i).setWorkingHours(scan.nextInt());
                                System.out.println("From: ");
                                System.out.println("Hour: ");
                                receptionists.get(i).setStartHour(scan.nextInt());
                                System.out.println("Minute: ");
                                receptionists.get(i).setStartMinute(scan.nextInt());
                                System.out.println("Enter salary per hour to be updated");
                                receptionists.get(i).setSalaryPerHour(scan.nextDouble());
                                found = true;
                            }
                        }
                        if(found == false){
                                System.out.println("Receptionist not found");
                                }
                        }
                        else{
                            System.out.println("Please add receptionists first");
                        }
                        System.out.println("===========================================");
                        break;
                    //remove an existing receptionist
                    case 3:
                        if(numberOfReceptionists>0){
                        boolean found=false;
                        System.out.println("Enter Receptionist's first name: ");
                        String firstNameOfReceptionist = scan.next();
                        System.out.println("Enter Receptionist's last name: ");
                        String lastNameOfReceptionist = scan.next();
                        for(int i=0 ; i< receptionists.size() ; i++){
                            if (receptionists.get(i).getFirstName().equals(firstNameOfReceptionist) && receptionists.get(i).getLastName().equals(lastNameOfReceptionist)){
                                receptionists.remove(i);
                                found = true;
                            }
                        }
                        
                        if(found == false){
                                System.out.println("Receptionist not found");
                                }
                        }
                        else{
                            System.out.println("Please add receptionists first");
                        }
                        System.out.println("===========================================");
                        break;
                    //search for an existing receptionist and display his/her information    
                    case 4:
                        if(numberOfReceptionists>0){
                        System.out.println("Enter Receptionist's first name: ");
                        String firstNameToSearch = scan.next();
                        System.out.println("Enter Receptionist's last name: ");
                        String lastNameToSearch = scan.next();
                        for(int i=0 ; i< receptionists.size() ; i++){
                            if (receptionists.get(i).getFirstName().equals(firstNameToSearch) && receptionists.get(i).getLastName().equals(lastNameToSearch)){
                               System.out.println("Name: "+ receptionists.get(i).getFirstName()+" "+receptionists.get(i).getLastName());
                               System.out.println("ID: "+ receptionists.get(i).getID());
                               System.out.println("Salary per shift: "+ receptionists.get(i).calculateSalary());
                               System.out.println("Working Hours: ");
                               System.out.println("From: "+ receptionists.get(i).getStartHour()+" : "+receptionists.get(i).getStartMinute());
                               System.out.println("To: "+ receptionists.get(i).getEndHour()+" : "+receptionists.get(i).getEndMinute());
                            }
                        }
                        }
                        else{
                            System.out.println("Please add receptionists first");
                        }
                         System.out.println("===========================================");
                        break;
                    //display information for all receptionists    
                    case 5:
                        if(numberOfReceptionists>0){
                        receptionists.forEach(Receptionist ->{
                        System.out.println("Name: "+ Receptionist.getFirstName()+" "+ Receptionist.getLastName()+ "\nID: " + Receptionist.getID() + "\nSalary per shift: " + Receptionist.calculateSalary());
                        System.out.println("Working Hours: ");
                        System.out.println("From: "+ Receptionist.getStartHour()+" : "+Receptionist.getStartMinute());
                        System.out.println("To: "+ Receptionist.getEndHour()+" : "+Receptionist.getEndMinute());
                        });
                        }
                        else{
                            System.out.println("Please add receptionists first");
                        }
                        System.out.println("===========================================");
                        break;
                    //go back
                    case 6:
                        chooseFromAdminMenu();
                        break;
                    //main menu    
                    case 7:
                        mainMenu();
                        break;
                    //exist program   
                    case 8:
                        System.out.println("End of the program");
                        System.exit(0);
                    default:
                        System.out.println("Invalid Input");
                        break;
                   
                        }
                         }
    }
    
    public void mainMenu(){
    
     while(true){
        displayMainMenu();
        System.out.println("===========================================");
        System.out.println("Please enter your Choice: ");
        int choice = scan.nextInt();
        switch(choice){
            case 1:
               chooseFromAdminMenu();
                break;
                
            case 2:
                
                if(numberOfDoctors > 0){
               
                chooseFromDoctorMenu();
                }
                else{
                    System.out.println("Add doctors first");
                }
                break;
                
            case 3:
                chooseFromReceptionistMenu();
                break;
                
            
                
            case 4:
                
                System.out.println("End of the program");
                System.exit(0);
                break; 
                
            default:
                System.out.println("Invalid Input");
        
    }

    }
    }
    
    
    public void chooseFromAdminMenu(){
     displayAdminMenu();
     while(true){
        System.out.println("===========================================");
        System.out.println("Please enter your Choice: ");
        int choice = scan.nextInt();
        switch(choice){
            
            //Doctor Information
            case 1:
                doctorInformation();
                break;
            //Patient Information   
            case 2:
                patientInformation();
                break;
            //Nurse Information
            case 3:
                nurseInformation();
                break;
            //Receptionist Information
            case 4:
                receptionistInformation();
                break;
            case 5:
                chooseFromClinicMenu();
                break;
            //Returning to the main menu    
            case 6:
                chooseFromAdminMenu();
                break;
            //exit  
            case 7:
                mainMenu();
                break;
            case 8:
                System.out.println("End of the program");
                System.exit(0);
                break; 
                
            default:
                System.out.println("Invalid Input");
        
    }
      }
    }
    //choosing from receptionist menu
    public void chooseFromReceptionistMenu(){
        int counter =0;
        while(true){
        displayReceptionistMenu();
        System.out.println("===========================================");
        System.out.println("Please enter your Choice: ");
        int choice = scan.nextInt();
        switch(choice){
            
            //Add appointment
            case 1:
                //If condition to check the avaliabilty of doctors before adding adding appointments
                if(numberOfDoctors>0){
                appointment();
                counter++;
                }
                else{
                    System.out.println("Add doctors first");
                }
                break;
            //Cancel appointment   
            case 2:
                if(numberOfAppointments>0){
                        boolean found=false;
                        System.out.println("Enter Patient's first name: ");
                        String firstNameOfPatient = scan.next();
                        System.out.println("Enter Patient's last name: ");
                        String lastNameOfPatient = scan.next();
                        for(int i=0 ; i< appointments.size() ; i++){
                            if (appointments.get(i).getPatient().getFirstName().equals(firstNameOfPatient) && appointments.get(i).getPatient().getLastName().equals(lastNameOfPatient)){
                                appointments.remove(i);
                                found = true;
                            }
                        }
                        
                        if(found == false){
                                System.out.println("Appointment not found");
                                }
                        }
                        else{
                            System.out.println("Please add Appointment first");
                        }
                        System.out.println("===========================================");
                break;
            
            //Check schedule per day
            case 3:
                
                System.out.println("Enter date: ");
                System.out.println("Day: ");
                int day = scan.nextInt();
                System.out.println("Month: ");
                int month = scan.nextInt();
                System.out.println("Year: ");
                int year = scan.nextInt();
               
                System.out.println("========"+day+"/"+month+"/"+year+"=========");
                for(int i=0 ; i< appointments.size() ; i++){
                            if (appointments.get(i).getMonth() == month && appointments.get(i).getYear() == year && appointments.get(i).getDay() == day ){
                                System.out.print("Patient Name: "+appointments.get(i).getPatient().getFirstName()+" "+appointments.get(i).getPatient().getLastName()+" Doctor Name: "+appointments.get(i).getDoctor().getFirstName()+" "+appointments.get(i).getDoctor().getLastName()+" Time: "+appointments.get(i).getHour()+":"+appointments.get(i).getMinutes());
                                System.out.println("\n");
                                counter++;
                            }
                            
                        }
               
                if(counter == 0){
                                System.out.println("No Appointments");
                            }
                break;
            //Returning to the main menu    
            case 4:
                mainMenu();
                break;
            //exit   
            case 5:
                System.out.println("End of the program");
                System.exit(0);
                break; 
                
            default:
                System.out.println("Invalid Input");
        
    }
      }
    }
    //adding appointment after checking whether the patient is new or existing 
    public void appointment(){
        boolean found = true;
        System.out.println("===========================================");
        System.out.println("1.New Patient");
        System.out.println("2.Existing Patient");
        System.out.println("Please enter your Choice: ");
        int choice = scan.nextInt();
        Appointments a = new Appointments();
        switch(choice){
            case 1:
                //adding patient
                System.out.println("Patient's first name: ");
                        String firstName = scan.next();
                        System.out.println("Patient's last name: ");
                        String lastName = scan.next();
                        System.out.println("Patient's age: ");
                        int age  = scan.nextInt();
                        System.out.println("Patients's mobile number: ");
                        int mobileNumber = scan.nextInt();
                        Patients p = new Patients(firstName , lastName, age , mobileNumber);
                        patients.add(p);
                        numberOfPatients++;
                        System.out.println("===========================================");
                //Adding appointment for the newly added patient
                //Displaying all avaliable doctors
                doctors.forEach(Doctors ->{
                        System.out.println("Name: "+ Doctors.getFirstName()+" "+Doctors.getLastName() + "\nID: "+Doctors.getID());
                        System.out.println("Working Hours: ");
                        System.out.println("From: "+ Doctors.getStartHour()+" : "+Doctors.getStartMinute());
                        System.out.println("To: "+ Doctors.getEndHour()+" : "+Doctors.getEndMinute());
                       });
                //choosing a doctor
                System.out.println("Choose a doctor(Enter Doctor's ID):");
                int ID = scan.nextInt();
                for(int i=0 ; i< doctors.size() ; i++){
                            if (doctors.get(i).getID() ==   ID){
                                a.setDoctor(doctors.get(i));
                            }
                }
                
                for(int i=0 ; i< patients.size() ; i++){
                            if (patients.get(i).getFirstName().equals(firstName) && patients.get(i).getLastName().equals(lastName)){
                                a.setPatient(patients.get(i));
                                found=true;
                            }
                            
                }
                if(found == true){
                System.out.println("Enter date(day/month/year): ");
                System.out.println("Day (from 1 to 31): ");
                a.setDay(scan.nextInt());
                System.out.println("Month (from 1 to 12): ");
                a.setMonth(scan.nextInt());
                System.out.println("year: ");
                a.setYear(scan.nextInt());
                System.out.println("Enter Time: ");
                System.out.println("Hour: ");
                a.setHour(scan.nextInt());
                System.out.println("Minutes: ");
                a.setMinutes(scan.nextInt());
                System.out.println("Enter appointment fees: ");
                a.setfees(scan.nextDouble());
                
                appointments.add(a);
                numberOfAppointments++;
                }
                else{
                   System.out.println("Patient doesn't exist");
                                
                }

                        
                break;
                
            case 2:
                //if condition to check the avalibilty of patients before adding an appiontment
                if(numberOfPatients>0){
                //displaying avaliable doctors
                doctors.forEach(Doctors ->{
                        System.out.println("Name: "+ Doctors.getFirstName()+" "+Doctors.getLastName() + "\nID: "+Doctors.getID());
                        System.out.println("Working Hours: ");
                        System.out.println("From: "+ Doctors.getStartHour()+" : "+Doctors.getStartMinute());
                        System.out.println("To: "+ Doctors.getEndHour()+" : "+Doctors.getEndMinute());
                       });
                System.out.println("Choose a doctor(Enter Doctor's ID):");
                ID = scan.nextInt();
                for(int i=0 ; i< doctors.size() ; i++){
                            if (doctors.get(i).getID() ==   ID){
                                a.setDoctor(doctors.get(i)); 
                            }
                }
                //entering patient Name
                System.out.println("Enter Patient's first name: ");
                String PatientFirstName = scan.next();
                System.out.println("Enter Patient's last name: ");
                String PatientLastName = scan.next();
                for(int i=0 ; i< patients.size() ; i++){
                            if (patients.get(i).getFirstName().equals(PatientFirstName) && patients.get(i).getLastName().equals(PatientLastName)){
                                a.setPatient(patients.get(i));
                                System.out.println("Enter date(day/month/year): ");
                                System.out.println("Day (from 1 to 31): ");
                                a.setDay(scan.nextInt());
                                System.out.println("Month (from 1 to 12): ");
                                a.setMonth(scan.nextInt());
                                System.out.println("year: ");
                                a.setYear(scan.nextInt());
                                System.out.println("Enter Time: ");
                                System.out.println("Hour: ");
                                a.setHour(scan.nextInt());
                                System.out.println("Minutes: ");
                                a.setMinutes(scan.nextInt());
                                System.out.println("Enter appointment fees: ");
                                a.setfees(scan.nextDouble());
                                appointments.add(a);
                                numberOfAppointments++; 
                               //found = true;
                            }
                            else{
                                System.out.println("Patient doesn't exist");
                            }
                }
               
                }
                else{
                    System.out.println("Add patients first");
                }
                break;
                
            default:
                System.out.println("Invalid choice");
                break;
        
    }
        }
    //choosing from doctor menu
    public void chooseFromDoctorMenu(){
        while(true){
        
        displayDoctorMenu();
        System.out.println("===========================================");
        System.out.println("Please enter your Choice: ");
        int choice = scan.nextInt();
        boolean found = false;
        switch(choice){
            //Check schedule per day
            case 1:
                System.out.println("Please enter first name: ");
                String doctorFirstName = scan.next();
                System.out.println("Please enter Last name: ");
                String doctorLastName = scan.next();
                System.out.println("Please enter ID: ");
                int doctorID = scan.nextInt();
                for(int i=0 ; i< doctors.size() ; i++){
                            if(doctors.get(i).getFirstName().equalsIgnoreCase(doctorFirstName) && doctors.get(i).getFirstName().equalsIgnoreCase(doctorLastName) && doctors.get(i).getID()==doctorID){
                               found =true;
                            }
                            
                }
                if(found == true){
                System.out.println("Enter date: ");
                System.out.println("Day: ");
                int day = scan.nextInt();
                System.out.println("Month: ");
                int month = scan.nextInt();
                System.out.println("Year: ");
                int year = scan.nextInt();
                System.out.println("========"+day+"/"+month+"/"+year+"========="); 
                for(int i=0 ; i< appointments.size() ; i++){
                            if (appointments.get(i).getMonth() == month && appointments.get(i).getYear() == year && appointments.get(i).getDay() == day && appointments.get(i).getDoctor().getFirstName().equalsIgnoreCase(doctorFirstName) && appointments.get(i).getDoctor().getFirstName().equalsIgnoreCase(doctorLastName) && appointments.get(i).getDoctor().getID() == doctorID ){
                                System.out.print("Name: "+appointments.get(i).getPatient().getFirstName()+" "+appointments.get(i).getPatient().getLastName()+" Time: "+appointments.get(i).getHour()+":"+appointments.get(i).getMinutes());
                                System.out.println("\n");
                               
                            }
                            
                }
                }
                else{
                    System.out.println("Doctor not found");
                }
                break;
            //Returning to the main menu    
            case 2:
                mainMenu();
                break;
            //exit   
            case 3:
                System.out.println("End of the program");
                System.exit(0);
                break; 
                
            default:
                System.out.println("Invalid Input");
        
    }
      }
    }

    @Override
    public void setMedicalTool() {
       medicalTools.add("cotton wool");
       medicalTools.add("gloves");
       medicalTools.add("face mask");
       medicalTools.add("dental mirror");
       medicalTools.add("dental probe");
       medicalTools.add("cotton wool");
       medicalTools.add("college tweezers");
       medicalTools.add("dental tray");
       medicalTools.add("mouth prob");
       medicalTools.add("dental chair");
    }

    @Override
    public ArrayList getMedicalTool() {
        return medicalTools;
    }

    @Override
    public void addTool() {
        System.out.println("Enter tool to add");
        String tool = scan.next();
        medicalTools.add(tool);
    }

    
    }

    

     
    

