package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var arr = emptyArray<String>()

        for (i in inputString.indices) {
            var a = 1
            when (inputString[i]) {
                '(' -> for (j in (i + 1) until inputString.length) {
                        if (inputString[j] == '(') a++
                        else if (inputString[j] == ')') a--
                    if (a == 0) {
                        arr += inputString.substring(i + 1 until j)
                        break
                    }
                }
                '[' -> for (k in (i + 1) until inputString.length) {
                    if (inputString[k] == '[') a++
                    else if (inputString[k] == ']') a--
                    if (a == 0) {
                        arr += inputString.substring(i + 1 until k)
                        break
                    }
                }
                '<' -> for (l in (i + 1) until inputString.length) {
                    if (inputString[l] == '<') a++
                    else if (inputString[l] == '>') a--
                    if (a == 0) {
                        arr += inputString.substring(i + 1 until l)
                        break
                    }
                }
            }
        }
        return arr
    }
}
