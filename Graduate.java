public class Graduate extends Student{
    private double GMATScore = 0.0;
    
    public Graduate(int sID, String f, String l, double g){
        super(sID, f, l);
        GMATScore = g;
    }
    
    public String toString(){
        return String.format("%s %4.1f", super.toString(), GMATScore);
    }
}