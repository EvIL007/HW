fun main(){
    var a = 5;
    var b = 7;
    // 1 способ

//    var c = a;
//    a = b;
//    b = c;
//    println(a);
//    println(b);

    // 2 способ третьей переменной
    a = a + b;
    b = a - b;
    a = a - b;
    println(a);
    println(b);
}