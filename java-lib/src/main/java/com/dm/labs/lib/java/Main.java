package com.dm.labs.lib.java;

//import com.dm.labs.lib.groovy.GroovyLib;
//import com.dm.labs.lib.com.dm.labs.lib.kotlin.KotlinLib;
//import com.dm.labs.lib.scala.ScalaLib;

public class Main {
    public static void main(String[] args) {

      //  KotlinLib kotlinLib = new KotlinLib();
//        kotlinLib.add(1, 2);

        JavaLib javaLib = new JavaLib();
        javaLib.subb(10, 2);

        com.dm.labs.lib.scala.ScalaLib scalaLib = new  com.dm.labs.lib.scala.ScalaLib();
//        scalaLib.div(20, 5);
//
      com.dm.labs.lib.groovy.GroovyLib groovyLib = new com.dm.labs.lib.groovy.GroovyLib();
//        groovyLib.multiply(10, 2);

        System.out.println("Hello world!");
        //System.out.println(groovyLib.multiply(2,3));
    }
}