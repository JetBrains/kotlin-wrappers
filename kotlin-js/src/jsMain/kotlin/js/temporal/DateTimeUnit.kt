package js.temporal

sealed external interface DateTimeUnit<out T : DateTimeUnit<T>> :
    LargestUnit<T>,
    SmallestUnit<T>,
    TotalUnit<T>
