package kotlinx.js

/** ES6 Iterator type. */
sealed external interface JsIterator<out T> {
    fun next(): Result<T, Void>

    sealed interface Result<out T, out TReturn> {
        val done: Boolean
    }

    sealed interface YieldResult<TYield> : Result<TYield, Void> {
        val value: TYield
    }

    sealed interface ReturnResult<TReturn> : Result<Void, TReturn> {
        val value: TReturn
    }
}

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
