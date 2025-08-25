public class Stu {
    private String grade;
    public int rollno;
    public String name;

    public Stu(String grade,int rollno,String name){
        this.name=name;
        this.rollno=rollno;
        this.grade=grade;
    }

    public String getgrade(){
        return grade;
    }
    public void setgrade(String grade){
        this.grade=grade;
    }
}
