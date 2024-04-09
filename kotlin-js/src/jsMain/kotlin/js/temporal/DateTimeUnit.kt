package js.temporal

sealed external interface DateTimeUnit<T : DateTimeUnit<T>> :
    LargestUnit<T>,
    SmallestUnit<T>,
    TotalUnit<T>
