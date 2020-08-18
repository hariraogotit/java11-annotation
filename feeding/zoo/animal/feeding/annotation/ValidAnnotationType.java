package zoo.animal.feeding.annotation;


import zoo.animal.feeding.main.Size;

public @interface ValidAnnotationType {

    /**
     * Valid annotation types are
     * 1. Primitive
     * 2. String
     * 3. Class
     * 4. Enum
     * 5. Another annotation
     * 6. An array of any of these types
     */

    //Integer height(); - Not valid
    //String[][] generalInfo(); - Not valid
    Size size() default Size.LARGE;
    //Employee employee(); - Not valid as this is not a Class type
    Class<String> classType();
    WorkOut workout() default @WorkOut(hoursPerDay = 20);


}
