package question.pkg2;
import javax.swing.JOptionPane;//importing Joption class to display a GUI and ask the user for input
import java.util.Random;//importing Random class to randomly choose a house colour, generate a house number between 0 and 1000
/**
 *
 * @author Riko Wolhuter
 */
public class Question2 {


    public static void main(String[] args) {
    String firstName;
    String secondName;
    String thirdName;
    /*
    Asking 3 students for their names
    */
    firstName = JOptionPane.showInputDialog(null,"Please enter the first student name");
    secondName = JOptionPane.showInputDialog(null,"Please enter the second student name");
    thirdName = JOptionPane.showInputDialog(null,"Please enter the third student name");
    /*
    Creating 3 Question2 objects, an object for each student
    */
    Question2 house1 = new Question2();
    Question2 house2 = new Question2();
    Question2 house3 = new Question2();
    /*
    Accepting the randomly chosen house colours in a array from the RandomHouse method and storing them in Strings
    */
    String House1 = house1.RandomHouse();
    String House2 = house2.RandomHouse();
    String House3 = house3.RandomHouse();
    
    Question2 randomNum = new Question2();//creating a Question2 object for the randomly generated number

    /*
    GUI output to display the students names, the house colours and house numbers
    */
    JOptionPane.showMessageDialog(null,
            "SCHOOL HOUSE ASSIGNMENT\n**********************************\n"
            +firstName+" assigned to the "+House1
            +" house with student number "+House1
            +randomNum.studentNum()+"\n"
            +secondName+" assigned to the "+House2
            +" house with student number "+House2
            +randomNum.studentNum()+"\n"
            +thirdName+" assigned to the "+House3
            +" house with student number "+House3
            +randomNum.studentNum(),
            "School House Assignment", 
            JOptionPane.INFORMATION_MESSAGE);
    }
    
    /*
    method to randomly generate a student number between 0 and 1000
    */
    public static int studentNum()
    {
       final int MAX_StudentNumber = 1000;
       int studentNum;
       studentNum = (int)(Math.random()*MAX_StudentNumber);
       return studentNum;
    }  
    
    /*
    method to randomly select a house colour from the array
    */
    public static String RandomHouse()
    {
    String[] house = new String[3];
    house[0] = "BLUE";
    house[1] = "RED";
    house[2] = "WHITE";
    
Random random = new Random();
int House = random.nextInt(house.length);

return house[House];
    }
}
