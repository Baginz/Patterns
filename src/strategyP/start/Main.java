package strategyP.start;

import strategyP.auth.UserChecker;
import java.io.File;
import strategyP.strategy.DBAuth;
import strategyP.strategy.FileAuth;


public class Main {

    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();
        
        userChecker.check(new DBAuth("jdbc://etc"));
        
        userChecker.check(new FileAuth(new File("c:\\file.txt")));
        
    }
}
