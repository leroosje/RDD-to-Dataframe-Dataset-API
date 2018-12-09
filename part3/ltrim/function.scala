def ltrim(str: String) = {
    var (s, e) = (0, str.size)
    while (s < e && str(s) == ' ') s += 1
    str.substring(s, e)
}
