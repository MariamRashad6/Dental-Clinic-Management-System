
package dentalclinic;




public class Patients {
    private int id;
    private String firstName;
    private String lastName;
    private int mobileNumber;
    private static int counter=1;
    private int age;
    public Patients(){
        
    }
    public Patients(String firstName , String lastName, int mobileNumber , int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.id = counter;
        this.age=age;
        counter++;
    }
    //getters methods
    public int getId(){
        return this.id;
    }
    public int getMobileNumber(){
        return this.mobileNumber;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    //setters methods
    public void setMobileNumber(int mobileNumber){
        this.mobileNumber = mobileNumber;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }
    
}
