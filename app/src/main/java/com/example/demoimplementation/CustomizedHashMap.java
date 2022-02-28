package com.example.demoimplementation;

import java.util.Comparator;
import java.util.Map;
//primitive types , originally designed for speed, that do not behave as objects.
// The primitive types exist either as local variables on the stack,
// or as fields (static or not) of objects.
//In Java, objects are always allocated on the heap :
// if you have a local variable that seems an object,
// then the object itself is allocated on the heap and
// the stack contains only a reference, i.e. an additional
// hidden type that is able to reference, point to, heap memory .
// Important to note that NOT to stack memory .
// As a result of this fact, you cannot dereference a
// primitive type because you cannot create a reference to something
// different than an object, primitive types are not objects.
public class CustomizedHashMap implements Comparator<Map.Entry<String,AcknowledgeAlertModel>> {
    @Override
    public int compare(Map.Entry<String, AcknowledgeAlertModel> o1,
                       Map.Entry<String, AcknowledgeAlertModel> o2) {
        int o11=(int) o1.getValue().getPriority();
        int o22=(int) o2.getValue().getPriority();
        return  o11.compareTo(o22);
    }
}
