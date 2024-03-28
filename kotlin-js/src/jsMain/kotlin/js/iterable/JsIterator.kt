package js.iterable

@JsName("Iterator")
abstract external class JsIterator<out T> :
    JsIteratorLike<T> {
    companion object {
        fun <T> from(source: JsIteratorLike<T>): JsIterator<T>
        fun <T> from(source: JsIterable<T>): JsIterator<T>
    }
}
