def repeat(str: String, n: int) : String = {
	var hold = "
	for(i <- 0 until n){
		hold = hold + str
	}
	return hold
}