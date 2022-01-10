package com.example.lesson

fun main() {

    var firstNum = Fraction(92382, 7603U);
    println(firstNum.plus());
    println(firstNum.minus());
    println(firstNum.divide());
    println(firstNum.multiply());
    println(firstNum.equals());

    println()

    var first = Worker();
    first.setName("Сергазы");
    first.setAge(25);
    first.setSalary(1000);
    var second = Worker();
    second.setName("Еламан");
    second.setAge(26);
    second.setSalary(2000);

    println("${first.getName()}\n${first.getAge()}\n${first.getSalary()}");
    println("${second.getName()}\n${second.getAge()}\n${second.getSalary()}");
}