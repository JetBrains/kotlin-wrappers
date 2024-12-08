package react

sealed external interface MutableRefObject<T : Any> :
    RefObject<T> {
    override var current: T?
}
