
package dentalclinic;

import java.util.ArrayList;



public class Appointments {
    private Doctors doctor;
    private Patients patient;
    private double fees;
    private int hour;
    private int minutes;
    private int day;
    private int month;
    private int year;
    
    
    public Appointments(Doctors doctor  , Patients patient){
        this.doctor = doctor;
        this.patient = patient;
    }
    public Appointments(){
        
    }
    
    public Doctors getDoctor(){
        return this.doctor;
    }
    public Patients getPatient(){
        return this.patient;
    }
    public void setDoctor(Doctors doctor){
        this.doctor = doctor;
    }
    public void setPatient(Patients patient){
        this.patient = patient;
    }
    public double getFees(){
       return this.fees;
    }
   
    public void setfees(double fees){
       this.fees = fees;
    }
    
    public double calculateFees(){
        return fees;
    }
    public int getHour(){
        return this.hour;
    }
    public int getMinutes(){
        return this.minutes;
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public void setHour(int hour){
            this.hour = hour;
    }
    public void setMinutes(int minutes){
            this.minutes = minutes;
    }
    public void setDay(int day){
            this.day = day;
    }
    public void setMonth(int month){
            this.month= month;
    }
    public void setYear(int year){
            this.year = year;
    }
    
   
    
   
}
