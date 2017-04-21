package HumanResourceEjb;

import HrInterface.EmployeeI;
import HumanResourceManagementSystem.BeansHr.ProjectManager;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DANCO on 12/04/2017.
 */
@Stateless
public class ProjectManagerL implements EmployeeI {


    @Override
    public void workDetails() {

    }

    @Override
    public List EmployeeHistory() {
        ProjectManager p = new ProjectManager();
        p.setExperience("5 years");
        p.setDateOfIntake("11/11/11");
        p.setField("MANAGEMENT");
        p.setName("NJORO");
        List <ProjectManager> pr = new ArrayList<ProjectManager>();
        pr.add(p);
        return pr ;
    }
}
