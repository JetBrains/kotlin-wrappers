package js.collections

external interface MutableSetLike<T> : ReadonlySet<T> {
    fun add(value: T): MutableSetLike<T>
    fun clear()
    fun delete(value: T)
}
