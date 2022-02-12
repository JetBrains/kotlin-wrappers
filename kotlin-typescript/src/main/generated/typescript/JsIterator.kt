// Automatically generated - do not modify!

package typescript

sealed external interface JsIteratorResult<out T> {
    val value: T
    val done: Boolean
}

/** ES6 Iterator type. */
sealed external interface JsIterator<out T> {
    fun next(): JsIteratorResult<T>
}

operator fun <T> JsIterator<T>.iterator(): Iterator<T> =
    JsIteratorAdapter(this)

private class JsIteratorAdapter<T>(
    private val source: JsIterator<T>,
) : Iterator<T> {
    private var lastResult = source.next()

    override fun next(): T {
        check(!lastResult.done)
        val value = lastResult.value

        lastResult = source.next()
        return value
    }

    override fun hasNext(): Boolean =
        !lastResult.done
}
