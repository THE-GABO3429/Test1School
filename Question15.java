
/**
 * Write a description of class Question15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question15
{
    private int currentYear = 2025;
    
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
}
