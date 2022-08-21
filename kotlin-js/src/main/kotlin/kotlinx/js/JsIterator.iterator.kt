package kotlinx.js

operator fun <T> JsIterator<T>.iterator(): Iterator<T> =
    JsIteratorAdapter(this)

private class JsIteratorAdapter<T>(
    private val source: JsIterator<T>,
) : Iterator<T> {
    private var lastResult = source.next()

    override fun next(): T {
        check(!lastResult.done)
        val value = lastResult
            .unsafeCast<JsIterator.ReturnResult<T>>()
            .value

        lastResult = source.next()
        return value
    }

    override fun hasNext(): Boolean =
        !lastResult.done
}
