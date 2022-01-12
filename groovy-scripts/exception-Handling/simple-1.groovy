#!/usr/bin/env groovy
try {
a = "Rama"
    println(a)
} catch(groovy.lang.MissingPropertyException ex ) {
    println("Entering to exception")
    println("Sri Sita")
    //println(a)
}