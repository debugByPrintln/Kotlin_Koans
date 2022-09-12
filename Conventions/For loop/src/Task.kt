class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate>{
            var cur : MyDate = start

            override fun hasNext(): Boolean {
                return cur <= end
            }
            override fun next(): MyDate {
                val tmp = cur
                cur = cur.followingDate()
                return tmp
            }
        }
    }

}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}