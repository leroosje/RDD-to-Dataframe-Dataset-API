def reverse(str: String) : String = {
	var ret = ""
	var i = str.size - 1
	while(i >= 0){
		ret += str(i)
		i = i - 1
	}
	return ret
}