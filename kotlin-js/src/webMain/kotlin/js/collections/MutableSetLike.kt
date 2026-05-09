package js.collections

external interface MutableSetLike<T : JsAny?> :
    ReadonlySet<T> {

    fun add(value: T)
    fun clear()
    fun delete(value: T): Boolean
}
