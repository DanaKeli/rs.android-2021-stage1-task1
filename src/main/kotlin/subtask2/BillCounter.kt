package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val correctSum = bill.filter { it != bill[k] }.sum() / 2
        return if (correctSum == b) "Bon Appetit" else "${b - correctSum}"
    }
}
