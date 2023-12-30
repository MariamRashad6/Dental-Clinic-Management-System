
package dentalclinic;


public class Nurses extends Employee {
    private int id;
    private static int counter=1;
    private  double salaryPerHour;
    
    
    public Nurses(String firstName , String lastName){
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
    
    
    
    //polymerphism and overriding
    @Override
    public double calculateSalary() {
        return getWorkingHours()*this.salaryPerHour;
    }

    
}
