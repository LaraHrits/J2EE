package EXP_2;

public class Bank {
    private int account;

    public Bank() {
        this.account = 5;
    }

    public synchronized void inc(){
        for (int i = 0; i < 20000; i++) {
            account += 2;
        }
        System.out.println("Increase: " + account);
    }

    public synchronized void dec(){
        for (int i = 0; i < 20000; i++) {
            account--;
        }
        System.out.println("Decrease : " + account);
    }
}