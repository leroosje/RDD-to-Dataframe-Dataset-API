def lastday(str: String) : String = {
	if(str(5) == '1' && (str(6) == '2' || str(6) == '0')) return str.substring(0,8) + "31"
	if(str(6) == '1' || str(6) == '3' || str(6) == '5' || str(6) == '7' || str(6) == '8')) return str.substring(0,8) + "31"
	if(str(6) == '2')return str.substring(0,8) + "28"
	return str.substring(0,8) + "30"
}