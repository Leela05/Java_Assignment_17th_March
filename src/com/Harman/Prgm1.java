/*
. Create an abstract class 'Parent' with a method 'message'.
It has two subclasses each having a method with the same name 'message'
that prints "This is first subclass" and "This is second subclass" respectively.
Call the methods 'message' by creating an object for each subclass.
 */

package com.Harman;

abstract class Parent{
    abstract void method();
}
class Child extends Parent{
    void method(){
        System.out.println("This is first subclass");

    }
}
class Child1 extends Parent{
    void method(){
        System.out.println("This is second subclass");
    }
}
class Main{
    public static void main(String[] args) {
            Parent obj=new Child();
            Parent obj1=new Child1();
            obj.method();
            obj1.method();
    }
}


