package zoo.animal.feeding.annotation;


public @interface ApplyingAnnotation {

    /**
     * Annotations can be applied to
     * 1. Classes (including Anonymous), Interface (Including Anonymous), Enums and Modules ( @Todo need to find an example for applying on Modules, anonymous class and interface)
     * 2. Variables - Static, Instance and Local
     * 3. Methods and Constructors
     * 4. Method, Constructor and Lambda Parameters (but for Lambda parameter the type should be declared)
     * 5. Cast Expressions
     * 6. Other annotations
     */
}
