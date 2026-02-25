package react

external interface RefObject<T : Any> :
    Ref<T> {
    var current: T?
}
