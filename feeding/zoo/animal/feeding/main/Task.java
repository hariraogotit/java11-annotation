package zoo.animal.feeding.main;

import zoo.animal.feeding.annotation.BadAnnotaion;
import zoo.animal.feeding.annotation.Excercise;
import zoo.animal.feeding.annotation.WorkOut;

@Excercise
public class Task {

    @BadAnnotaion
    public static final String CONSTANT_FROM_ANNOTATION_CAN_BE_USED_LIKE_OTHER_CONSTANTS = BadAnnotaion.AUDI;

    public static void main(String[] args) {
        System.out.println("I am the first module");
    }

    @WorkOut(startHour = 10,hoursPerDay = 20)
    public void random(){
        System.out.println("Passes mandatory element");
    }

    @WorkOut(hoursPerDay = 20,startHour = 5)
    public void optionalRandom(){
        System.out.println("Passes mandatory and optional element");
    }

}
