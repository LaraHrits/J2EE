package EXP_3;

public class Bank {
    private int account;

    public Bank() {
        this.account = -2;
    }

    public synchronized void inc(){
        for (; account < 20000; account += 2) {
            System.out.println("Increase: " + account);
        }
    }

    public synchronized void dec(){
        for (; account > 1; account--) {
            System.out.println("Decrease:" + account);
        }
    }

    public void setAccount(int account) {

        this.account = account;
    }

    public int getAccount() {

        return account;
    }
}
