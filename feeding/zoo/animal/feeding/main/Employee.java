package zoo.animal.feeding.main;

import zoo.animal.feeding.annotation.ValidAnnotationType;
import zoo.animal.feeding.annotation.WorkOut;

@ValidAnnotationType(size = Size.MEDIUM,classType = String.class,workout = @WorkOut(hoursPerDay = 20,startHour = 10))
public class Employee {

    private String name;
    private int employeeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

}
