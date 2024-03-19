public class Undergraduate extends Student{
    private double GPA = 0.0;
    private String major;
    
    public Undergraduate(int sID, String f, String l, double g, String m){
        super(sID, f, l);
        GPA = g;
        major = m;
    }
    
    public String toString(){
        return String.format("%s %4.3f %s", super.toString(), GPA, major);
    }
}