package com.example.lesson

class Worker {
    private lateinit var name: String;
    private var age: Int = 0;
    private var salary: Int = 0;

    fun setName(newName: String){
        this.name = newName;
    }
    fun setAge(newAge: Int){
        this.age = newAge;
    }
    fun setSalary(newSalary: Int){
        this.salary = newSalary;
    }
    fun getName(): String{
        return this.name;
    }
    fun getAge(): Int{
        return this.age;
    }
    fun getSalary(): Int{
        return this.salary;
    }
}