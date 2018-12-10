def concat(arg: Array[String]) : String = {
	var ret = ""
	for(i <- 0 until args.size){
		ret = ret + args(i)
	}
	return ret
}