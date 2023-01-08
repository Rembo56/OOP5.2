package Drivers;
import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Drivers.ErrorLisenseException;

public class CheckDriver {
    public void checkLis(Driver driver){
        try {
            driver.checkLisense();

        } catch (ErrorLisenseException e) {
            throw new RuntimeException(e);
        }
    }
}
