package threads.bankaccount;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("254896589",1000.0d);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(1000);
                account.withdraw(700);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.withdraw(890);
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(Exception e){

        }
        account.seeBalance();

    }
}
