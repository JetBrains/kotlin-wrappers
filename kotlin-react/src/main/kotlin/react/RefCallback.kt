package react

external interface RefCallback<T> : Ref {
    fun create(value: T?)
}
