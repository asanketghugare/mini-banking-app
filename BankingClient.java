import com.devgen.banking.model.Account;
import com.devgen.banking.model.SavingAccount;

public class BankingClient {
    public static void main(String[] args) {

    Account account = new SavingAccount(123456,500);
        System.out.println(account.getAccountNo() +" "+ account.getBalance()+" "+account.getAccountType());


    }
}
