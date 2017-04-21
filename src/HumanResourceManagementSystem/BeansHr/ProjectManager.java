package HumanResourceManagementSystem.BeansHr;

/**
 * Created by DANCO on 12/04/2017.
 */
public class ProjectManager extends Employee {
    final long IdentificationNumber=0;

    public long getIdentificationNumber() {
        return IdentificationNumber;
    }

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }

    String Experience;

}
