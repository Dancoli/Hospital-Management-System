package HumanResourceEjb;

import HrInterface.EmployeeI;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by DANCO on 12/04/2017.
 */
@Stateless
public class AccountantL implements EmployeeI {

    @Override
    public void workDetails() {

    }

    @Override
    public List EmployeeHistory() {
        return null;
    }
}
