package Unit1;

abstract class Student1{
    String name;
    int rollno;

    public Student1(String name,int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    abstract void attend_class();
    abstract void give_exam();
}
