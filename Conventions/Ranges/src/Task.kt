fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    val dateRange = first..last
    return date in dateRange
}
