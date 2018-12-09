def rtrim(str: String) = {
    var (s, e) = (0, str.size-1)
    while (s < e && str(e) == ' ') e -= 1
    str.substring(s, e+1)
}