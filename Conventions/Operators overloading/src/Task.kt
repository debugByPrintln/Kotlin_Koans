import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval) : MyDate {
    when(timeInterval){
        DAY -> return addTimeIntervals(DAY, 1)
        WEEK -> return addTimeIntervals(WEEK, 1)
        YEAR -> return addTimeIntervals(YEAR, 1)
        else -> throw UnsupportedOperationException("NET TAKOGO INTERVALA!")
    }
}

class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)

operator fun TimeInterval.times(number: Int) : RepeatedTimeInterval {
    return RepeatedTimeInterval(this, number)
}

operator fun MyDate.plus(timeIntervals: RepeatedTimeInterval) : MyDate {
    when(timeIntervals.timeInterval){
        DAY -> return addTimeIntervals(DAY, timeIntervals.number)
        WEEK -> return addTimeIntervals(WEEK, timeIntervals.number)
        YEAR -> return addTimeIntervals(YEAR, timeIntervals.number)
        else -> throw UnsupportedOperationException("NET TAKOGO INTERVALA!")
    }
}

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + (YEAR * 2) + (WEEK * 3) + (DAY * 5)
}
