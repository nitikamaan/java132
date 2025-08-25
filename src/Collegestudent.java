public class Collegestudent extends Student1 {
    public Collegestudent(String name,int rollno){
        super(name,rollno);
    }

    public void attend_class(){
        System.out.println(name+" attends class on smart board");
    }
    public void give_exam(){
        System.out.println(rollno+" give exam in online mode");
    }

}
