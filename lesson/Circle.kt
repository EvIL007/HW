package com.example.lesson

class Circle constructor(center: Double, radius: Double) : Figure() {


    override fun perimetr(radius: Double): Double {
        return radius * 2 * 3.14;
    }

    override fun area(radius: Double): Double {
        return radius * radius * 3.14;
    }

    fun check(x: Int, y: Int, radius: Double): Boolean{
        return (x * x) + (y * y) <= (radius * radius);
    }

}