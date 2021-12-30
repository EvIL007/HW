fun main(){
    val arr = IntArray(10);
    var a: Int = 0;
    while (a < arr.size){
        var b: Int = (Math.random()*15).toInt()
        if(b > 7 && b < 14){
            arr[a] = b;
            a++;
        }
    }
    var newArr: ArrayList<Int> = arrayListOf();
    var ind: Int = 0;
    for(i in arr.indices){
        if(arr[i] > 10){
            newArr.add(ind, arr[i]);
            ind++;
        }
    }
    for(i in newArr.indices){
        newArr.set(i, newArr.get(i)-10);
    }
    for(j in newArr.indices){
        println("${newArr.get(j)}");
    }

}