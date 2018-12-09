def lpad(str: String, len: Int, pad: String): String = {
    if(str.length>len) return str.substring(0,len);
    var numToAdd =  (len-str.length)/pad.length;
    var res = str;
    while(numToAdd>0){
        res = pad + res;
        numToAdd = numToAdd - 1;
    }
    pad.substring(0,(len-str.length)%pad.length)+res
}