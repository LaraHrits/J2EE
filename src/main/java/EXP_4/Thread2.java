package EXP_4;

public class Thread2 implements Runnable {
    private final Bank bank;

    public Thread2(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        synchronized (bank) {
            for (int i = 0; i < 20000; i++) {
                bank.setAccount(bank.getAccount() - 1);
            }

            System.out.println("Decrease: " + bank.getAccount());
        }
    }
}
