package zoo.animal.feeding.annotation;

public @interface BadAnnotaion {

    String AUDI ="AUDI";
   // String name() default new String(""); Does not compile because the element value should be a constant
    String address() default "";
   //  String title() default null; Does not compile because the element value should be a constant
    String make() default AUDI; // Constants can be declared and used
}
