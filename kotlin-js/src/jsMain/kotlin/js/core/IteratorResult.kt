package js.core

sealed external interface IteratorResult<out T, out TReturn> {
    val done: Boolean
}
