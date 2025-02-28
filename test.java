import java.util.ArrayList;
//part of 16
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    private int workedHours;
    //part of 14
    
    private int hourWage;
    //part of 14
    
    private int taxes;
    //part of 14
    
    private int deduction;
    //part of 14
    
    private int currentYear = 2025;
    //part of 15
    
    //Question 14
    public int netPayForXTime(){
        workedHours = 8;
        hourWage = 15;
        taxes = 5;
        int salary= workedHours + hourWage;
        deduction = taxes + deduction;
        int netPay = salary + deduction;
        System.out.println("Your net pay is: " + netPay);
        return netPay;
    }
    // Question 15
    public int yearOfBirth(){
        int yearOfBirth = 2020;
        int age = currentYear - yearOfBirth;
        int legalAgeToDrive = 16;
        if (age >= legalAgeToDrive){
            System.out.println("The user can legally drive.");
        }
        else{
            int missingYears = legalAgeToDrive -age;
            System.out.println("The User can ilegally drive. Wait " + missingYears + " years to legally drive.");
        }
        return age;
    }
    //Question 16
    //public class Zoo{
        //private ArrayList<Bird> zooBirds;
        //int countBlueBirds(){
            //for(zooBirds = cloro.birds){
                //blueBirds = 0;
                //blueBirds++;
            //}
            //System.out.println("There is " + blueBirds + " blue birds.");
        //}
    //}
    //Question 17
    
}
