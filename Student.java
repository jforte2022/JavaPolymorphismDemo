public class Student {
    private int studentID = 0;
    private String firstName;
    private String lastName;
    
    public Student(int sID, String f, String l){
        studentID = sID;
        firstName = f;
        lastName = l;
    }
    
    public String toString(){
        return String.format("%3d %s %s", studentID, firstName, lastName);
    }
}