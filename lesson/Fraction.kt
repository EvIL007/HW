package com.example.lesson

class Fraction constructor(firstNumber: Long, secondNumber: UShort){

    var num1 = firstNumber;
    var num2 = secondNumber;

    fun plus(): Long{
        return this.num1 + this.num2.toLong();
    }
    fun minus(): Long{
        return this.num1 - this.num2.toLong();
    }
    fun divide(): Long{
        return this.num1 / this.num2.toLong();
    }
    fun multiply(): Long{
        return this.num1 * this.num2.toLong();
    }
    fun equals(): Boolean{
        return this.num1 == this.num2.toLong();
    }

}
