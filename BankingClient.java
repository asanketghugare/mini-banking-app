import com.devgen.banking.model.Account;
import com.devgen.banking.model.AccountType;
import com.devgen.banking.service.AccountService;

public class BankingClient {
    public static void main(String[] args) {

        AccountService accountService = new AccountService();
        Long accountNumber =accountService.createAccount(3000, AccountType.SAVING);

        Account account = accountService.getAccountNo(accountNumber);
        System.out.println("Account : "+ account.getAccountNo() +" Account No : "+ account.getBalance()+" Account Type : "+ account.getAccountType());


         accountNumber =accountService.createAccount(5000, AccountType.SAVING);

         account = accountService.getAccountNo(accountNumber);
        System.out.println("Account : "+ account.getAccountNo() +" Account No : "+ account.getBalance()+" Account Type : "+ account.getAccountType());


    }
}
