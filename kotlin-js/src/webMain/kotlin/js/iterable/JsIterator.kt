package js.iterable

import js.array.ReadonlyArray
import js.disposable.Disposable
import js.iterable.internal.iteratorFromJsIteratorLike
import kotlin.js.JsAny
import kotlin.js.JsName

@JsName("Iterator")
abstract external class JsIterator<out T : JsAny?> :
    JsIteratorLike<T>,
    JsIterable<T>,
    Disposable {

    fun drop(n: Int): JsIterator<T>
    fun every(predicate: (T) -> Boolean): Boolean
    fun filter(predicate: (T) -> Boolean): JsIterator<T>
    fun find(predicate: (T) -> Boolean): T?

    fun <R : JsAny?> flatMap(transform: (T) -> JsIterable<R>): JsIterator<R>
    fun <R : JsAny?> flatMap(transform: (T) -> ReadonlyArray<R>): JsIterator<R>
    fun forEach(action: (item: T) -> Unit)
    fun <R : JsAny?> map(transform: (T) -> R): JsIterator<R>

    // fun reduce()
    fun some(predicate: (T) -> Boolean): Boolean
    fun take(n: Int): JsIterator<T>
    // fun toArray(): ReadonlyArray<T>

    companion object {
        fun <T : JsAny?> from(source: JsIteratorLike<T>): JsIterator<T>
        fun <T : JsAny?> from(source: JsIterable<T>): JsIterator<T>
    }
}

inline fun <T : JsAny?> JsIterator<T>.iterator(): Iterator<T> =
    iteratorFromJsIteratorLike(this)
