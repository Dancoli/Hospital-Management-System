package HumanResourceManagementSystem.BeansHr;

/**
 * Created by DANCO on 12/04/2017.
 */
public class Employee {
    String results;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return Field;
    }

    public void setField(String field) {
        Field = field;
    }

    public String getDateOfIntake() {
        return dateOfIntake;
    }

    public void setDateOfIntake(String dateOfIntake) {
        this.dateOfIntake = dateOfIntake;
    }

    String name;
    String Field;
    String dateOfIntake;
    public String Questions(){

        return results;
    }
    public boolean InsertData(){



        return true;
    }
}
