package js.iterable

import js.array.ReadonlyArray

@JsName("Iterator")
abstract external class JsIterator<out T> :
    JsIteratorLike<T> {

    fun drop(n: Int): JsIterator<T>
    fun every(predicate: (T) -> Boolean): Boolean
    fun filter(predicate: (T) -> Boolean): JsIterator<T>
    fun find(predicate: (T) -> Boolean): T?

    fun <R> flatMap(transform: (T) -> JsIterable<R>): JsIterator<R>
    fun <R> flatMap(transform: (T) -> ReadonlyArray<R>): JsIterator<R>
    fun forEach(action: (item: T) -> Unit)
    fun <R> map(transform: (T) -> R): JsIterator<R>

    // fun reduce()
    fun some(predicate: (T) -> Boolean): Boolean
    fun take(n: Int): JsIterator<T>
    // fun toArray(): ReadonlyArray<T>

    companion object {
        fun <T> from(source: JsIteratorLike<T>): JsIterator<T>
        fun <T> from(source: JsIterable<T>): JsIterator<T>
    }
}
