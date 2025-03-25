import com.devgen.banking.model.Account;
import com.devgen.banking.model.CurrentAccount;
import com.devgen.banking.model.SavingAccount;

public class BankingClient {
    public static void main(String[] args) {

    Account savingAccountaccount = new SavingAccount(123456,500);
        System.out.println("Account : "+ savingAccountaccount.getAccountNo() +" Account No : "+ savingAccountaccount.getBalance()+" Account Type : "+ savingAccountaccount.getAccountType());

     Account currentAccount = new CurrentAccount(51422,2000);

     CurrentAccount currentAccountRef = (CurrentAccount) currentAccount;
     
        System.out.println("Account : "+ savingAccountaccount.getAccountNo() +" Account No : "+ savingAccountaccount.getBalance()+" Account Type : "+ savingAccountaccount.getAccountType()+
                " Overdraft Limit : "+currentAccountRef.getOverdraftLimit());
    }
}
