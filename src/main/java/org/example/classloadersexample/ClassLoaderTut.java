package org.example.classloadersexample;

public class ClassLoaderTut {
    public static void main(String[] args) {

        // 1. bootstrap classloader
        ClassLoader bootStrapClassLoader = String.class.getClassLoader();

        System.out.println("bootStrapClassLoader: " + bootStrapClassLoader);
        // The output is null because the bootstrap class loader has no parent class loader.

        // 2. Extension class loader
        ClassLoader extensionClassLoader = javax.crypto.Cipher.class.getClassLoader();

        System.out.println("extensionClassLoader: " + extensionClassLoader);


        // Get the Application Class Loader
        ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();

        // Load a class using the Application Class Loader
        try {
            Class<?> clazz = appClassLoader.loadClass("java.util.ArrayList");
            System.out.println("Loaded class: " + clazz.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}

/*
Rules for working with class loaders
1. Delegation::
The delegation model in Java allows for loading classes flexibly and dynamically at runtime. This is useful in environments where the class loading requirements are unknown at compile-time.
For instance, in an application server, different applications may need different versions of the same class. The class loader delegation model makes it possible to meet these requirements without causing conflicts.

2. Visibility:: Class loaders in Java can have varying levels of visibility, which determines their ability to find and load classes from other class loaders
    a. Parent-first visibility:: Default
    b. Child-first visibility:: this model is used when different version of class is need
    c. Hierarchical visibility::  Each class loader has its own classpath, and classes loaded by a child class loader are not visible to parent class loaders. This model is useful to isolate different parts of an application from each other.

3. Uniqueness

it is recommended to use a single class loader to load classes whenever possible. When multiple class loaders are used, take extra care to ensure that objects are not passed between classes with different namespaces.
 */

/*
Methods in ClassLoader
1. findClass(String name)
2. getClass(String name)
3. getParent()
4. getResource(String name)
5. setDefaultAssertionStatus(boolean enabled)
 */
