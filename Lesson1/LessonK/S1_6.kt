fun main() {
    var myList: ArrayList<Int> = arrayListOf();
    var a: Int = 0;
    while(a < 50){
        var b: Int = (Math.random()*100).toInt();
        if(!(b % 2 == 0)) {
            myList.add(a, b);
            a++;
        }
    }
    for(j in myList.indices){
        println("${myList.get(j)}");
    }
}