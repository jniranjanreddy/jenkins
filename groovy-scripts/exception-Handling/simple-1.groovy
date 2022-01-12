#!/usr/bin/env groovy
try {
    a = "Rama"
    println(b)
} catch(groovy.lang.MissingPropertyException cd ) {
    def b = "Sita"
    println("Entering to exception!")
    println(b + "" + "and" + a)
    println(cd)
}
println("I am out of block")