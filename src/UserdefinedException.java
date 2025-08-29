public class UserdefinedException {
    public void validate(int age) throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("Cannot cast vote as age is less than 18");
        else
            System.out.println("Eligible to vote");
    }
}
