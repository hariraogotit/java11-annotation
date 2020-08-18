package zoo.animal.feeding.main;

import zoo.animal.feeding.annotation.ApplyingAnnotation;
import zoo.animal.feeding.annotation.BadAnnotaion;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

@ApplyingAnnotation
public class ApplyAnnotationHere {

    @ApplyingAnnotation
    interface ApplyOnMe{}
    @ApplyingAnnotation
    enum ApplySize {RUN, FUN}

    @ApplyingAnnotation
    public static final String CONST  = "CONST";
    @ApplyingAnnotation
    private String instance = "SomeInstanceVariable";

    private Function<String, String> stringSupplier = (@ApplyingAnnotation String firstName) -> firstName;

    @ApplyingAnnotation
    public  void methodOne(@ApplyingAnnotation String name){
        @ApplyingAnnotation
        int count = 0;
    }

    @ApplyingAnnotation
    ApplyAnnotationHere(@ApplyingAnnotation  int count){

    }

}
