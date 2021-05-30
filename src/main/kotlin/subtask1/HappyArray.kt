package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
             if (sadArray.isEmpty()) {
            return IntArray(0)
        }
        var verySadArray = sadArray
        var isHappy: Boolean = false
        var result: IntArray = IntArray(0)

        while (!isHappy) {
            isHappy = true
            result = IntArray(verySadArray.size)
            result[0] = verySadArray[0]
            var currentSize = 1
            for (i in 1 until verySadArray.size - 1) {
                if (verySadArray[i] <= verySadArray[i - 1] + verySadArray[i + 1]) {
                    result[currentSize] = verySadArray[i]
                    currentSize++
                } else {
                    isHappy = false
                }
            }
            result[currentSize] = verySadArray[verySadArray.size - 1]
            currentSize++

            verySadArray = result.sliceArray(0 until currentSize)
        }
        return verySadArray
    }
}
