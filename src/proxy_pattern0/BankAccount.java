package proxy_pattern0;

public interface BankAccount {
    void debit();
}


class SavingAccount implements BankAccount{

    @Override
    public void debit() {
        System.out.println("Debit from Bank account.");
    }

    boolean validate(){
        System.out.println("Bank Account Validate.");
        return true;
    }
}


class DebitCardProxy {
    SavingAccount account;

    void debit(){
        if(account==null){
            account=new SavingAccount();
        }

        if(account.validate()==false) return;

        account.debit();
    }
}



 class BankProxyMain {
    public static void main(String[] args) {
        DebitCardProxy card= new DebitCardProxy();
        card.debit();
    }
}
