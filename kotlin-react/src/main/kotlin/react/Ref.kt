package react

// Refs (16.3+)
sealed external interface Ref<in T : Any>

sealed external interface RefObject<T : Any> : Ref<T> {
    val current: T?
}

sealed external interface MutableRefObject<T : Any> : RefObject<T> {
    override var current: T?
}
