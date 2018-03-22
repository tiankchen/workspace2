package javacore;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {
    public static void main(String args[]) {

        Class cl = ReflectionTest.class;

        Method[] methods = cl.getDeclaredMethods();
        for (Method m : methods) {
            String modifiers = Modifier.toString(m.getModifiers());
            System.out.println(modifiers + ">>");
        }
    }

    public static void publicMethod() {
    }

    private void privateMethod() {
    }

    void privateMethod1(){

    }
}


