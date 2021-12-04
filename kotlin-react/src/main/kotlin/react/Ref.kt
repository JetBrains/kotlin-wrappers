package react

// Refs (16.3+)
sealed external interface Ref<in T : Any>

external interface RefObject<T : Any> : Ref<T> {
    val current: T?
}

external interface MutableRefObject<T : Any> : RefObject<T> {
    override var current: T?
}
