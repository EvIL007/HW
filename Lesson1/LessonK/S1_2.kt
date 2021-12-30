fun main(){
    val arr: Array<Int> = arrayOf(6, 5, 0, 1, 4, 9, 15, 3);
    var i: Int = 0;
    var l: Int = 0;
    while(l < arr.size-1){
        while(i < arr.size-1){
            if(arr[i] > arr[i+1]){
                var x: Int = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = x;
            }
            i++;
        }
        l++;
        i = 0;
    }
    for(j in arr.indices){
        println("${arr[j]}");
    }
}