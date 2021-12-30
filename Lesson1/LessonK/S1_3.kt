fun main(){
    val arr: Array<Int> = arrayOf(6, 5, 0, 1, 4, 9, 15, 3);
    var i: Int = 0;
    var k: Int = 0;
    var l: Int = arr.size-1;
    while(k < arr.size/2){
    while(i < arr.size-1){
        if(arr[i] > arr[i+1]){
            var x: Int = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = x;
        }
        i++;
    }
    while(l >= 1){
        if(arr[l] < arr[l-1]){
            var x: Int = arr[l];
            arr[l] = arr[l-1];
            arr[l-1] = x;
        }
        l--;
    }
        k++;
        l = arr.size-1;
        i = 0;
    }
    for(j in arr.indices){
        println("${arr[j]}");
    }
}