public class Polymorphism {
    public static void main(String[] args){
        Undergraduate bob = new Undergraduate(456, "Bob", "Martinez", 4, "Business");
        Graduate tina = new Graduate(497, "Tina", "Ford", 672.1);
        Undergraduate roger = new Undergraduate(798, "Roger", "Forte", 3.2, "Communications");
        Graduate shelly = new Graduate(367, "Shelly", "Lancaster", 412);
        Undergraduate alexus = new Undergraduate(649, "Alexus", "Engels", 3.47, "Music");
        Graduate christopher = new Graduate(912, "Christopher", "Wellens", 560);
        
        Student[] studentList = new Student[6];
        studentList[0] = bob;
        studentList[1] = tina;
        studentList[2] = roger;
        studentList[3] = shelly;
        studentList[4] = alexus;
        studentList[5] = christopher;
        
        for(int i = 0; i < studentList.length; i++){
            System.out.println(studentList[i]);
        }
        
    }
}