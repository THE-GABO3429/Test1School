import java.util.ArrayList;
/**
 * Write a description of class Question16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question16
{
    public class Bird{
        private String color;
        private String breed;
        private int age;
        public Bird(String color, String breed, int age){
            this.color = color;
            this.breed = breed;
            this.age = age;
        }
        public void sing(){
            System.out.println("Bird_vocalization_in_action...");
        }
    }
    
    public class Zoo{
        private ArrayList<Bird> zooBirds;
        public Zoo(){
            zooBirds = new ArrayList<>();
            zooBirds.add(new Bird("blue","blue jay",1));
            zooBirds.add(new Bird("red","red jay",1));
            zooBirds.add(new Bird("green","green jay",3));
            zooBirds.add(new Bird("blue","blue jay",1));
        }
        
        //int countBlueBirds(){
            //for(ArrayList<> blue){    
                //blueBirds = 0;
                //blueBirds++;}
    }
            //System.out.println("There is " + blueBirds + " blue birds.");
    //}
}

