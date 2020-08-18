package zoo.animal.feeding.annotation;

public @interface WorkOut {

    int hoursPerDay();
    int startHour() default 6;
}
