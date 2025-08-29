public class MynewException {
    public static void main(String[] args) {
        UserdefinedException ud=new UserdefinedException();
        try{
            ud.validate(19);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
