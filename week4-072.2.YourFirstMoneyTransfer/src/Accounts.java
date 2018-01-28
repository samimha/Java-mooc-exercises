
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account MattsAccount = new Account("Matt's account", 1000.00);
        Account myAccount = new Account("My account", 0);
        MattsAccount.withdrawal(100.00);
        myAccount.deposit(100.00);
        System.out.println(MattsAccount);
        System.out.println(myAccount);
    }

}
