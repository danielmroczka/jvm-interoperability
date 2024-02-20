package com.dm.labs.lib.java;

import com.labs.dm.lib.groovy.GroovyLib;
import com.dm.labs.lib.kotlin.KotlinLib;
import com.dm.labs.lib.scala.ScalaLib;

public class Main {
    public static void main(String[] args) {

        KotlinLib kotlinLib = new KotlinLib();
        kotlinLib.add(1, 2);

        JavaLib javaLib = new JavaLib();
        javaLib.subb(10, 2);

        ScalaLib scalaLib = new ScalaLib();
        scalaLib.div(20, 5);

        GroovyLib groovyLib = new GroovyLib();
        groovyLib.multiply(10, 2);

        System.out.println("Hello world!");
        System.out.println(groovyLib.multiply(2,3));
    }
}