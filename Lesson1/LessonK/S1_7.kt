fun main() {
    val arr1: Array<Int> = arrayOf(6, 5, 0, 1, 4, 9, 15, 3);
    val arr2: Array<Int> = arrayOf(7, 3, 60, 51, 9, 9, 25, 36);
    var list: ArrayList<Int> = arrayListOf();
    var a: Int = 0;
    while (a < arr1.size){
        list.add(a, arr1[a]+arr2[a]);
        a++;
    }
    println(list);
    var max: Int = list.get(0);
    var min: Int = list.get(0);
    var sum: Int = 0;
    a = 0;
    while (a < list.size){
        if(list.get(a) > max){
            max = list.get(a);
        }
        if(list.get(a) < min){
            min = list.get(a);
        }
        sum += list.get(a);
        a++;
    }
    sum /= list.size;

    println(max);
    println(min);
    println(sum);
}