fun main(){
    var arr: Array<Int> = arrayOf(3, 6, 7, 9, 15, 36, 50, 67, 90);
    var number: Int =16;
    var ind: Int = 0;
    var nxt: Int = 0;
    while(ind < arr.size){
        var mid: Int = arr.size/2;
        if(arr.size == 1){
            break;
        }else if(number == arr[mid]) {
            nxt = arr[mid];
            break;
        }else if(number < arr[mid]){
            arr = arr.copyOfRange(0, mid);
            ind = 0;
        }else if(number > arr[mid]){
            arr = arr.copyOfRange(mid, arr.size);
            ind = 0;
        }
    }
    if (nxt != 0) {
        println(nxt)
    } else if (number == arr[0]) {
        println(arr[0])
    } else {
        println("No")
    }
}