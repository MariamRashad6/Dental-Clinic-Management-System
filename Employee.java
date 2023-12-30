
package dentalclinic;


public abstract class Employee {
    private double salary;
    private String firstName;
    private String lastName;
    private double workingHours;
    private int startHour;
    private int startMinute;
    
    public Employee(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //getters methods
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public double getSalary(){
        return this.salary;
    }
    //setters methods
    public void setSalary(double salary){  //overloading
        this.salary = salary;
    }
    public void setSalary(int salary){    //overloading
        this.salary = salary;
    }
    public void setWorkingHours(double workingHours){  //overloading
        this.workingHours = workingHours;
    }
    public void setWorkingHours(int workingHours){      //overloading
        this.workingHours = workingHours;
    }
    public void setStartHour(int startHour){
        this.startHour=startHour;
    }
    public void setStartMinute(int startMinute){
        this.startMinute=startMinute;
    }
    //getters methods
    public int getStartHour(){
        return startHour;
    }
    public int getStartMinute(){
        return startMinute;
    }
    public int getEndMinute(){
        return startMinute;
    }
    public int getEndHour(){
        return startHour+ (int)workingHours;
    }
    public double getWorkingHours(){
        return this.workingHours;
    }
    
    public abstract double calculateSalary();
    
    

}
