public class Bank {
    private int balance=10000;
    public void withdraw(int amount){
        if(amount>balance)
            throw new InsufficientBalanceException("Cannot withdraw Amount greater than Balance");
        else{
            balance-=amount;
            System.out.println("Withdrawal Successfull. Remaining balance: "+balance);
        }
    }
}
