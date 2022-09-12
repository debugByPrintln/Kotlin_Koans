data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    //"operator" keyword in this case is optional
    override operator fun compareTo(other: MyDate): Int {
        return (year*365+month*30+dayOfMonth)-(other.year*365+other.month*30+other.dayOfMonth)
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
