package Unit1;

public class Person {
    public String address;

    public Person(String address){
        this.address=address;
    }
    public void getAddress(){
        System.out.println("Address : "+address);
    }
}
