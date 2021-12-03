package react

// Refs (16.3+)
sealed external interface Ref<in T : Any>

typealias RefObject<T> = MutableRefObject<out T>

sealed external interface MutableRefObject<T : Any> : Ref<T> {
    var current: T?
}
