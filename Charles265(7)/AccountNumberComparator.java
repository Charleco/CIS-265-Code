package Charles265;
import java.util.*;
public class AccountNumberComparator implements  Comparator<BankAccount>{
    public int compare(BankAccount a1, BankAccount a2)
    {
        if(a1.accntnmbr<a2.accntnmbr)
        {
            return 1;
        }
        else if(a1.accntnmbr==a2.accntnmbr)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
}
