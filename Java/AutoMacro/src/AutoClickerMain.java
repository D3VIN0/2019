import autoitx4java.AutoItX;
import com.jacob.com.LibraryLoader;
import java.lang.*;

import java.io.File;


public class AutoClickerMain {
    AutoItX x = new AutoItX();
    x.winActivate("Windows Security");
    x.winWaitActive("Windows Security");
    Thread.sleep(3000);
    x.send("\'domain\\username\'");
    x.send("{TAB}");
    x.send("password");
    Thread.sleep(3000);
    x.send("{ENTER}");
}
