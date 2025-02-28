
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
    
    //Question 17
    
}
