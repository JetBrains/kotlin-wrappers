package react

sealed external interface RefObject<T : Any> :
    Ref<T> {
    val current: T?
}
