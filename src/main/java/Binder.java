import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Binder {
    private String[] classes;
    private int studentID;
    private String studentName;
    private int classesAdded;

    public Binder(int numClasses, String studentName1){
        classes = new String[numClasses];
        studentID = (int) (Math.random() * (99999 - 10000) + 10000);
        studentName = studentName1;
        classesAdded = 0;
    }

    public void addClass(String newClass){
        if (classesAdded + 1 > classes.length){
            System.out.println("Sorry. You have maximum classes added. Please choose a class to replace instead. \n");
        }
        else{
            classes[classesAdded] = newClass;
            classesAdded += 1;

        }
    }

    public void replaceClass(String oldClass, String newClass){
        for (int i = 0; i < classes.length; i++) {
            if(Objects.equals(classes[i], oldClass)){
                classes[i] = newClass;
                System.out.println("Replaced " + oldClass + " with " + newClass + ". \n");
            }
        }
    }

    public void genNewID(){
        studentID = (int) (Math.random() * (99999 - 10000) + 10000);
        System.out.println("Generated new ID " + studentID + "\n");;
    }

    public void changePreferredName(String newName){
        studentName = newName;
        System.out.println("Changed name to " + newName + "\n");
    }

    public String[] getClasses(){return classes;}

    public int getStudentID(){return studentID;}

    public String getStudentName(){return studentName;}

    public String toString(){
        return Arrays.toString(classes);
    }
    public String getStudentSummary(){
        return "Name: " + studentName +"\nID: " + studentID + "" + "\nClasses: " + Arrays.toString(classes) + "\n";
    }
}
