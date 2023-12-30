
package dentalclinic;


public class Receptionist extends Employee {
    private int id;
    private static int counter=1;
    private double salaryPerHour;
    
    
    public Receptionist(String firstName ,String lastName){
        super(firstName,lastName);
        this.id = counter;
        counter++;
    }
    public void setSalaryPerHour(double salaryPerHour){
        this.salaryPerHour=salaryPerHour;
    }
   
    
    public int getID(){
        return this.id;
    }
    
    
    //polymerphism and overridding
    @Override
    public double calculateSalary() {
        return getWorkingHours()*this.salaryPerHour;
    }

    
}
